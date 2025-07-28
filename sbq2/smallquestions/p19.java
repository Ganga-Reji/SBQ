/*Find the Largest Word in a Sentence

Write a Java program that takes a sentence as input and determines the largest word in that sentence based on its length. 
If there are multiple words with the same maximum length, the program should return the first one encountered.

*/
import java.util.*;
class p19
{
    public static void main(String args[])

    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] arr=s.split(" ");
        String large="";
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].length()>large.length())
            {
                large=arr[i];
            }
        }

        System.out.println("The largest string word is: "+" "+large);

    }
}