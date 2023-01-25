package com.allstate.quikclaimsserver.data;

import com.allstate.quikclaimsserver.domain.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ClaimRepository extends JpaRepository<Claim, Integer> {

    public List<Claim> findByPolicyNumber(String policyNumber);

}