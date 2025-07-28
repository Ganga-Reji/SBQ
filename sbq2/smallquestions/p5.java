/* Find the characters in odd position of a string which are consonent
 * 
 * Input: Arijit Ghosh
 * Output: hs
 */

import java.util.*;
class p5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        String s1=sc.nextLine();
        char[] ch={'a', 'e', 'i','o','u','A','E','I','O','U'};
        System.out.println("characters:");
        

        for(int i=0;i<s1.length();i++)
        {
            boolean test=true;
            for(int j=0;j<ch.length;j++)
            {
                if( (i+1)%2==0 || s1.charAt(i)==ch[j] || s1.charAt(i)==' ')
                {
                    test=false;
                    //System.out.print(s1.charAt(i));
                }

                
            }
           if(test==true){
                System.out.print("charcters are:"+s1.charAt(i));
            } 
        }

}
}