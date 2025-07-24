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
        int lowercase=0;
        int uppercase=0;
        for(int i=0;i<s1.length();i++)
        {
            if(Character.isLowerCase(s1.charAt(i)))
            {
                lowercase=lowercase+1;
            }
            else{
                uppercase=uppercase+1;
            }
        }
        System.out.println(lowercase);
    }
}