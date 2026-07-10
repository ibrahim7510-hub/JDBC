package com.jdbc.service.impl;

import com.jdbc.dto.PetDTO;
import com.jdbc.Repository.PetRepository;
import com.jdbc.Repository.Repositoryimpl.PetRepositoryImpl;
import com.jdbc.service.PetService;

import java.util.List;

public class PetServiceImpl implements PetService {

    private PetRepository repository = new PetRepositoryImpl();

    @Override
    public boolean addPet(PetDTO pet) {
        return repository.addPet(pet);
    }

    @Override
    public PetDTO getPetById(int id) {
        return repository.getPetById(id);
    }

    @Override
    public boolean updatePet(PetDTO pet) {
        return repository.updatePet(pet);
    }

    @Override
    public boolean deletePet(int id) {
        return repository.deletePet(id);
    }

    @Override
    public List<PetDTO> getAllPets() {
        return repository.getAllPets();
    }

    @Override
    public PetDTO getPetByEmail(String email) {
        return repository.getPetByEmail(email);
    }
}