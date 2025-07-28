/* Find the Maximum Ascii valued character in a String
 * Arijit = t
 * priyanka = y
 * Aa = a
 */
import java.util.*;
class p23
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        //Char ch=sc.nextCharacter();
        char ch=str.charAt(0);
        for(int i=0;i<str.length();i++)
        {
            if(ch<str.charAt(i))
            {
                ch=str.charAt(i);
            }
        }

        System.out.println("character with highest ascii value:"+ch);

    }









}