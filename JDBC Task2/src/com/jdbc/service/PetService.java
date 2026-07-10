package com.jdbc.service;

import com.jdbc.dto.PetDTO;

import java.util.List;

public interface PetService {

    boolean addPet(PetDTO pet);

    PetDTO getPetById(int id);

    boolean updatePet(PetDTO pet);

    boolean deletePet(int id);

    List<PetDTO> getAllPets();

    PetDTO getPetByEmail(String email);

}
