/*
Problem Statement
Write a Java program to print the unique characters present in the given string in the same sequence as they appear(the first occurrence) in the input.

Note:
All the characters should be in lowercase only.

i/p -> 
xperience

o/p -> 
xperinc
*/
import java.util.*;
class p50
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase();
        String temp="";

        for(int i=0;i<str.length();i++)
        {
            if( !temp.contains(Character.toString(str.charAt(i))) )
            {
                temp=temp+str.charAt(i);
            }
        }

        System.out.println("The unique character are:"+temp);
    }
}
