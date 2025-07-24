import java.util.*;

class Person {
    private String firstName;
    private String lastName;
    private int age;
    private char gender; // 'M' for male, 'F' for female

    public Person(String firstName, String lastName, int age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    // Getters and Setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public char getGender() { return gender; }
    public void setGender(char gender) { this.gender = gender; }
}

class Student extends Person
{
    private String rollNo;
    private String course;
    private int semester;
    private double GPA;

    public Student(String firstName, String lastName, int age, char gender, String rollNo, String course, int semester, double GPA) {
        super(firstName, lastName, age, gender);
        this.rollNo = rollNo;
        this.course = course;
        this.semester = semester;
        this.GPA = GPA;
    }

    // Getters and Setters
    public String getRollNo() { return rollNo; }
    public void setRollNo(String rollNo) { this.rollNo = rollNo; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public int getSemester() { return semester; }
    public void setSemester(int semester) { this.semester = semester; }

    public double getGPA() { return GPA; }
    public void setGPA(double GPA) { this.GPA = GPA; }
}

class Faculty extends Person{
private String employeeId;
private String department;
private String designation;
private double salary;

public Faculty(String firstName, String lastName, int age, char gender, String employeeId, String department, String designation, double salary) {
    super(firstName, lastName, age, gender);
    this.employeeId = employeeId;
    this.department = department;
    this.designation = designation;
    this.salary = salary;
}

// Getters and Setters
public String getEmployeeId() { return employeeId; }
public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

public String getDepartment() { return department; }
public void setDepartment(String department) { this.department = department; }

public String getDesignation() { return designation; }
public void setDesignation(String designation) { this.designation = designation; }

public double getSalary() { return salary; }
public void setSalary(double salary) { this.salary = salary; }
}


//-------------main method--//

class p42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read Student objects
        Student[] students = new Student[2];
        for (int i = 0; i < 2; i++) {
            String firstName = sc.nextLine();
            String lastName = sc.nextLine();
            int age = sc.nextInt();
            char gender = sc.next().charAt(0);
            sc.nextLine(); // Consume newline
            String rollNo = sc.nextLine();
            String course = sc.nextLine();
            int semester = sc.nextInt();
            double GPA = sc.nextDouble();
            sc.nextLine(); // Consume newline

            students[i] = new Student(firstName, lastName, age, gender, rollNo, course, semester, GPA);
        }

        // Read Faculty objects
        Faculty[] faculties = new Faculty[2];
        for (int i = 0; i < 2; i++) {
            String firstName = sc.nextLine();
            String lastName = sc.nextLine();
            int age = sc.nextInt();
            char gender = sc.next().charAt(0);
            sc.nextLine(); // Consume newline
            String employeeId = sc.nextLine();
            String department = sc.nextLine();
            String designation = sc.nextLine();
            double salary = sc.nextDouble();
            sc.nextLine(); // Consume newline

            faculties[i] = new Faculty(firstName, lastName, age, gender, employeeId, department, designation, salary);
        }
        System.out.println("student details to be found");
        Student high_gpa=findHighestGPAStudent(students);
        System.out.println("roll no: "+high_gpa.getRollNo()+"course: "+high_gpa.getCourse()+"GPA: "+ high_gpa.getGPA());
        System.out.println("faculty details to be found");
        Faculty highsal=findHighestPaidFaculty(faculties);
        System.out.println("employeeid: "+highsal.getEmployeeId()+"department: "+highsal.getDepartment()+"salary: "+ highsal.getSalary());

    }

    private static Student findHighestGPAStudent(Student[] ob)
    {
        if(ob==null || ob.length==0)
        {
            return null;
        }
        Student high=ob[0];
        for(int i=0;i<ob.length;i++)
        {
            if(ob[i].getGPA()>high.getGPA())
            {
                high=ob[i];
            }
        }
        return high;
      

    }

    private static Faculty findHighestPaidFaculty(Faculty[] ob)
    {
        if(ob==null || ob.length==0)
        {
            return null;
        }
        Faculty high=ob[0];
        for(int i=0;i<ob.length;i++)
        {
            if(ob[i].getSalary()>high.getSalary())
            {
                high=ob[i];
            }
        }
        return high;

    }

}
