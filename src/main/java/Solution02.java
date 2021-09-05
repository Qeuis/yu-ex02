/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution02
 *  Copyright 2021 Danny Yu
 */

// create a program that counts the number of characters in a string

import java.util.Scanner;

public class Solution02
{
    public static void main(String[] args)
    {
        Scanner characters = new Scanner(System.in);
        // variable to get input
        System.out.println("Enter a string of characters:");
        // prompts user to input a string of characters
        String input = characters.nextLine();
        // gets user string input
        int length = input.length();
        // reads string length
        System.out.println(input + " has " + length + " characters.");
        // outputs string input and string length
    }
}
