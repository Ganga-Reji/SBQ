import java.util.*;

class Course {
    // Attributes
    private String courseName;
    private int courseNumber;
    private String mode;
    private boolean shareData;

    // Parameterized constructor
    public Course(String courseName, int courseNumber, String mode, boolean shareData) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.mode = mode;
        this.shareData = shareData;
    }

    // Getters and Setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public boolean isShareData() {
        return shareData;
    }

    public void setShareData(boolean shareData) {
        this.shareData = shareData;
    }
}
class p53{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Course[] courses = new Course[4];

        // Reading 4 course objects
        for (int i = 0; i < courses.length; i++) {
            String name = sc.nextLine();
            int number = Integer.parseInt(sc.nextLine());
            String mode = sc.nextLine();
            boolean share = Boolean.parseBoolean(sc.nextLine());

            courses[i] = new Course(name, number, mode, share);
        }
        System.out.println("Enter the paramter: ");
        String str=sc.nextLine();
        int result=findCourseStatus(courses,str);
        if(result>=1000)
        {
            System.out.println("High");
        }
        else if(result>=500 && result<1000)
        {
            System.out.println("Medium");
        }
        else
            {
            System.out.println("Low");
        }
        

    }

    public static int findCourseStatus (Course[] ob,String str)
    {
        int count=0;
        for(int i=0;i<ob.length;i++)
        {
            if(ob[i].getCourseName().equalsIgnoreCase(str))
            {
                count=count+1;
            }

        }
        return count;

    }
}
