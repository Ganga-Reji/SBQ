/* Find occurance of a character in a string
    Input
    --------------
 *  Priyanka
 *  a9876
 * 
 
 *  Output
    ----------------
 *  2
 */
import java.util.*;
class p2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.toLowerCase(str.charAt(i))==(Character.toLowerCase(ch))){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}