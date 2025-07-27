/* Input: "Hello@123World456"
qn 35
Process:
Array: ["Hello", "@", "123", "World", "456"]
Now you should concatenate all the strings in the array and multiply it with the sum of the position of that array where 
numbers are stored.
Sum of positions of numbers in the array = 3 + 5 = 8
Concatenated string = "Hello@123World456"
Result = 8 * "Hello@123World456" = "Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456
Hello@123World456Hello@123World456Hello@123World456"

Output:
"Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456
Hello@123World456"

*/
import java.util.*;
class p35
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str[]=new String[3];
        for(int i=0;i<3;i++)
        {
            str[i]=sc.nextLine();
        }
//////////////////////////////////////////////
        String con="";
        for(int i=0;i<str.length;i++)
        {
            con=con+str[i];
        }

        int sum=0;
///--------------------------------------------------//
for(int i=0;i<con.length();i++)
{
    if(Character.isDigit(con.charAt(i)))
    {
        sum=sum+(i+1);
    }
}

//-----------------multiply the result---------------//
String result=con.repeat(sum);
System.out.println("The result is:"+" "+result);

    }
}
