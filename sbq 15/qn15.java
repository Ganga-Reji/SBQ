/*Write a Java program to find the first non-repeated character in a given string.

Here's an example of the expected input and output:

Input string: "minimum"
Output: "n"

*/
import java.util.*;
class qn15
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase();
        //int count=0;
        for(int i=0;i<str.length();i++)
        {
            int count=0;
            for(int j=0;j<str.length();j++)
            {
                // or if (i != j && Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(str.charAt(j)))
                //here either cnnvert cjarcetr or string to lowercase
                if(i!=j && str.charAt(i)==(str.charAt(j)))
                {
                    count+=1;
                    break;


                }
            }
            if(count==0)
            {
                System.out.println(str.charAt(i));
                return;
            }
        }
        System.out.println("no charcter ofund");
    }
}