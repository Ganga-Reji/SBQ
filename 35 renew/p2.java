import java.util.*;
class Footwear
{
    private int footwearid;
    private String name;
    private String type;
    private int price;

    public Footwear(int footwearid,String name,String type,int price)
    {
        this.footwearid=footwearid;
        this.name=name;
        this.type=type;
        this.price=price;

    }

    //-----------getter--------//
    public int get_footwearid()
    {
        return footwearid;
    }
    public String get_name()
    {
        return name;
    }
    public String get_type()
    {
        return type;
    }
    public int get_price()
    {
        return price;
    }

    ///---- setter function---//

    public void set_footwear_id(int id)
    {
        this.footwearid=id;
    }
    public void set_name(String name)
    {
        this.name=name;
    }
    public void set_type(String type)
    {
        this.type=type;
    }
    public void set_price(int price)
    {
        this.price=price;
    }


}

class p2
{
    public static void main(String args[])
    {
      
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of objects: ");
        int num=sc.nextInt();
        sc.nextLine();
          Footwear ob=new Footwear(num);
        for(int i=0;i<num;i++)
        {
            System.out.println("Enter id: ");
            int id=sc.nextInt();sc.nextLine();
            System.out.println("Enter name: ");
            String name=sc.nextLine();
            System.out.println("Enter type: ");
            String type=sc.nextLine();
             System.out.println("Enter price: ");
            int price=sc.nextInt();sc.nextLine();
            ob[i]=new Footwear(id,name,type,price);


        }
        System.out.println("Enter the string to search for:");
        String parameter=sc.nextLine();
        int result=getCountbyType(ob,parameter);
        if(result==0)
        {
            System.out.println("footwear not avaialable");
        }

        else
        {
            System.out.println(result);
        }



    }

    public static int getCountByType(Footwear[] ob,String f)
    {
        int count=0;
        for(int i=0;i<ob.length;i++)
        {
            if(ob[i].get_type().equals(f))
            {
                count=count+1;
            }
        }

        if(count==0)
        {return 0;}


    }
}