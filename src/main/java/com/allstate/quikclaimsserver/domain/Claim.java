package com.allstate.quikclaimsserver.domain;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "quikclaimdata")
public class Claim {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String policyNumber;
    private String customerName;
    private String claimType;
    private Date claimDate;
    private Double estClaimAmt;
    private String address;
    private String vehicleMake;
    private String vehicleModel;
    private String vehicleYear;
    private String petType;
    private String petBreed;
    private String claimDescription;
    private String claimReason;
    private String claimStatus;
    private String imageURL;


    public Claim() {
    }

    public Claim(Integer id, String policyNumber, String customerName, String claimType, Date claimDate, Double estClaimAmt, String address, String vehicleMake, String vehicleModel, String vehicleYear, String petType, String petBreed, String claimDescription, String claimReason, String claimStatus, String imageURL) {
        this.id = id;
        this.policyNumber = policyNumber;
        this.customerName = customerName;
        this.claimType = claimType;
        this.claimDate = claimDate;
        this.estClaimAmt = estClaimAmt;
        this.address = address;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleYear = vehicleYear;
        this.petType = petType;
        this.petBreed = petBreed;
        this.claimDescription = claimDescription;
        this.claimReason = claimReason;
        this.claimStatus = claimStatus;
        this.imageURL = imageURL;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getClaimType() {
        return claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }

    public Date getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(Date claimDate) {
        this.claimDate = claimDate;
    }

    public Double getEstClaimAmt() {
        return estClaimAmt;
    }

    public void setEstClaimAmt(Double estClaimAmt) {
        this.estClaimAmt = estClaimAmt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleYear() {
        return vehicleYear;
    }

    public void setVehicleYear(String vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetBreed() {
        return petBreed;
    }

    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }

    public String getClaimDescription() {
        return claimDescription;
    }

    public void setClaimDescription(String claimDescription) {
        this.claimDescription = claimDescription;
    }

    public String getClaimReason() {
        return claimReason;
    }

    public void setClaimReason(String claimReason) {
        this.claimReason = claimReason;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}


