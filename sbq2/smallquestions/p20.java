/*Extract the Last Character of Each Word in a Sentence

Write a Java program that takes a sentence as input and extracts the last character of each word in that sentence.
 The program should concatenate these last characters into a single string and display the result. */

import java.util.*;
class p20
{
    public static void main(String args[])

    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] arr=s.split(" ");
        String last="";

        for(int i=0;i<arr.length;i++)
        {
            if(!arr[i].isEmpty())
            {
                last=last+arr[i].charAt(arr[i].length()-1);

            }
          
        }

        System.out.println("The list of last words are:"+" "+last);
        
}
}