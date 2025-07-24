import java.util.*;

import java.util.Scanner;

// Class to represent a Vegetable with required attributes
class Vegetable {
    // Private data members
    private int vegetableId;
    private String vegetableName;
    private int price;
    private int rating;

    // Parameterized constructor to initialize all fields
    public Vegetable(int vegetableId, String vegetableName, int price, int rating) {
        this.vegetableId = vegetableId;
        this.vegetableName = vegetableName;
        this.price = price;
        this.rating = rating;
    }

    // Getters and Setters for each field
    public int getVegetableId() {
        return vegetableId;
    }

    public void setVegetableId(int vegetableId) {
        this.vegetableId = vegetableId;
    }

    public String getVegetableName() {
        return vegetableName;
    }

    public void setVegetableName(String vegetableName) {
        this.vegetableName = vegetableName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
class p39
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Vegetable[] vegetables = new Vegetable[4];

        // Reading input for 4 vegetable objects
        System.out.println("Enter details for 4 vegetables (ID, Name, Price, Rating):");

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter Vegetable " + (i + 1) + " ID (integer):");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println("Enter Vegetable " + (i + 1) + " Name (string):");
            String name = sc.nextLine();

            System.out.println("Enter Vegetable " + (i + 1) + " Price (integer):");
            int price = Integer.parseInt(sc.nextLine());

            System.out.println("Enter Vegetable " + (i + 1) + " Rating (integer):");
            int rating = Integer.parseInt(sc.nextLine());

            // Creating vegetable object and storing it in array

            vegetables[i] = new Vegetable(id, name, price, rating);
            
        }

        

            System.out.println("enter rating to compare:");
            int rate=Integer.parseInt(sc.nextLine());

            Vegetable result=findMinimumPriceByRating(vegetables,rate);
            if(result==null )
            {
                System.out.print("No such vegetables");

            }
            else{
                System.out.println("id of veggie object: "+result.getVegetableId());
            }
    }

    public static Vegetable findMinimumPriceByRating(Vegetable[] ob,int r)
{
    List<Vegetable> l1=new ArrayList<Vegetable>();
    for(int i=0;i<ob.length;i++)
    {
        if(ob[i].getRating()>r)
        {
            l1.add(ob[i]);

        }
    }

    l1.sort(Comparator.comparingInt(Vegetable::getPrice));
    return l1.get(0);
}
}