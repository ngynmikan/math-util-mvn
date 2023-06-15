/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sea.mathutil.mvn.main;

import org.sea.mathutil.mvn.core.MathUtility;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Test case #1: n = 0
        System.out.println("Check getF(0) 0! | expected: 1 | actual: " + MathUtility.getFactorial(0));
        
        //Test case #2: n = 1
        System.out.println("Check getF(1) 1! | expected: 1 | actual: " + MathUtility.getFactorial(1));
        
        //Test case #3: n = 2
        System.out.println("Check getF(2) 2! | expected: 2 | actual: " + MathUtility.getFactorial(2));
        
        //Test case #4: n = 3
        System.out.println("Check getF(3) 3! | expected: 6 | actual: " + MathUtility.getFactorial(3));
        
        //Test case #5: n = 5
        System.out.println("Check getF(5) 5! | expected: 120 | actual: " + MathUtility.getFactorial(5));
        
        //Test case #6: n = -1
        System.out.println("Check getF(-1) -1! | expected: Exception | actual: " );
        MathUtility.getFactorial(-1);
    }
    
     //test case 1: check if getF() returns well with n = 0;
        //Steps/Procedures
        // - input n = 0 to the function/method
        // - run the method to get the actual value of 0!
        //Expected: 0! must be 1, expected value = 1
        
        //Test case 1: check getF(0) with n = 0
        //Step/Procedures: 
        // 1. Given n = 0
        // 2. Execute getF(n = 0)
        // Expected value: (hàm hi vọng trả về)
        // getF(0) 0! must return 1
    
        //Test case 2: check getF(0) with n = 0
        //Step/Procedures: 
        // 1. Given n = 1
        // 2. Execute getF(n = 1)
        // Expected value: (hàm hi vọng trả về)
        // getF(0) 1! must return 1
    
    //TDD: Test Driven Development: viết code, làm app theo style
    //code và test song hành với nhau
    //code và test là cặp bài trùng, code liên tục
    
    
}
