/* Find number of lower case in a string
 * AriJIt = 3
 */

 import java.util.*;
 class p6
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int lowercasecount=0;
        int uppercasecount=0;
        for(int i=0;i<s1.length();i++)
        {
            if(Character.isLowerCase((s1.charAt(i))))
            {
                lowercasecount=lowercasecount+1;
            }

            else{
                // if(s.charAt(i)>=65 && s.charAt(i)<92)
                //if(Character.isUpperCase(s.charAt(i)))
                uppercasecount=uppercasecount+1;

            }
        }

        if(lowercasecount>0)
        {
            System.out.println("Lowercase count:"+lowercasecount);
            System.out.print("\n");
        }

        if(uppercasecount>0)
        {
            System.out.println("Uppercase count:"+uppercasecount);
            System.out.print("\n");

 }

}
 }