
import java.util.*;
public class p{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] car = new Car[4];
        for (int i = 0; i < car.length; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();

            car[i] = new Car(a,b,c,d);
        }
    }
}



class Car
{
    private String make;
    private String model;
    private int year;
    private double price;
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
}