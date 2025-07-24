import java.util.*;
class Flower
{
    private int flowerid;
    private String flowername;
    private int price;
    private int rating;
    private String type;

    public Flower(int flowerid,String flowername,int price,int rating,String type)
    {
        this.flowerid=flowerid;
        this.flowername=flowername;
        this.price=price;
        this.rating=rating;
        this.type=type;
    }

    //-----setttttttter------//
    public void set_flowerid(int id)
    {
        this.flowerid=id;
    }

    public void set_flowername(String n)
    {
        this.flowername=n;
    }

    //int flowerid,String flowername,int price,int rating,String type
    public void set_price(int p)
    {
        this.price=p;

    }
    public void set_rating(int r)
    {
        this.rating=r;
    }

    public void  set_type(String t)
    {
        this.type=t;
    }

    //------gettter-------//int flowerid,String flowername,int price,int rating,String type//
    public int get_flowerid()
    {
        return flowerid;
    }
    public String get_flowername()
    {
        return flowername;
    }
    public int get_price()
    {
        return price;
    }
    public int get_rating()
    {
        return rating;
    }
    public String get_type()
    {
        return type;
    }

}

class p19
{
    public static void main(String args[])
    {
        //   System.out.print()
        System.out.println("Print the no of objcts ot be added: ");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();sc.nextLine();
        System.out.println("ENter: "+num);

        Flower ob[]=new Flower[4];

        for(int i=0;i<num;i++)
        {
            //int flowerid,String flowername,int price,int rating,String type//
            System.out.print("enter flowerid: ");
            int a=sc.nextInt();sc.nextLine();
            System.out.print("enter flower name ");
            String b=sc.nextLine();
            System.out.print("enter price: ");
            int c=sc.nextInt();sc.nextLine();
            System.out.print("enter rating: ");
            int d= sc.nextInt();sc.nextLine();
            System.out.print("enter type: ");
            String  e=sc.nextLine();
            ob[i]=new Flower(a,b,c,d,e);
        }

        //-----------------------------------------//




    }


    //method......

    public static Flower findMinPriceByType(Flower[] ob,String p)
    {
        List<Flower> l1=new ArrayList<>();
        for(int i=0;i<ob.length;i++)
        {
            if(ob[i].get_rating()>3 && ob[i].get_type().equalsIgnoreCase(p))
            {
                l1.add(ob[i]);
            }
        }

        l1.sort(Comparator.comparingInt(Flower::get_rating));

        if(l1.isEmpty())
        {
            return null;
        }
        else
        {
           l1.sort(Comparator.comparingInt(Flower::get_price));
           return l1.get(0);
        }
           //using collections
           //Collections.min(l1,Comparator.comparingInt(Flower::get_rating));
           //points about collections:
           //Collections.min(...) does not sort.
    }
}

//It just finds the minimum based on the comparator logic.

//The original list order stays the same

/*using treemap be like:
TreeMap<Integer, Flower> map = new TreeMap<>();

for (int i = 0; i < ob.length; i++) {
    if (ob[i].get_rating() > 3 && ob[i].get_type().equalsIgnoreCase(p)) {
        map.put(ob[i].get_price(), ob[i]);
    }
}

if (map.isEmpty()) {
    return null;
} else {
    return map.firstEntry().getValue();
}
}*/

        