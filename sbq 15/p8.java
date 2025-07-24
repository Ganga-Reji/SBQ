/* Count the words in a sentence which are start with vowel. 
 * 
 * Input: Arijit is student of MCA
 * Output: 3
 * 
 * Input: Sara plays tennis
 * Output: No such words
*/
import java.util.*;
 class p8
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String[] str=s1.split(" ");
        int count=0;
        for(int i=0;i<str.length;i++)
        {
            char temp=str[i].charAt(0);
            if(temp=='a'||temp=='A'||temp=='e'||temp=='E'||temp=='i'||temp=='I'||temp=='O'||temp=='o'||temp=='u'||temp=='U')
            {
                count=count+1;
            }
        }

        System.out.println(count);
    }
}