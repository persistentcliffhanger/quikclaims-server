package com.allstate.quikclaimsserver.service;

import com.allstate.quikclaimsserver.data.ClaimRepository;
import com.allstate.quikclaimsserver.domain.Claim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ClaimServiceImpl implements ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    @Override
    public List<Claim> getAllClaims() {
        return claimRepository.findAll();
    }


}
