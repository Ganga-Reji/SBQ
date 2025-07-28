/* Reverse of a string  qn 36
 * Arijit = tijirA
 */
 import java.util.*;
class p36
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));

        }
    }
}