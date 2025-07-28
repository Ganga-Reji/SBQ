/* Count number of even digit in a number
 * If the count greater than or equal to 3, then print "True" otherwise "False"
 */
import java.util.*;
public class p51
{
    public static void main(String[] args) 
    {
        int count=0;
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            if(isDigit(s.charAt(i)))
            if((Integer.parseInt(String.valueOf(s.charAt(i))))%2!=0)
            {
                count=count+1;

            }
        }
        System.out.println("no of even digits:"+" "+count);

    }
}