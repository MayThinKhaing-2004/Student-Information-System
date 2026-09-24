package studentinformationsystem;

import java.util.ArrayList;
import java.util.UUID;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        
    Student student1 = new Student();
    student1.setId(UUID.randomUUID().toString()); 
    student1.setStudentNumber("250504510");
    student1.setNationalId("98902271918");
    student1.setName("May Thin"); 
    student1.setSurname("Khaing");
    student1.setBirthDate("2004-01-11");
    student1.setGender(Gender.FEMALE);
    student1.setEmail("maythinkhaing.2004.sf@gmail.com");
    student1.setPhoneNumbers("+905015911520");
    student1.setAddress("Istanbul, Turkey");
    student1.setProgramId("prog-01");
    student1.setEnrollmentYear((short) 2024);
    student1.setClassYear((short) 2);
    student1.setPhotoUrl("http://example.com/photo.jpg");
    student1.setCreatedAt("2026-09-24");   
    
    studentList.add(student1);
        
    System.out.println("=== Registered Students ===");
    for (Student s : studentList) {
        System.out.println(s.toString());
    }
    }
}
