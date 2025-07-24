import java.util.*;
class Circle{
    private int id;
    private String name;
    private double bal;
    private double rate;
    private String circle;

    public Circle(int id,String name,double bal,double rate,String circle )
{
    this.id=id;
    this.name=name;
    this.bal=bal;
    this.rate=rate;
    this.circle=circle;
}

public String get_circle()
{
    return circle;

}

public double get_rate()
{
    return rate;
}

public int get_id()
{
    return id;
}

public String get_name()
{
    return name;
}



public void set_circle(String c)
{
    this.circle=c;
}

}


class p7{
    public static void main(String[] args) {
        Circle[] ob=new Circle[5];
        Scanner sc=new Scanner(System.in);
        //String name,double bal,double rate,String circle 

        for(int i=0;i<5;i++)
        {
            int a=sc.nextInt();
            sc.nextLine();
            String b=sc.nextLine();
            double c=sc.nextDouble();
            sc.nextLine();
            double d=sc.nextDouble();
            sc.nextLine();
            String e=sc.nextLine();

            ob[i]=new Circle(a,b,c,d,e);


        }
        System.out.println("two cicrles");
        String c1=sc.nextLine();
        String c2=sc.nextLine();

        Circle[] res=transferCustomerCircle(ob,c1,c2);
        for(int i=0;i<res.length;i++)
        {
            System.out.println(res[i].get_id()+" "+res[i].get_name()+" "+res[i].get_circle()+" "+res[i].get_rate());

        }
        //simId,

//customerName,circle and ratePerSecond of returned objects 


    }
        private static Circle[] transferCustomerCircle(Circle[] ob,String c1,String c2)
        {
            TreeMap<Double,Circle> map=new TreeMap<>(Collections.reverseOrder());
            for(int i=0;i<ob.length;i++)
            {
                if(ob[i].get_circle().equals(c1))
                {
                    ob[i].set_circle(c2);
                    map.put(ob[i].get_rate(),ob[i]);
                }
            }

            return map.values().toArray(new Circle[0]);
        }

    }

