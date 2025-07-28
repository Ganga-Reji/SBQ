/*Write a Java program to find the first non-repeated character in a given string.

Here's an example of the expected input and output:

Input string: "minimum"
Output: "n"

*/

import java.util.*;
public class p15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count=0;

        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(i!=j && s.charAt(i)==s.charAt(j))
                {
                    count=count+1;
                    break;
                }
            }

            if(count==0)
            {
                System.out.println(s.charAt(i));
            }
        }
        
    }

}