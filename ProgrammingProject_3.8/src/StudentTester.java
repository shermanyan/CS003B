/*
Author: Sherman Yan
Input: None
Processing: Creates a three students and tests Student's methods
Output: Sample of how the Student class can be used
 */

import java.util.Random;

/**
 A class to test the Student class
 */
public class StudentTester {
    public static void main(String[] args) {

        Random numberGenerator = new Random();

        Student.lastStudentID = 123456;

        Student student1 = new Student("John", "Smith", Student.lastStudentID);
        Student student2 = new Student("Jerry", "Shore", Student.lastStudentID);
        Student student3 = new Student("Samantha", "La", Student.lastStudentID);

        for (int i = 0; i < 10 ; i++){
            student1.addQuiz(numberGenerator.nextFloat(100) + 1);
            student2.addQuiz(numberGenerator.nextFloat(100) + 1);
            student3.addQuiz(numberGenerator.nextFloat(100) + 1);
        }

        System.out.println("ID:" +  student1.getStudentID() +  " Name: " + student1.getName() );
        System.out.println("Total Score: " + student1.getTotalScore() + " Average: " + student1.getAverageScore());

        System.out.println("ID:" +  student2.getStudentID() +  " Name: " + student2.getName());
        System.out.println("Total Score: " + student2.getTotalScore() + " Average: " + student2.getAverageScore());

        System.out.println("ID:" +  student3.getStudentID() +  " Name: " + student3.getName());
        System.out.println("Total Score: " + student3.getTotalScore() + " Average: " + student3.getAverageScore());

    }
}

/* Sample Output
ID:123457 Name: John Smith
Total Score: 602.052 Average: 60.2052
ID:123458 Name: Jerry Shore
Total Score: 581.51086 Average: 58.151085
ID:123459 Name: Samantha La
Total Score: 511.48602 Average: 51.1486
*/