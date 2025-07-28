// Find the first non repeated character substring
//Arijit = Arij
import java.util.*;
class p14
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        String str="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(i==j)
                {

                    str=str+s.charAt(i);
                }

                else
                {
                    if(s.charAt(i)==s.charAt(j))
                    {
                        count=count+1;
                        break;
                    }
                }
                
        if(count>0)
        {
            break;
        }
            }

        }

        

     
             System.out.println("non repeated substring:"+" "+str);
        
    }
}
