/* Minimum Ascii valued character in a String */
import java.util.*;
class p38
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char c=str.charAt(0);
        for(int i=1;i<str.length();i++)
        {
            if(str.isEmpty())
            {
                return;
            }
            if(Character.compare(c,str.charAt(i))>0)
            {
                c=str.charAt(i);
            }
        }
        if (c == ' ') {
            System.out.println("Minimum ASCII valued character: [space]");
        } else {
            System.out.println("Minimum ASCII valued character: " + c);

    }
}
}
//To make sure the program clearly indicates that a space character is the minimum,
// we can modify the output to explicitly mention if the minimum character is a space.
/* ---------------------------spliting the string with space

import java.util.*;

class p38 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // Split the string by spaces and store the parts in an array
        String[] parts = str.split(" "); // Split by space

        // Initialize minimum character with the first non-empty part
        char minChar = Character.MAX_VALUE; // Set to maximum char value to ensure any char will be smaller

        // Iterate through each part to find the minimum ASCII valued character
        for (String part : parts) {
            for (int i = 0; i < part.length(); i++) {
                char currentChar = part.charAt(i);
                if (currentChar < minChar) {
                    minChar = currentChar; // Update minChar if currentChar is smaller
                }
            }
        }

        // Check if minChar was updated
        if (minChar == Character.MAX_VALUE) {
            System.out.println("No characters to compare.");
        } else {
            // Determine if the minimum character is a space
            System.out.println("Minimum ASCII valued character: " + minChar);
        }
    }
}


or another method:

import java.util.Scanner;

class MinimumAsciiCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call the method to find the minimum ASCII valued character
        char minChar = findMinAsciiCharacter(input);

        // Print the result
        System.out.println("Minimum ASCII valued character: " + minChar);
    }

    private static char findMinAsciiCharacter(String s) {
        // Initialize the minimum character with the first character of the string
        char minChar = s.charAt(0);

        // Iterate through the string to find the minimum ASCII character
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < minChar) {
                minChar = s.charAt(i); // Update minChar if a smaller ASCII character is found
            }
        }

        return minChar;
    }
}

*/