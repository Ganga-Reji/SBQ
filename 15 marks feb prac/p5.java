// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//this code has issues as we are  printing in lst format use stringbuilder insead of list
//this code is not working for all test cases
import java.util.*;
class p5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();
        //List<Character> characters=new ArrayList<>();
        StringBuilder characters=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            //    if((i%2!==0) && (str.charAt(i).notequal("a")
             if((i%2!=0) && isConsonent(str.charAt(i)))
             {
                 characters.append(str.charAt(i));
                 
             }
        }
        System.out.println("Characters at odd posistion:"+characters.toString());
    }
    public static boolean  isConsonent(char a)
    {
        if(a!='a'&& a!='e'&& a!='i'&& a!='o'&& a!='u')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}