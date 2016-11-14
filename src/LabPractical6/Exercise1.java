package LabPractical6;

import java.util.Scanner;

/**
 * Created by devit47 on 10/11/2016.
 */
public class Exercise1 {
    public static void main(String[] args) {
        float fahrenheitEntered, celciusConversion, averageCelcius = 0, percentage20 = 0;
        int totalConversions = 0, totalsOver30 = 0, totalsUnder10 = 0, totalsAtLeast20 = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first Fahrenheit temperature (below -459.67 to exit):");

        fahrenheitEntered = input.nextFloat();

        if(fahrenheitEntered > -459.67){

            while(fahrenheitEntered > -459.67){
                celciusConversion = ((float)5/(float)9)*(fahrenheitEntered - 32);
                System.out.println("The equivalent Celcius temperature is " + String.format("%.3f",celciusConversion));
                totalConversions++;
                averageCelcius += celciusConversion;
                if(celciusConversion > 30){
                    totalsOver30++;
                }
                if(celciusConversion < 10){
                    totalsUnder10++;
                }
                if(celciusConversion >= 20){
                    totalsAtLeast20++;
                }
                System.out.println("Please enter the first Fahrenheit temperature (below -459.67 to exit):");
                fahrenheitEntered = input.nextFloat();
            }

            averageCelcius = averageCelcius/totalConversions;
            percentage20 = (100 / totalConversions) * totalsAtLeast20;

            System.out.println("\n\n\n\n================================\n\t\t\tProgram Results\n" +
                    "================================\n\nTotal conversions performed: " + totalConversions +
                    "\nAverage Celcius temperature: " + String.format("%.3f", averageCelcius) +
                    "C\nTotal Celcius temperatures > 30C: " + totalsOver30 + "\nTotal Celcius temperature < 10C: "
                    + totalsUnder10 + "\nPercentage Celcius temperatures >= 20C: " + String.format("%.0f", percentage20) + "%");

        }else{
            System.out.println("No conversions were performed...Goodbye");
        }
    }
}