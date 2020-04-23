package guru.springframework.sfgpetclinic.model.service;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Owner;

public interface OwnerService {

	Owner findById();
	
	Owner save(Owner owner);
	
	Owner findByLastName(String lastname);
	
	Set<Owner> findAll();
	
}
