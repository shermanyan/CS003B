/*
Author: Sherman Yan, Henry Thai
 */

/**
 A class that simulates the features of a microwave.
 */
public class Student {

    /**
     * Static variable for last student ID, used to create a new id for new student
     */
    static public int lastStudentID = 0;

    private String firstname, lastName;
    private int id;
    private float totalScore;
    private int numQuizzes;


    /**
     * Constructor creates a new student with given name and id
     * @param firstName first name of student
     * @param lastName last name of student
     * @param lastStudentID id of last student
     */
    public Student(String firstName, String lastName, int lastStudentID) {
        this.firstname = firstName;
        this.lastName = lastName;

        totalScore = 0.0f;
        numQuizzes = 0;

        setStudentIdNumber(lastStudentID);
    }

    /**
     * Gets the name of the student
     * @return name of student
     */
    public String getName() {
        return firstname +  " " + lastName;
    }

    /**
     * Adds quiz score to total score
     * @param score score to be added
     */
    public void addQuiz(float score){
        numQuizzes++;
        totalScore += score;
    }

    /**
     * Returns the total score of student
     * @return the total score of student
     */
    public float getTotalScore(){
        return totalScore;
    }

    /**
     * Gets the average score of student
     * @return average score of student
     */
    public float getAverageScore(){
        return totalScore/numQuizzes;
    }

    /**
     * Set the student id number
     * @param lastStudentID the id number of previous student
     */
    public void setStudentIdNumber(int lastStudentID){
        id = lastStudentID + 1;
        Student.lastStudentID = id;

    }

    /**
     * Returns the student id number
     * @return student id number
     */
    public int getStudentID(){
        return id;
    }

}
