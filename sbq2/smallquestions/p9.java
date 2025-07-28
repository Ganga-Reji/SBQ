/* Count number of word in a string
*Note : Always ignore the spaces if more than 1 space given between two word

Sample Input : 1
------------------------
Kalyani Goverment Engineering College

Process
---------------------------
[Kalyani, Goverment, Engineering, College]

Output
---------------------------
Number of word : 4
*************************************
Sample Input : 2
------------------------
Kalyani Goverment  Engineering College

Process
---------------------------
[Kalyani, Goverment, , Engineering, College]

Output
---------------------------
Number of word : 4
*/

import java.util.*;
 class p9
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String str[]=s1.split(" ");
        int count=0;
        for(int i=0;i<str.length;i++)
        {
            if(str[i]!="")
            {
                count++;
            }
        }
 
        System.out.println("Count of words:"+count);
 
 
    }
}
