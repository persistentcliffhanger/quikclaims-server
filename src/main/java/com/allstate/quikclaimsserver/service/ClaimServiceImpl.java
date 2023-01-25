package com.allstate.quikclaimsserver.service;

import com.allstate.quikclaimsserver.data.ClaimRepository;
import com.allstate.quikclaimsserver.domain.Claim;
import com.allstate.quikclaimsserver.exceptions.ClaimNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class ClaimServiceImpl implements ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    @Override
    public List<Claim> getAllClaims() {
        return claimRepository.findAll();
    }

    @Override
    public Claim getById(Integer id) throws ClaimNotFoundException {
        Optional<Claim> optionalPayment = claimRepository.findById(id);
        if(optionalPayment.isPresent()) {
            return optionalPayment.get();
        }   else {
            throw new ClaimNotFoundException("There is no claim with id " + id);
        }

    }

    @Override
    public List<Claim> getByPolicyNumber(String policyNumber) {
        return claimRepository.findByPolicyNumber(policyNumber);
    }

    @Override
    public List<String> getAllPolicyNumbers(){

        return claimRepository.findAll().stream().map( claim ->claim.getPolicyNumber()).distinct().collect(Collectors.toList());
    }

    @Override
    public void saveClaim(Claim claim) {
        Claim claimPayment = claimRepository.save(claim);
    }
}
