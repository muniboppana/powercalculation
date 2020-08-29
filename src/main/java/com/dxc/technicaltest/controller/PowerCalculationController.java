package com.dxc.technicaltest.controller;

import com.dxc.technicaltest.service.PowerCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class PowerCalculationController {

     @Autowired
    PowerCalculationService powerCalculationService;

    @PostMapping("/powerOfNValue")
    public String starString(@RequestParam(value = "powerNumber") String powerNumber) {
        if(Integer.parseInt(powerNumber) >= 0 ) {
            return powerCalculationService.powerCalculation(Integer.parseInt(powerNumber));
        } else {
            return "should Not Enter Negative number";
        }

    }

}
