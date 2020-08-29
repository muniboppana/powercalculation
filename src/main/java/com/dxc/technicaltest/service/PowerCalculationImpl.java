package com.dxc.technicaltest.service;

import com.dxc.technicaltest.util.PowerCalculationConstant;
import org.springframework.stereotype.Service;

@Service
public class PowerCalculationImpl implements  PowerCalculationService {


    public String powerCalculation(int powerNumber) {

        if (powerNumber == 0) {
            return  "*";

        }

        int base = PowerCalculationConstant.POWER_BASE_NUMBER;
        int result = base;
        int increment = result;

        //int increment = result;
        StringBuffer sb = new StringBuffer();

        for(int index=1 ; index < powerNumber ; index++) {

            for( int j=1 ; j < base ; j++) {
                result+= increment;
            }
            increment = result;

        }
        System.out.println("answer ::"+ result);
        for(int i = 0; i<result ; i++) {
            sb.append("*");
        }
        System.out.println("total value is ::"+sb.toString());
        return sb.toString();
    }

}
