/* Count number of spaces and characters in a string 
 * Input
 * ---------
 * Arijit is bad boy
 * 
 * Output
 * ------------------
 * Number of space : 3
   Number of character : 14
*/
import java.util.*;
class p40
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                count=count+1;
            }

        }

        System.out.println("The no of spaces:"+count+"and"+" "+"no of charcters:"+(str.length()-count));
    }
}