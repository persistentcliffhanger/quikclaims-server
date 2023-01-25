package com.allstate.quikclaimsserver.control;

import com.allstate.quikclaimsserver.domain.Claim;
import com.allstate.quikclaimsserver.exceptions.ClaimNotFoundException;
import com.allstate.quikclaimsserver.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/api/claim")
public class ClaimController {

    @Autowired
    private ClaimService claimService;

    @GetMapping()
    public List<Claim> getAllClaims(@RequestParam(value = "policynumber", required = false) String policyNumber) throws ClaimNotFoundException {
        if (policyNumber == null) {
            return claimService.getAllClaims();
        } else {
            return (List<Claim>) claimService.getByPolicyNumber(policyNumber);
        }

    }

    @GetMapping("/{claimId}")
    public Claim findById(@PathVariable("claimId") Integer id) throws ClaimNotFoundException {
        {
            return claimService.getById(id);
        }

        public void saveNewClaim();{


        }


    }
}
