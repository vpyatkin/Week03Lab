/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.math.BigDecimal;

/**
 *
 * @author Vladik
 */
public class NumberUtils {
    public static boolean isNumber(String test) {
        BigDecimal number;

        if(test == null || test.equals("")) {
            return false;
        }

        try {
            number = new BigDecimal(test);;
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
