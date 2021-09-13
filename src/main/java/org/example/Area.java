package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jorge Quiros
 */
public class Area
{
    public static void main( String[] args )
    {
        Scanner input=new Scanner(System.in);
        System.out.println( "What is the length of the room in feet?" );
        Double lenght= input.nextDouble();
        System.out.println( "What is the width of the room in feet?" );
        Double width= input.nextDouble();
        Double f2= lenght * width;
        Double m2= f2 * 0.09290304;
        System.out.println("You entered dimensions of "+ lenght + " feet by " + width + " feet.");
        System.out.println("The are is:\n" + f2 + " square feet\n" + m2 + " square meters");
    }
}
