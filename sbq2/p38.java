import java.util.*;

class HeadSets {
    private String headsetName;
    private String brand;
    private int price;
    private boolean available;

    // Constructor
    public HeadSets(String headsetName, String brand, int price, boolean available) {
        this.headsetName = headsetName;
        this.brand = brand;
        this.price = price;
        this.available = available;
    }

    // Getters and Setters
    public String getHeadsetName() {
        return headsetName;
    }

    public void setHeadsetName(String headsetName) {
        this.headsetName = headsetName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
class p38
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of headsets: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        HeadSets[] arr = new HeadSets[n];
              for (int i = 0; i < n; i++) {
            System.out.println("Enter details for headset " + (i + 1) + ":");

            System.out.print("Headset Name: ");
            String headsetName = sc.nextLine();

            System.out.print("Brand: ");
            String brand = sc.nextLine();

            System.out.print("Price: ");
            int price = sc.nextInt();

            System.out.print("Available (true/false): ");
            boolean available = sc.nextBoolean();
            sc.nextLine(); // consume leftover newline

            arr[i] = new HeadSets(headsetName, brand, price, available);
        }

        HeadSets res=findAvailableHeadsetWithSecondMinPrice(arr);
        if(res!=null)
        {
            System.out.println("headset name:"+res.getHeadsetName()+" "+"headset price:"+res.getPrice());

        }
        else{
            System.out.println("No headsets avalaiable");
        }
    }

    public static int findTotalPriceForGivenBrand(String str,HeadSets[] ob)
    {
        int totalprice=0;
        for(int i=0;i<ob.length;i++)
        {
            if(ob[i].getBrand().equals(ob))
            {
                totalprice=totalprice+ob[i].getPrice();
            }
        }

        if(totalprice==0)
        {
            return 0;
        }

        else{
            return totalprice;
        }
    }

    public static HeadSets findAvailableHeadsetWithSecondMinPrice(HeadSets[] ob)
    {
        
        List<HeadSets> l1=new ArrayList<>();
        for(int i=0;i<ob.length;i++)
        {
            if(ob[i].isAvailable()==true)
            {
                l1.add(ob[i]);  
            }
            
        }

        Comparator<HeadSets> comp=Comparator.comparingInt(HeadSets::getPrice);
        l1.sort(comp);
        return l1.get(1);

    }
}