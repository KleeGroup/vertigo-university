package io.mars.hr.services.person;

import javax.inject.Inject;

import io.mars.fileinfo.FileInfoStd;
import io.mars.fileinfo.FileInfoTmp;
import io.mars.hr.dao.PersonDAO;
import io.mars.hr.domain.Person;
import io.vertigo.commons.transaction.Transactional;
import io.vertigo.core.component.Activeable;
import io.vertigo.core.component.Component;
import io.vertigo.dynamo.criteria.Criterions;
import io.vertigo.dynamo.domain.model.DtList;
import io.vertigo.dynamo.domain.model.DtListState;
import io.vertigo.dynamo.domain.model.FileInfoURI;
import io.vertigo.dynamo.file.FileManager;
import io.vertigo.dynamo.file.metamodel.FileInfoDefinition;
import io.vertigo.dynamo.file.model.FileInfo;
import io.vertigo.dynamo.file.model.VFile;
import io.vertigo.dynamo.store.StoreManager;

@Transactional
public class PersonServices implements Component, Activeable {

	@Inject
	private PersonDAO personDAO;

	@Inject
	private StoreManager storeManager;

	@Inject
	private FileManager fileManager;

	private VFile defaultPhoto;

	@Override
	public void start() {
		defaultPhoto = fileManager.createFile(
				"defaultPhoto.png",
				"image/png",
				PersonServices.class.getResource("/defaultPhoto.png"));
	}

	@Override
	public void stop() {
		//rien
	}

	public Person getPerson(final Long personId) {
		return personDAO.get(personId);
	}

	public void updatePerson(final Person person) {
		personDAO.update(person);
	}

	public Person createPerson(final Person person) {
		return personDAO.create(person);
	}

	public Person initPerson() {
		return new Person();
	}

	public DtList<Person> getPersons(final DtListState dtListState) {
		return personDAO.findAll(Criterions.alwaysTrue(), dtListState.getMaxRows().orElse(50));
	}

	public VFile getPersonPicture(final Long fileId) {
		//apply security check
		if (fileId == null) {
			return defaultPhoto;
		}
		return storeManager.getFileStore().read(toFileInfoStdURI(fileId)).getVFile();
	}

	public void savePersonPicture(final Long personId, final FileInfoURI personPictureTmp) {
		final Person person = getPerson(personId);
		//apply security check
		final Long oldPicture = person.getPicturefileId();
		final VFile fileTmp = getPictureTmp(personPictureTmp);
		final FileInfo fileInfo = storeManager.getFileStore().create(new FileInfoStd(fileTmp));
		person.setPicturefileId((Long) fileInfo.getURI().getKey());
		updatePerson(person);
		if (oldPicture != null) {
			storeManager.getFileStore().delete(toFileInfoStdURI(oldPicture));
		}
	}

	public FileInfoURI savePictureTmp(final VFile personPicture) {
		//apply security check
		final FileInfo fileInfo = storeManager.getFileStore().create(new FileInfoTmp(personPicture));
		return fileInfo.getURI();
	}

	private VFile getPictureTmp(final FileInfoURI personPictureTmp) {
		//apply security check
		return storeManager.getFileStore().read(personPictureTmp).getVFile();
	}

	private FileInfoURI toFileInfoStdURI(final Long fileId) {
		return new FileInfoURI(FileInfoDefinition.findFileInfoDefinition(FileInfoStd.class), fileId);
	}
}