import module.Student;
import service.StudentService;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setName("Ani");
        s1.setLastName("Mkrtchyan");
        s1.setYear(2003);
        s1.setGender('f');
        s1.setPHD(true);
        s1.setMark(43.2);


        s2.setName("Anna");
        s2.setLastName("Karapetyan");
        s2.setYear(1999);
        s2.setGender('f');
        s2.setPHD(true);
        s2.setMark(3.2);


        s3.setName("Misak");
        s3.setLastName("Minasyan");
        s3.setYear(2001);
        s3.setGender('m');
        s3.setPHD(false);
        s3.setMark(43.2);

        Student[] students = {s1, s2, s3};

        StudentService youngFemale = new StudentService();

        youngFemale.youngestFemale(students);
    }
}
