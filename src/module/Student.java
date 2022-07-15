package module;


public class Student {
    private String name;
    private String lastName;
    private int year;
    private char gender;
    private boolean isPHD;
    private double mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isPHD() {
        return isPHD;
    }

    public void setPHD(boolean PHD) {
        isPHD = PHD;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }


    public void print(Student student) {
        System.out.println("Name: " + student.name);
        System.out.println("Surname: " + student.lastName);
        System.out.println("Age: " + (2022 - student.year));
        System.out.println("Gender: " + (student.gender == 'm' ? "male" : "female"));
        System.out.println("isPhd: " + (student.isPHD ? "Yes" : "true"));
        System.out.println("Mark: " + student.mark);
    }
}
