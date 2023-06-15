/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sea.mathutil.mvn.core;

/**
 *
 * @author ADMIN
 */
public class MathUtility {
    
    public static final double PI = 3.1415;
    
    public static long getFactorial(int n) {
        
        long product = 1;
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n, n must be between 0 to 20, please.");
        
        if (n == 0 || n == 1)
            return 1;
        
        for (int i = 2; i <= n; i++)
            product *= i;
            return product;
    }
}
