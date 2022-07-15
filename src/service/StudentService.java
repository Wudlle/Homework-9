package service;

import module.Student;


public class StudentService {
    public void youngestFemale(Student[] arr) {
        int count = 0;

        for (Student student : arr) {
            if (student.getGender() == 'f') {
                count++;
            }
        }


        Student[] femaleStudents = new Student[count];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i].getGender() == 'f') {
                femaleStudents[j] = arr[i];
                j++;
            }
        }


        int minYear = femaleStudents[0].getYear();
        Student youngestStudent = femaleStudents[0];
        for (int i = 0; i < femaleStudents.length; i++) {
            if (femaleStudents[i].getYear() >= minYear){
                youngestStudent = femaleStudents[i];
            }
        }

        Student yougestStudent1 = new Student();

        yougestStudent1.print(youngestStudent);
    }
}
