package guru.springframework.sfgpetclinic.model.service;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.*;

public interface VetService {

	Vet findById();

	Vet save(Vet vet);

	Set<Vet> findAll();
	
}
