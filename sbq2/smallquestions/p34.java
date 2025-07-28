/* qn 34 Calculate the sum of all digits of a numbers. If the sum is greater than 9 then again sum the digits. The sum is 
continuing until the sum becomes one digit.

Input : 195
Output : 6

Explanation: 1+9+5 =15>9, so 1+5=6 */

import java.util.*;
class p34
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;

        if(a<=9)
        {
            System.out.println(a);
        }
        else{
            int res=sumdigi(a);
            System.out.println(res);
        }
    }

    public static int sumdigi(int a)
    {
        int div=a;
        int sum=0;
        int rev;
        while(div>0)
        {
            rev=div%10;
            sum=sum+rev;
            div=div/10;
        }

        if(sum>9)
        {
            return sumdigi(sum);
        }

        else
        {
            return sum;
        }
    }
}