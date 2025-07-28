/* Find number of upper case in a string
 * AriJIt = 3
 */
import java.util.*;
class p7{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
                c=c+1;
            }
        }
        System.out.println("sum:"+" "+c);
    }
}
