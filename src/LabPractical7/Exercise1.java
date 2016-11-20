package LabPractical7;

import java.util.Scanner;

/**
 * Created by devit47 on 20/11/2016.
 */
public class Exercise1 {
    public static void main(String[] args) {
        float average = 0, weight = 0, percentage;
        int count = 0, numPeopleOver80kg = 0;

        Scanner input = new Scanner(System.in);

        while(count < 5){
            System.out.print("Please enter the weight of person " + (count + 1) + ": ");
            weight = input.nextFloat();

            average += weight;

            if(weight > 80.0f){
                numPeopleOver80kg++;
            }

            count++;
        }

        average = average/5.0f;
        percentage = (100 / count) * numPeopleOver80kg;

        System.out.println("\n\n\n======================================" +
                "\t\tProgram Results" +
                "\n======================================" +
                "\nAverage Weight: " + String.format("%.2f", average) + "kg" +
                "\nPercentage >= 80kg: " + String.format("%.2f", percentage) + "%");
    }
}