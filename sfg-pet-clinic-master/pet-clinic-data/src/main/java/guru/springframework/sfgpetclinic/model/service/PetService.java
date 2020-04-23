package guru.springframework.sfgpetclinic.model.service;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.*;

public interface PetService {

	Pet findById();

	Pet save(Pet pet);

	Set<Pet> findAll();

}
