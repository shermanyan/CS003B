/**
 * This class is an extension of the person class plus faculty ID
 */
public class Faculty {
    private Person person;
    private String facultyID;

    /**
     * Default constructor creates a default person with ID ="cs12345"
     */
    public Faculty() {
        person = new Person();
        facultyID = "cs12345";
    }

    /**
     * Constructor to create a Faculty with name, number, address, and ID
     * @param name
     * @param number
     * @param address
     * @param facultyID
     */
    public Faculty(String name, int number, String address, String facultyID) {
        this.person = new Person(name, number, address);
        this.facultyID = facultyID;
    }

    /**
     * Set the ID of faculty
     * @return
     */
    public String getFacultyID() {
        return facultyID;
    }

    /**
     * Set the ID of faculty
     * @param facultyID
     */
    public void setFacultyID(String facultyID) {
        this.facultyID = facultyID;
    }

    /**
     * Set the name of the faculty
     * @param name
     */
    public void setName(String name){
        person.setName(name);
    }
    /**
     * Overridden toString() returns the data of this class as String
     * @return
     */
    public String toString() {
        return person + ", facultyID='" + facultyID;
    }


}
