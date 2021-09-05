/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution02
 *  Copyright 2021 Danny Yu
 */

// create a program that counts the number of characters in a string

import java.util.Scanner;

public class Solution02
{
    /*
        prompt user for string of characters
            user inputs strong
        read the number of characters in the string
        print string of characters and the number of characters in the string
     */

    public static void main(String[] args)
    {
        Scanner characters = new Scanner(System.in);
        System.out.println("Enter a string of characters:");
        String input = characters.nextLine();
        int length = input.length();
        System.out.println(input + " has " + length + " characters.");
    }
}
