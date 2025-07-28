/*
 * You are given a string S consisting of lowercase letters. Your task is to remove all the consecutive duplicates from
 * the string and output the result. For example, if the input string is "abbcddeff", the output should be "abcdef".
 * 
 * Input: abbcddeff
 * Output: abcdef
 */
import java.util.*;
class pg31
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String result=getConsecutiveDuplicates(str1);
        System.out.println(result);
    }

    public static String getConsecutiveDuplicates(String s)
    {
        String str2="";
        char ch='\0';
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=ch)
            {
                ch = s.charAt(i);
                str2+= ch;
            }
        }
        return str2;
        }

        
    }

/*import java.util.Scanner;

class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        // Initialize an empty string to store the result
        String result = "";

        // Loop through the input string
        for (int i = 0; i < input.length(); i++) {
            // Check if the current character is the first character or not the same as the last character in the result
            if (i == 0 || input.charAt(i) != input.charAt(i - 1)) {
                result += input.charAt(i); // Append the character to the result
            }
        }

        System.out.println("Output: " + result); // Print the result
    }
}
 */
