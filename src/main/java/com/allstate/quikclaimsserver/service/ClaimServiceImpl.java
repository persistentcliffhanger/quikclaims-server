package com.allstate.quikclaimsserver.service;

import com.allstate.quikclaimsserver.data.ClaimRepository;
import com.allstate.quikclaimsserver.domain.Claim;
import com.allstate.quikclaimsserver.exceptions.ClaimNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClaimServiceImpl implements ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    @Override
    public List<Claim> getAllClaims() {
        return claimRepository.findAll();
    }

    @Override
    public List<Claim> getAllPayments() {
        return null;
    }

    @Override
    public Claim getById(Integer id) throws ClaimNotFoundException {
        Optional<Claim> optionalPayment = claimRepository.findById(id);
        if(optionalPayment.isPresent()) {
            return optionalPayment.get();
        }   else {
            throw new CLaimNotFoundException("There is no claim with id " + id);
        }

    }

    @Override
    public List<Claim> getByPolicyNumber(String policyNumber) {
        return null;
    }

    @Override
    public List<Claim> getByCountry(String policyNumber) {
        return claimRepository.findByPolicyNumber(policyNumber);
    }
}
