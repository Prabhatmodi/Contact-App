package in.ashokit.rest;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact,Integer> {

}
