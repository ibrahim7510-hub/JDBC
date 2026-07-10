package com.jdbc.dto;
public class PetDTO {

    private int id;
    private String ownerName;
    private String gender;
    private String city;
    private String state;
    private String mobileNumber;
    private String emailId;
    private int petId;
    private String petName;
    private String petDateOfBirth;
    private String petGender;
    private String petType;

    public PetDTO() {
    }
    public PetDTO(int id, String ownerName, String gender, String city,
                  String state, String mobileNumber, String emailId,
                  int petId, String petName, String petDateOfBirth,
                  String petGender, String petType) {
        this.id = id;
        this.ownerName = ownerName;
        this.gender = gender;
        this.city = city;
        this.state = state;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.petId = petId;
        this.petName = petName;
        this.petDateOfBirth = petDateOfBirth;
        this.petGender = petGender;
        this.petType = petType;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public int getPetId() {
        return petId;
    }
    public void setPetId(int petId) {
        this.petId = petId;
    }
    public String getPetName() {
        return petName;
    }
    public void setPetName(String petName) {
        this.petName = petName;
    }
    public String getPetDateOfBirth() {
        return petDateOfBirth;
    }
    public void setPetDateOfBirth(String petDateOfBirth) {
        this.petDateOfBirth = petDateOfBirth;
    }
    public String getPetGender() {
        return petGender;
    }
    public void setPetGender(String petGender) {
        this.petGender = petGender;
    }
    public String getPetType() {
        return petType;
    }
    public void setPetType(String petType) {
        this.petType = petType;
    }
    @Override
    public String toString() {
        return "PetDTO{" +
                "id=" + id +
                ", ownerName='" + ownerName + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", emailId='" + emailId + '\'' +
                ", petId=" + petId +
                ", petName='" + petName + '\'' +
                ", petDateOfBirth='" + petDateOfBirth + '\'' +
                ", petGender='" + petGender + '\'' +
                ", petType='" + petType + '\'' +
                '}';
    }
}