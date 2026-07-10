package com.jdbc.Repository.Repositoryimpl;

import com.jdbc.connection.DBConnectionUtil;
import com.jdbc.dto.PetDTO;
import com.jdbc.Repository.PetRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PetRepositoryImpl implements PetRepository {

    @Override
    public boolean addPet(PetDTO pet) {

        String sql = "INSERT INTO pets VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            Connection con = DBConnectionUtil.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, pet.getId());
            ps.setString(2, pet.getOwnerName());
            ps.setString(3, pet.getGender());
            ps.setString(4, pet.getCity());
            ps.setString(5, pet.getState());
            ps.setString(6, pet.getMobileNumber());
            ps.setString(7, pet.getEmailId());
            ps.setInt(8, pet.getPetId());
            ps.setString(9, pet.getPetName());
            ps.setString(10, pet.getPetDateOfBirth());
            ps.setString(11, pet.getPetGender());
            ps.setString(12, pet.getPetType());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public PetDTO getPetById(int id) {
        return null;
    }

    @Override
    public boolean updatePet(PetDTO pet) {
        return false;
    }

    @Override
    public boolean deletePet(int id) {
        return false;
    }

    @Override
    public List<PetDTO> getAllPets() {
        return new ArrayList<>();
    }

    @Override
    public PetDTO getPetByEmail(String email) {
        return null;
    }

}