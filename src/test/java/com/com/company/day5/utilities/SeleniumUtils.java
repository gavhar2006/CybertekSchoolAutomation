package com.com.company.day5.utilities;

public class SeleniumUtils {

    /**
     *
     *
     *
     *
     */


    public static void verifyEquals(String expectedResult, String actualResult){
        if(expectedResult.equals(actualResult)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
            System.out.println("Expected result: "+expectedResult);
            System.out.println("Actual result: "+actualResult);
        }
    }
}


