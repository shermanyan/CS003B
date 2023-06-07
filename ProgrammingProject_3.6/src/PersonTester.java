/*
Author: Sherman Yan, Henry Thai
Input: None
Processing: Creates three people and assigns friends
Output: Sample of how the person class could be used
 */

/**
 A class to test the Person class
 */
public class PersonTester {
    public static void main(String[] args) {
        Person person1 = new Person("Alpha");
        Person person2 = new Person("Beta");
        Person person3 = new Person("Gamma");

        person1.befriend(person2);
        person1.befriend(person3);
        person2.befriend(person3);

        System.out.println(person1.getName() + "'s friends: " + person1.getFriendNames());
        System.out.println(person1.getName() + "'s friends: " + person1.getFriendNames());
        System.out.println(person3.getName() + "'s friends: " + person3.getFriendNames());

        person1.unfriend(person2);

        System.out.println(person1.getName() + " unfriends " + person2.getName());

        System.out.println(person1.getName() + "'s friends: " + person1.getFriendNames());
        System.out.println(person1.getName() + "'s friends: " + person1.getFriendNames());
        System.out.println(person3.getName() + "'s friends: " + person3.getFriendNames());
    }
}

/* Sample Output

Alpha's friends: Beta Gamma
Alpha's friends: Beta Gamma
Gamma's friends: Alpha Beta
Alpha unfriends Beta
Alpha's friends: Gamma
Alpha's friends: Gamma
Gamma's friends: Alpha Beta

 */
