import java.util.*;
public class p36 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        MobileDetails[] mb = new MobileDetails[5];
        for (int i = 0; i < mb.length; i++) 
        {
            int a = sc.nextInt();sc.nextLine();
            int b = sc.nextInt();sc.nextLine();
            String c = sc.nextLine();
            boolean d = sc.nextBoolean();sc.nextLine();

            mb[i] = new MobileDetails(a, b, c, d);
        }
        MobileDetails[] ob=getSecondMin(mb);
        System.out.println("price: "+ob[1].getPrice()+" "+ob[1].getBrand());
    }
    //-------------------------------------------------

    private static MobileDetails[] getSecondMin(MobileDetails[] ob)
    {
        TreeMap<Integer,MobileDetails> map=new TreeMap<>();
        for(int i=0;i<ob.length;i++)
        {
            map.put(ob[i].getPrice(),ob[i]);

          
        }
        /*If the array ob has fewer than two unique prices, attempting to access ob[1] will cause an ArrayIndexOutOfBoundsException. 
        Adding a check to ensure at least two unique entries in the TreeMap would be helpful. */
          // Ensure there are at least two unique prices
    if (map.size() < 2) {
        return null; // Handle case with less than two unique prices
    }
        return map.values().toArray(new MobileDetails[0]);
    }


}

class MobileDetails
{
    private int id;
    private int price;
    private String brand;
    private boolean isFlagShip;
    
    public MobileDetails(int id, int price, String brand, boolean isFlagShip) {
        this.id = id;
        this.price = price;
        this.brand = brand;
        this.isFlagShip = isFlagShip;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public boolean isFlagShip() {
        return isFlagShip;
    }
    public void setFlagShip(boolean isFlagShip) {
        this.isFlagShip = isFlagShip;
    }
    
}