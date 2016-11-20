package LabPractical7;

import java.util.Scanner;

/**
 * Created by devit47 on 20/11/2016.
 * This program uses a counter controlled while loop to read in a paragraph of text from the user and then determines
 * the exact number of characters, words, sentences, letters, digits and punctuation symbols in the paragraph
 */
public class CounterControlledWhile2 {
    public static void main(String[] args) {
        String text = "";
        int index = 0, words = 0, sentences = 0, letters = 0, digits = 0, punctuation = 0;
        char character;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your paragraph of text: \n\n");

        text = input.nextLine();

        while(index < text.length()){
            character = text.charAt(index);

            if(character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z'){
                letters++;
            }
            else if(character >= '0' && character <= '9'){
                digits++;
            }
            else{
                punctuation++;
            }

            if(character == ' '){
                words++;
            }
            if(character == '.' || character == '!' || character == '?'){
                sentences++;
            }

            index++;
        }

        System.out.println("\n\n\n======================================" +
                "\n\tLexical Analysis of Your Paragraph" +
                "\n======================================" +
                "\n\nCharacters: " + text.length() +
                "\nLetters: " + letters + "\nDigits: " + digits +
                "\nWords: " + (words + 1) + "\nSentences: " + sentences +
                "\nPunctuation symbols: " + punctuation);
    }
}
