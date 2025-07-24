import java.util.*;
public class p35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] car = new Car[5];
        for (int i = 0; i < car.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();

            car[i] = new Car(a,b,c);
        }

        System.out.println("details");
        int p=sc.nextInt();
        sc.nextLine();
        Car[] res=RemoveAndRearrange(car,p);
        for(int i=0;i<res.length;i++)
    {
        System.out.println(res[i].getId()+" : "+res[i].getName());
    }    }

    private static Car[] RemoveAndRearrange(Car[] ob,int p)
    {
        List<Car> l=new ArrayList<>();
        for(int i=0;i<ob.length;i++)
        {
            if(ob[i].getId()!=p)
            {
                l.add(ob[i]);
            }

        }
        int newid=1001;
        for(int i=0;i<l.size();i++)
        {
            l.get(i).setId(newid);
            newid++;
        }
        return l.toArray(new Car[0]);
    }
}


class Car
{
    private int id;
    private String name;
    private String type;
    public Car(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
}