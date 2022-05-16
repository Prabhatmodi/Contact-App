package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Contact;
import in.ashokit.rest.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
     private ContactRepository contactRepo;
	@Override
	public boolean saveContact(Contact contact) {
		contact.setActiveSw("Y");
		Contact status=contactRepo.save(contact);
		if(status.getContactId()!=null) {
			return true;
		}
		return false;
	}

	@Override
	public List<Contact> getAllContacts() {
		return contactRepo.findAll();
		
	}

	@Override
	public Contact getContactsById(Integer ContactId) {
		Optional<Contact>findById=contactRepo.findById(ContactId);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public boolean deleteContactById(Integer ContactId) {
		Optional<Contact>findById=contactRepo.findById(ContactId);
		if(findById.isPresent()) {
			Contact contact=findById.get();
			contact.setActiveSw("N");
			contactRepo.save(contact);
			return true;
		}
		return false;
	}

}
