// convert string to array
import java.util.*;
public class p42 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       // str=str.split(" ");
       int index = 0; // To keep track of valid characters added to the array
        char arr[]=new char[str.length()];
        for(int i=0;i<str.length();i++)
        { if(str.charAt(i) != ' ') {
            arr[index++] = str.charAt(i); // Add non-space character and increment index
        }

        

    }
    System.out.println("The array of characters into string:"+Arrays.toString(arr));
}
}



011