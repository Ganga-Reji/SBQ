
// Majority of an element means if an element is present in an array for more than n/2 times, 
//  where n is the length of the Array
//  Array = {3, 3, 4, 2, 4, 4, 2, 4, 4} => 4
import java.util.*;/**
 * p21
 */
class p21 {

    
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            sc.nextLine();
         
        }

        int can=arr[0];
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(count==0)
            {
                can=arr[i];
            }

            if(arr[i]==can)
            {
                count=count+1;
            }
            else
            {
                count--;
            }
        }

        count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==can)
            {
                count++;
            }
        }

        if(count>n/2)
        {
            System.out.println("the majority element is: "+can);
        }

        else {
            System.out.println("There is no majority element.");
        }
        }
    
}
