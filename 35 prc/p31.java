import java.util.*;
public class p31{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Music[] m = new Music[4];
        for(int i=0; i<4; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            m[i] = new Music(a,b,c,d);
        }

        System.out.println("avegafe");
        System.out.println("count");
        int a=sc.nextInt();
        sc.nextLine();
        int average=findAvgOfCount(m,a);
        if(average==0)
        {
            System.out.println("No");
        }

        else{
            System.out.println(average);
        }

        System.out.println("sort variable:");
        int b=sc.nextInt();
        sc.nextLine();
        Music[] result=sortTypeByDuration(m, b);
        
    }

    private static int findAvgOfCount(Music[] ob,int a)
    {
        int count=0;
        int sum=0;
        for(int i=0;i<ob.length;i++)
        {
            if(ob[i].getCount()>a)
            {
                sum=sum+ob[i].getCount();

                count=count+1;

            }
        }
        int avg=sum/count;

        if(count<0)
        {
            return 0;
        }

        else{
            return avg;
        }

        //
   

    }

    ///----------------second method
    private static Music[] sortTypeByDuration(Music[] ob,int a)
    {
        TreeMap<Double,Music> map=new TreeMap<>();
        for(int i=0;i<ob.length;i++)
        {
           //int variable=ob[i].get_Duration();
            if(ob[i].getDuration()>a)
            {
                map.put(ob[i].getDuration(),ob[i]);
            }

        }
        if(map.keySet()==null)
        {
            return null;
        }
        else{
            return map.values().toArray(new Music[0]);
        }
        

    }

}

class Music{
    int pNo, count;
    String type;
    double duration;
    
    public Music(int pNo, String type, int count, double duration)
    {
        this.pNo = pNo;
        this.type = type;
        this.count = count;
        this.duration = duration;
    }
    
    public int getPNo()
    {
        return pNo;
    }
    public void setPNo(int pNo)
    {
        this.pNo = pNo;
    }
    public String getType()
    {
        return type;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count = count;
    }
    public double getDuration()
    {
        return duration;
    }
    public void setDuration(double duration)
    {
        this.duration = duration;
    }
}

