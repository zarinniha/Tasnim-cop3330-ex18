/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Zarin Tasnim
 */

import java.util.Scanner;
class temperature{

    public static void main(String args[])
    {
        double convert=0;
        System.out.print("Press C to coverst from Farenhite to Celsius\n" +
                          "Press F to convert from Celsius to Farenhite\nYour choice: ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String answer = (s1.equalsIgnoreCase("c"))?"Please enter the temperature in Farenhite: ":
                        "Please enter the temperature in Celsius: ";
        System.out.print(answer);
        double temp = sc.nextDouble();

        //celsius = (farenhite − 32) × 5 / 9
        //farenhite = (celsius × 9 / 5) + 32

        if(s1.equalsIgnoreCase("c"))
        {
            convert= (temp - 32) * 5/9;
        }else if(s1.equalsIgnoreCase("f"))
        {
            convert = (temp * 9/5) + 32 ;
        }
        String str = (s1.equalsIgnoreCase("c"))?"The temperature in Farenhite is ":
                       "the temperature in Celsius is ";
        System.out.print(str+convert);





    }
}