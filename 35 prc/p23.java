import java.util.Scanner;
import java.util.TreeMap;

class Institution {
    private int institutionId;
    private String institutionName;
    private int noOfStudentsPlaced;
    private int noOfStudentsCleared;
    private String location;
    //grade
    private String grade;

    // Constructor without grade
    public Institution(int institutionId, String institutionName, int noOfStudentsPlaced, int noOfStudentsCleared, String location) {
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.noOfStudentsPlaced = noOfStudentsPlaced;
        this.noOfStudentsCleared = noOfStudentsCleared;
        this.location = location;
    }

    // Getters and Setters
    public int getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(int institutionId) {
        this.institutionId = institutionId;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public int getNoOfStudentsPlaced() {
        return noOfStudentsPlaced;
    }

    public void setNoOfStudentsPlaced(int noOfStudentsPlaced) {
        this.noOfStudentsPlaced = noOfStudentsPlaced;
    }

    public int getNoOfStudentsCleared() {
        return noOfStudentsCleared;
    }

    public void setNoOfStudentsCleared(int noOfStudentsCleared) {
        this.noOfStudentsCleared = noOfStudentsCleared;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
//grade
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

public class p23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to hold four Institution objects
        Institution[] institutions = new Institution[2];

        // Loop to read values for each Institution object
        for (int i = 0; i < institutions.length; i++) {
            System.out.println("Enter details for Institution " + (i + 1) + ":");

            System.out.print("Institution ID: ");
            int institutionId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Institution Name: ");
            String institutionName = scanner.nextLine();
         

            System.out.print("Number of Students Placed: ");
            int noOfStudentsPlaced = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Number of Students Cleared: ");
            int noOfStudentsCleared = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Location: ");
            String location = scanner.nextLine();

            // Creating the Institution object and adding it to the array
            institutions[i] = new Institution(institutionId, institutionName, noOfStudentsPlaced, noOfStudentsCleared, location);
        }
        System.out.println("enter location:");
        String loc=scanner.nextLine();

        // Additional code can go here to work with the 'grade' attribute or other logic
        

        int sum_res=FindNumClearancedByLoc(institutions,loc);
        if(sum_res>0)
        {
            System.out.println((sum_res));
        }
        else{
            System.out.println("There are no cleared students in this particular location");
        }
        System.out.println("Name: ");
        String name=scanner.nextLine();

       
        Institution returned=UpdateInstitutionGrade(institutions,name);
        System.out.println(returned.getInstitutionName()+"::"+returned.getGrade());

    }



    //methods
    private static  int   FindNumClearancedByLoc(Institution[] ob,String s)
    {
        int sum=0;
        for(int i=0;i<ob.length;i++)
        {
            if(ob[i].getLocation().equalsIgnoreCase(s))
            {
                sum=sum+ob[i].getNoOfStudentsCleared();
            }

        }
        if(sum<0)
        {
            return 0;
        }

        else{
            return sum;
        }

    }

    //second method
    private static Institution UpdateInstitutionGrade(Institution[] ob,String s)
    {
        //TreeMap <Institution,Integer> map= new TreeMap<>();
        int rating;
        for(int i=0;i<ob.length;i++)
        {
            if(ob[i].getInstitutionName().equalsIgnoreCase(s))
            {
                rating=(ob[i].getNoOfStudentsCleared()*100)/ob[i].getNoOfStudentsCleared();
                if(rating>=80)
                {
                    ob[i].setGrade("A");
                }
                else
                {
                    ob[i].setGrade("B");
                }
                    return ob[i];

               // map.put(ob[i],i);
            }
        }
        return null;

       // return map.toArray(new Institution(0));
    }
}
