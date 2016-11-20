package LabPractical6;

import java.util.Scanner;

/**
 * Created by devit47 on 18/11/2016.
 */
public class DataSentinelWhile3 {
    public static void main(String[] args) {
        String sentence;
        char ch;
        int index = 0, lowerLetters = 0, upperLetters = 0, digits = 0, punctuation = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter any sentence you like (terminated by a full-stop):\n");
        sentence = input.nextLine();
        ch = sentence.charAt(index); //extract the 1st character from sentence

        while(ch != '.'){
            if(ch >= 'a' && ch <= 'z'){
                lowerLetters++;
            }else if(ch >= 'A' && ch <= 'Z'){
                upperLetters++;
            }else if(ch >= '0' && ch <= '9'){
                digits++;
            }else{
                punctuation++;
            }

            index++; //increase index by 1
            ch = sentence.charAt(index); //extract the next character from sentence
        }

        System.out.println("\n\n******Lexial Analysis of Your Sentence******" + "\nLowercase letter: " + lowerLetters +
        "\nUppercase letter: " + upperLetters + "\nDigits: " + digits + "\nPunctuation symbols: " + (punctuation+1));
    }
}