// UCF COP3330 Summer 2021 Assignment 18 Solution
// *  Copyright 2021 Igli Spaho

//You’ll often need to determine which part of a program is run based on user input or other events.
//
//Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit. Prompt for the starting temperature. The program should prompt for the type of conversion and then perform the conversion.
//
//The formulas are
//
//C = (F − 32) × 5 / 9
//and
//
//F = (C × 9 / 5) + 32
//Example Output

//Press C to convert from Fahrenheit to Celsius.
//Press F to convert from Celsius to Fahrenheit.
//Your choice: C
//Please enter the temperature in Fahrenheit: 32
//The temperature in Celsius is 0.
//
//Constraints
//Ensure that you allow upper or lowercase values for C and F.
//Use as few output statements as possible and avoid repeating output strings.



import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Press C to convert from Fahrenheit to Celsius.");
        String celsius = in.next();

        System.out.print("Press F to convert from Celsius to Fahrenheit.");
        String fahrenheit = in.next();

        System.out.print("Your choice:");
        String choice = in.next();

        choice=choice.toLowerCase();
        if(choice.equals("c")){
            System.out.print("Please enter the temperature in Fahrenheit:");
            Integer tempF = in.nextInt();

            Integer finalC = (tempF-32)* 5/9;
            System.out.print("The temperature in Celsius is "+finalC);
        }

        else if (choice.equals("f")){
            System.out.print("Please enter the temperature in Celsius:");
            Integer tempC = in.nextInt();
            Integer finalF = (tempC*9/5)+32;

            System.out.print("The temperature in Fahrenheit is "+ finalF);

        }

    }
}
