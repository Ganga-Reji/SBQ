/* Remove Vowel From A String 

 * Input : Arijit Ghosh
 * Output : rjt Ghsh
 */

import java.util.*;
class p30
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine().toLowerCase();
        char arr[]={'a','e','i','o','u'};
        String str2="";

        for(int i=0;i<str1.length();i++)
        {
            int j;
            for(j=0;j<arr.length;j++){
                if(str1.charAt(i) == arr[j])
                {
                   break;

                }
            }
            if(j==arr.length){
                str2=str2+str1.charAt(i);
            }
   
        }

        System.out.println("string is: "+" "+   str2);
    }
}