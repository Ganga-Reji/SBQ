import java.util.*;
class Music
{
     private int no;
     private String type;
     private int count;
     private double duration;
     //----------constructot-----//
     public Music(int no,String type,int count,double duration)
     {
        this.no=no;
        this.type=type;
        this.count=count;
        this.duration=duration;

     }

     //-------------getter---/

     public int get_no()
     {
        return no;
     }
     public String get_type()
     {
        return type;
     }

     public int get_count()
     {
        return count;
     }
     public double get_duration()
     {
        return duration;
     }

     //---------setter--------//
     public void  set_no(int n)
     {
        this.no=n;
     }
     public void set_type(String t)
     {
        this.type=t;
     }
     public void set_count(int c)
     {
        this.count=c;
     }
     public void set_duration(double d)
     {
        this.duration=d;
     }
     //---> This happens because when you try to print an object (System.out.println(result[i]);), 
     //Java calls the toString() method of the class. If you do not override the toString() method in your class,
      //it uses the default implementation from the Object class, 
    // which prints the class name followed by the object's hash code (like Music@4769b07b).
     @Override
     public String toString() {
         return "Music{no=" + no + ", type='" + type + "', count=" + count + ", duration=" + duration + "}";
     }
}

class p31
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //----array of music objects-------//
       
        System.out.println("enter how many music objects:");
        int num=sc.nextInt();sc.nextLine();
        Music[] ob=new Music[num];
        System.out.println("Enter the details:");
        for(int i=0;i<num;i++)
        {
         System.out.println("Enter no: ");
         int a=sc.nextInt();sc.nextLine();
         System.out.println("Enter type: ");
         String b=sc.nextLine();
         System.out.println("Enter count: ");
         int c=sc.nextInt();sc.nextLine();
         System.out.println("Enter duration: ");
         double d= sc.nextDouble();sc.nextLine();
         ob[i]=new Music(a,b,c,d);

        }

        System.out.println("Enter the count to be checked: ");
        int coumt_check=sc.nextInt();sc.nextLine();
        int result_avergae=AvgOfCount(ob,coumt_check);
        System.out.println("Average is : "+result_avergae);

        //------second method----------//
        System.out.println("Now give me the duration to comapre with: ");
        double test_duration=sc.nextDouble();sc.nextLine();
        Music[] result=sortTypeByDuration(ob, test_duration);
        //System.out.println();
        for(int i=0;i<result.length;i++)
        {
         System.out.println(result[i]);
        }


    }

    public static int AvgOfCount(Music[] ob,int v)
    {
      int avg=0;
      int count=0;
      for(int i=0;i<ob.length;i++)
      {
         if(ob[i].get_count()>v)
         {
            count=count+ob[i].get_count();
            avg=avg+1;

         }
      }

      if(avg==0)
      {
         return 0;
      }
      else
      {
         return (count/avg);
      }


    }

    //------- second method-----//

    public static Music[] sortTypeByDuration(Music[] ob,double d)
    {
      List<Music> l1=new ArrayList<>();
      for(int i=0;i<ob.length;i++)
      {
         if(ob[i].get_duration()>d)
         {
            l1.add(ob[i]);
         }
      }

      //----sorting of the list-------//
      l1.sort(Comparator.comparingDouble(Music::get_duration));
      return l1.toArray(new Music[0]);
    }
}