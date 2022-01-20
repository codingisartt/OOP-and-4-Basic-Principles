public class Course {
    private String courseName;
    private String code;
    private Instructor instructor; // composition (is a)

    public Course(String courseName, String code,Instructor instructor){
        this.courseName=courseName;
        this.code=code;
        this.instructor=instructor;
    }
    public String getcourseName(){
        return this.courseName;
    }
    public void setcourseName(String courseName){
        this.courseName=courseName;
    }
    public String getCode(){
        return this.code;
    }
    public void setSurName(String code){
        this.code=code;
    }
    public Instructor getInstructor(){
        return this.instructor;
    }
    public void setInstructor(Instructor instructor){
        this.instructor=instructor;
    }

    // Course USES A Student (Course sınıfı Student sınıfına bağlı)
    public double calcAverage(Student[] students){
        Student st4=new Student( "", "", "", "",123);
        double average=0;
        for (Student student : students) {  //for(int i=0;i<students.length;i++)
            average+=student.getNote();
        }
        return average/students.length;
    }
}
