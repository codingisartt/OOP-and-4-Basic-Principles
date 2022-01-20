public class Main {
    public static void main(String[] args) {
        Student st1=new Student("Tubanur", "Balci", "74", "ABC", 100);
        Student st2=new Student("Patika", "Dev", "102", "CODE", 80);
        Instructor teacher=new Instructor("Ayşegül", "Balci", "MED");
        Course mat=new Course("MAT 101", "MAt",teacher);
        
        //Course "HAS A" instructor.(Sınıfın bir öğretmeni vardır)
        System.out.println(mat.getInstructor().getName()); //teacher.getName() Composition(Birleştirme)  Aggregation
        
        Student[] stu={st1,st2}; // Dependency (uses a)
        mat.calcAverage(stu);
        System.out.println("Ortalama: "+mat.calcAverage(stu));
        System.out.println(st2.getNote());
    }
}
