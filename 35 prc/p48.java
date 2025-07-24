import java.util.*;
class p48
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<num;i++)
        {
            int a=sc.nextInt();
            sc.nextLine();
            l1.add(a);

        }
        System.out.println("Valid scores function:");
        List<Integer> list_res=findValidScores(l1);
        if(list_res!=null && !list_res.isEmpty())
        {
            for(int i=0;i<list_res.size();i++)
            {
                System.out.println(list_res.get(i));
            }
            
        }

    }
    private static boolean validateScore(int a)
    {
        return  a>0 && a<=100;
    }


    private static List<Integer> findValidScores(List<Integer> a)
    {
        List<Integer> l2=new ArrayList<>();
        for(int i=0;i<a.size();i++)
        {
            if(validateScore(a.get(i)))
            {
                l2.add(a.get(i));
            }
            else{
                return null;
            }
      
        
        }

    if(l2.isEmpty())
    {
        return null;
    }
    else{
        return l2;
    }

    }
}