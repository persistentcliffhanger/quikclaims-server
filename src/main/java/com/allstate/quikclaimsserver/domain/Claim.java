package com.allstate.quikclaimsserver.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;



@Entity
@Table(name = "claims")

public class Claim {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String policyNumber;
    private String customerName;
    private String claimType;
    private Date claimDate;
    private Double claimAmt;
    private String claimStatus;
//    private String imageURL;

//Getters and Setters
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

    public Double getClaimAmt() {
        return claimAmt;
    }

    public void setClaimAmt(Double claimAmt) {
        this.claimAmt = claimAmt;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }


//    toString Method
    @Override
    public String toString() {
        return "Claim{" +
                "id=" + id +
                ", policyNumber='" + policyNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                ", claimType='" + claimType + '\'' +
                ", claimDate=" + claimDate +
                ", claimAmt=" + claimAmt +
                ", claimStatus='" + claimStatus + '\'' +
                '}';
    }

    //    Equals and Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Claim claim = (Claim) o;
        return Objects.equals(id, claim.id) && Objects.equals(policyNumber, claim.policyNumber) && Objects.equals(customerName, claim.customerName) && Objects.equals(claimType, claim.claimType) && Objects.equals(claimDate, claim.claimDate) && Objects.equals(claimAmt, claim.claimAmt) && Objects.equals(claimStatus, claim.claimStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, policyNumber, customerName, claimType, claimDate, claimAmt, claimStatus);
    }



    //    Constructors
    public Claim() {
    }

    public Claim(Integer id, String policyNumber, String customerName, String claimType, Date claimDate, Double claimAmt, String claimStatus) {
        this.id = id;
        this.policyNumber = policyNumber;
        this.customerName = customerName;
        this.claimType = claimType;
        this.claimDate = claimDate;
        this.claimAmt = claimAmt;
        this.claimStatus = claimStatus;
    }
}
