package com.jdbc.Repository;

import com.jdbc.dto.PetDTO;

import java.util.List;

public interface PetRepository {

    boolean addPet(PetDTO pet);

    PetDTO getPetById(int id);

    boolean updatePet(PetDTO pet);

    boolean deletePet(int id);

    List<PetDTO> getAllPets();

    PetDTO getPetByEmail(String email);

}