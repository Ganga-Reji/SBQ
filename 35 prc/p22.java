import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Associate {
    private int id;
    private String name;
    private String technology;
    private int experienceInYears;

    // Constructor
    public Associate(int id, String name, String technology, int experienceInYears) {
        this.id = id;
        this.name = name;
        this.technology = technology;
        this.experienceInYears = experienceInYears;
    }

    // Getters
    public int getId() {
        return id;
    }

    public int getexperienceInYears()
    {
        return experienceInYears;
    }

    public String getTechnology() {
        return technology;
    }
}

public class p22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Associate[] associates = new Associate[5];

        // Reading values for five Associate objects
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Associate " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Technology: ");
            String technology = scanner.nextLine();

            System.out.print("Experience in Years: ");
            int experienceInYears = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Creating the Associate object and adding it to the array
            associates[i] = new Associate(id, name, technology, experienceInYears);
        }

        // Reading the search technology
        System.out.print("Enter the technology to search for: ");
        String searchTechnology = scanner.nextLine();

        //---------------method-------------------//

        Associate[] result=associatesForGivenTechnology(associates, searchTechnology);
        for(int i=0;i<associates.length;i++)
        {
            System.out.print(result[i].getId()+" ");

        }

    }
    //------------------------
    private static Associate[]  associatesForGivenTechnology(Associate[] ob,String s)
    {
        List<Associate> l1=new ArrayList<>();
        for(int i=0;i<ob.length;i++)
        {
            if((ob[i].getTechnology().equals(s)) && (ob[i].getexperienceInYears()%5==0))
            {
                l1.add(ob[i]);

            }
        }
        return l1.toArray(new Associate[0]);
    }

   
    }

