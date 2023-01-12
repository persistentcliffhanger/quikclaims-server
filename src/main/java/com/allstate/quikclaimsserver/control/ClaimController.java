//TODO Needs refactored and errors corrected

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
    public List<Claim> getAllPayments(@RequestParam(value = "country", required = false) String country)  {
        if(country == null) {
            return claimService.getAllClaims();
        } else {
            return claimService.getByPolicyNumber();
        }

    }

    @GetMapping("/{id}")
    public Claim findById(@PathVariable("id") Integer id) throws ClaimNotFoundException {
        {
            return claimService.getById(id);
        }

    }
}