
import java.util.*;
class Course
{
    private int courseid;
    private String coursename;
    private String courseadmin;
    private int quiz;
    private int handson;

    public Course(int courseid,String coursename,String courseadmin,int quiz,int handson)
    {
        this.courseid=courseid;
        this.coursename=coursename;
        this.courseadmin=courseadmin;
        this.quiz=quiz;
        this.handson=handson;


    }


     // Getter and Setter for courseId
     public int getCourseId() {
        return courseid;
    }

    public void setCourseId(int courseId) {
        this.courseid = courseId;
    }

    // Getter and Setter for courseName
    public String getCourseName() {
        return coursename;
    }

    public void setCourseName(String courseName) {
        this.coursename = courseName;
    }

    // Getter and Setter for courseAdmin
    public String getCourseAdmin() {
        return courseadmin;
    }

    public void setCourseAdmin(String courseAdmin) {
        this.courseadmin = courseAdmin;
    }

    // Getter and Setter for quiz
    public int getQuiz() {
        return quiz;
    }

    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }

    // Getter and Setter for handson
    public int getHandson() {
        return handson;
    }

    public void setHandson(int handson) {
        this.handson = handson;
    }
}



class pg1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of objects to be added: ");
        int num=sc.nextInt();sc.nextLine();



    }

  public  static  Course[] sortCourseByHandsOn(Course[] ob,int v)
    {
        //-------list--collections----ascending sorting-----//
        List<Course> l1=new ArrayList<>();
        for(int i=0;i<ob.length;i++)
        {
            if(ob[i].getHandson()<v)
            {
                l1.add(ob[i]);

            }
        }

        if(l1.isEmpty())
        {
            return null;
        }
        Collections.sort(l1,Comparator.comparingInt(Course::getHandson));

        return l1.toArray(new Course[0]);

        


    }

    //----------treemap-----collection--------ascending sorting--------------//
/* 
    {
        TreeMap<Integer,Course> treemap=new TreeMap<>();
        for(int i=0;i<ob.length;i++)
        {
            if(ob[i].getHandson()<v)
            {
                treemap.put(ob[i].getHandson(),ob[i]);
            }
        }

        if(treemap.isEmpty())
        {
            return null;
        }

        Collection<Course> treevalues=treemap.values();
        return treemap.toArray(new Course[0]);

    }

    */

    public static  int  findAvgOfQuizByAdm(Course[] ob,String v)
    {
        int average;int sum=0;
        int count=0;
        for(int i=0;i<ob.length;i++)
        {
            if(ob[i].getCourseAdmin().equalsIgnoreCase(v))
            {
                sum=sum+ob[i].getQuiz();
                count++;

            }

        }

        if(count==0)
        {
            return 0;
        }
        else{
            average=sum/count;
            return average;
        }
    }
}