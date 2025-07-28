/* Count the sum of even numbers in a given number

 */
import java.util.*;
class p43
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            int b=Integer.parseInt(String.valueOf(s.charAt(i)));
            for(i=0;i<s.length()+1;i++){
                if(b%2==0)
                {
                    sum=sum+b;
                }
    

            }
           
        }
        System.out.println("Sum of evn digits:"+" "+sum);
    }
}