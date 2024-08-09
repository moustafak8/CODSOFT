

package com.mk7.gradecalculator;

import java.util.Scanner;


public class Gradecalculator {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double sum=0;
        
        System.out.println("Enter the number of subjects u have taken: ");
        int n=scan.nextInt();
        double[]grades=new double[n];
        for (int i = 0; i < grades.length; i++) {
            System.out.println("enter the grade (out of 100)for each subject"+(i+1)+": ");
            grades[i]=scan.nextDouble();
            sum+=grades[i];
            
        }
    double averagePercentage=sum/n;
      if (averagePercentage >= 90) {
          System.out.println("your total marks is :"+sum);
          System.out.println("your average percentage  is :"+averagePercentage+"%");
            System.out.println("Grade: A");
        } else if (averagePercentage >= 80) {
                      System.out.println("your total marks is :"+sum);
          System.out.println("your average percentage  is :"+averagePercentage+"%");
            System.out.println("Grade: B");
        } else if (averagePercentage >= 70) {
                      System.out.println("your total marks is :"+sum);
          System.out.println("your average percentage  is :"+averagePercentage+"%");
            System.out.println("Grade: C");
        } else if (averagePercentage >= 60) {
                      System.out.println("your total marks is :"+sum);
          System.out.println("your average percentage  is :"+averagePercentage+"%");
            System.out.println("Grade: D");
        } else {
                      System.out.println("your total marks is :"+sum);
          System.out.println("your average percentage  is :"+averagePercentage+"%");
            System.out.println("Grade: F");
        }
       
        
    }
}
