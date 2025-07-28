/* Count the sum of prime digits in a given number
 * 
 * Input: 2345678910
 * Output: 17
 * 
 * Explaination: 2+3+5+7 = 17
 */
import java.util.*;
class p44
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            int b=Integer.parseInt(String.valueOf(s.charAt(i)));
            for(i=2;i<b+1;i++){
                if(b%i!=0)
                {
                    sum=sum+b;
                }
    

            }
           
        }
        System.out.println("Sum of prime digits:"+" "+sum);
    }
}