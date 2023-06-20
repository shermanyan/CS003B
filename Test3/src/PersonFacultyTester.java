/**
 * This class tests the Person and Faculty class
 */
public class PersonFacultyTester {
    public static void main(String[] args) {

        Faculty jamalAshraf = new Faculty();
        Person sherman = new Person("Sherman Yan", 123321123,"12332 Broadway Street, Pasadena");

        System.out.println(jamalAshraf);
        System.out.println("Expected: name=Person, number=123456789, address=12345 Main Street, Pasadena CA, facultyID='cs12345");

        jamalAshraf.setFacultyID("cs54321");
        jamalAshraf.setName("Jamal Ashraf");

        System.out.println(jamalAshraf);
        System.out.println("Expected: name=Jamal Ashraf, number=123456789, address=12345 Main Street, Pasadena CA, facultyID='cs54321");

        System.out.println(sherman);
        System.out.println("Expected: name=Sherman Yan, number=123321123, address=12332 Broadway Street, Pasadena");

        sherman.setNumber(626666999);

        System.out.println(sherman);
        System.out.println("Expected: name=Sherman Yan, number=626666999, address=12332 Broadway Street, Pasadena");
    }
}

/* Sample Output
name=Person, number=123456789, address=12345 Main Street, Pasadena CA, facultyID='cs12345
Expected: name=Person, number=123456789, address=12345 Main Street, Pasadena CA, facultyID='cs12345
name=Jamal Ashraf, number=123456789, address=12345 Main Street, Pasadena CA, facultyID='cs54321
Expected: name=Jamal Ashraf, number=123456789, address=12345 Main Street, Pasadena CA, facultyID='cs54321
name=Sherman Yan, number=123321123, address=12332 Broadway Street, Pasadena
Expected: name=Sherman Yan, number=123321123, address=12332 Broadway Street, Pasadena
name=Sherman Yan, number=626666999, address=12332 Broadway Street, Pasadena
Expected: name=Sherman Yan, number=626666999, address=12332 Broadway Street, Pasadena
 */
