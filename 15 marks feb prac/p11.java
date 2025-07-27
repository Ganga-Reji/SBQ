/* Count number of vowel, consonent and digit into a string */
import java.util.*;
class p11
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       String s1=sc.nextLine();
       int v=0;
       int c=0;
       int d=0;

       String s2=s1.toLowerCase();

       for(int i=0;i<s2.length();i++)
       {
        if(Character.isLetter(s2.charAt(i)))
        {
            if(s2.charAt(i)=='a' ||s2.charAt(i)=='e' || s2.charAt(i)=='i' || s2.charAt(i)=='o' || s2.charAt(i)=='u')
            {
                v=v+1;
            }
            else{
                c=c+1;
            }
        }

        else if(Character.isDigit(s2.charAt(i)))
        {
            d=d+1;
        }

       }

       System.out.println("vowel:"+v+" "+"consonants:"+" "+c+"digits"+" "+d);
    }
}
       