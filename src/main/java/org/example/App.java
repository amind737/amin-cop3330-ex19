/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dharik Amin
 */
package org.example;

import java.util.*;
import java.lang.*;
import java.io.*;
public class App 
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the height in inches: ");
        double height = sc.nextDouble();
        System.out.println("Enter the weight in pounds: ");
        double weight = sc.nextDouble();

        double BMI = (weight / (height * height)) * 703;

        System.out.println("Your BMI is " + String.format("%.2f",BMI) + ".");


        if(BMI >= 18.5 && BMI <= 25){
            System.out.println("You are within the ideal weight range.");
        }
        else if(BMI >25){
            System.out.println("You are overweight. You should see your doctor.");
        }
        else if(BMI < 18.5){
            System.out.println("You are underweight. You should consult with your doctor.");
        }
    }
}
