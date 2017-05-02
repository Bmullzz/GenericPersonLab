package com.zipcode.utilities;

/**
 * Created by leon on 5/2/17.
 */
public class GeneralUtils {
    /**
     * @param a - lower bound
     * @param b - upper bound
     * @param c - value to be checked
     * @return true if c is greater than a and less than b
     */
    public static boolean isBetween(int a, int b, int c) {
        return c > a && c < b;
    }
}
