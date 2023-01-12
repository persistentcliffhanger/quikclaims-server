package com.allstate.quikclaimsserver.service;

import com.allstate.quikclaimsserver.domain.Claim;
import com.allstate.quikclaimsserver.exceptions.ClaimNotFoundException;

import java.util.List;

public interface ClaimService {

    public List<Claim> getAllPayments();

    public Claim getById(Integer id) throws ClaimNotFoundException;


    public List<Claim> getByPolicyNumber(String policyNumber);
}
