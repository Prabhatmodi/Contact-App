package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Contact;

public interface ContactService {
    public boolean saveContact(Contact contact);
    
    public List<Contact> getAllContacts();
    
    public Contact getContactsById(Integer ContactId);
    
    public boolean deleteContactById(Integer ContactId);
}
