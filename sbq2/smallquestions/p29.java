/* Remove duplicate characters in a string
 * 
 * Input : Arijit Ghosh
 * Output : Arijt Ghos
 */
/*
Write a Java program to implement a simple calculator. The program should prompt the user to enter two numbers and an 
operator (+, -, *, or /) and then perform the corresponding operation and display the result.

For example, if the user enters 4, 5, and +, the program should display 9 as the result. Similarly, if the user enters 10, 3, 
and *, the program should display 30 as the result.

Your program should handle invalid inputs gracefully, for example, if the user enters an operator that is not one of the four 
allowed operators or if the user enters non-numeric inputs. 
*/
import java.util.*;
public class Calculator { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();sc.nextLine();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();sc.nextLine();
        System.out.print("Enter operator: ");
        char op = sc.nextLine().charAt(0);

        if(op == '+')
        {
            System.out.println(a+" "+op+" "+b+" = "+(a+b));
        }
        else if(op == '-')
        {
            System.out.println(a+" "+op+" "+b+" = "+(a-b));
        }
        else if(op == '*')
        {
            System.out.println(a+" "+op+" "+b+" = "+(a*b));
        }
        else if(op == '/')
        {
            System.out.println(a+" "+op+" "+b+" = "+(a/b));
        }
        else
        {
            System.out.println("Invalid operator");
        }
    }
}

        int i,j;
        String ch="";
        for(i=0;i<str1.length();i++)
        {
            for(j=0;j<i;j++)
            {
                if(str1.charAt(i)==str1.charAt(j))
                {
                    break;

                }
            }


                if(i==j){
                    ch=ch+str1.charAt(i);
                }
            }
            System.out.println("orginial:"+ch);
        }
    }
