/*Write a program that takes a string as input where letters are followed by numbers, and prints the expanded version of the string.
 Each letter should be repeated according to the number that follows it. 
For example, if the input is a2b3c1, the output should be aabbbc. */

/*import java.util.*;
class p33
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isAlphabetic(s.charAt(i)))
            {
                System.out.print(s.charAt(i));

            }

            else if(Character.isDigit(s.charAt(i)))
            {
                int x=Integer.parseInt(String.valueOf(s.charAt(i)));
                for(int j=0;j<x;j++)
                {
                    System.out.print(s.charAt(i));
                }
            }
        }
    }

}
    
*/
//if u are to repeat string  repeats the entire string, not just the letter
              
import java.util.*;
class p33
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            if((Character.isAlphabetic(s.charAt(i))))
            {
                System.out.println(s.charAt(i));
            }

            else if(Character.isDigit(s.charAt(i)))
            {
                int r=Integer.parseInt(String.valueOf(s.charAt(i)));
                String res=s.repeat(r);
                System.out.println(res);
            }


        }

    }
}