/*Given a sentence, Find words that start with a capital letter.

For example, in the sentence "The quick Brown Fox jumps over the lazy dog", there are three words that start with a 
capital letter: "The", "Brown", and "Fox". */
import java.util.*;
class p13
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] str= s.split(" ");
        System.out.print("WOrds:");
        for(int i=0;i<str.length;i++)
        {
            if(str[i].charAt(0)>='A' && str[i].charAt(0)<='Z')
            {
                System.out.print(str[i]+" ");
            }
        }
    }
}