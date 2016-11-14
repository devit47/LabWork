package LabPractical6;

import java.util.Scanner;

/**
 * Created by devit47 on 10/11/2016.
 */
public class Exercise1 {
    public static void main(String[] args) {
        float fahrenheitEntered, celciusConversion;
        int totalConversions = 0, averageCelcius, totalsOver30, totalsUnder10, percentAtLeast20;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first Fahrenheit temperature (below -459.67 to exit):");

        fahrenheitEntered = input.nextFloat();
        while(fahrenheitEntered >= -459.67){
            celciusConversion = ((float)5/(float)9)*(fahrenheitEntered - 32);
            System.out.println("The equivalent Celcius temperature is " + celciusConversion);

            System.out.println();
        }
        System.out.println("No conversions were performed...Goodbye");
    }
}