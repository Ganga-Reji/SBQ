import java.util.Scanner;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}

class p45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading Employee details
        System.out.println("Enter employee name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter employee age:");
        int age = scanner.nextInt();
        
        System.out.println("Enter employee salary:");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(name, age, salary);
        System.out.println("employee salary:");
        double sal=calculateYearlySalary(employee);
        System.out.println("yearly salary: "+sal);
        double tax=calculateTax(employee);
        System.out.println("tax: "+tax);


    }




    private static double calculateYearlySalary(Employee ob)
    {
        return ob.getSalary()*12;

    }

    private static double calculateTax(Employee ob)
    {
        double yearlySal=calculateYearlySalary(ob);
        double tax=0;
        if(yearlySal<=50000)
        {
            tax=0.1*yearlySal;

        }
        else if(yearlySal>50000 && yearlySal<=100000)
        {
            tax=(yearlySal-50000)*0.2+0.1*50000;
        }

        else if(yearlySal>100000)
        {
            tax=(yearlySal-100000)*0.3+0.2*50000+0.1*50000;
        }

        return tax;
    }
}
