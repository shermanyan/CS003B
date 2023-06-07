/*
Author: Sherman Yan, Henry Thai
 */

import java.util.ArrayList;
import java.util.List;

/**
 A class to hold a Person's friend names.
 */
public class Person {
    private String name;
    private List<Person> friends;

    /**
     * Constructs a Person with the given name
     * @param name the name of the person
     */
    public Person(String name) {
        this.name = name;
        this.friends = new ArrayList<>();
    }

    /**
     * Befriends the given person
     * @param p person
     */
    public void befriend(Person p) {
        if (p != null && !friends.contains(p)) {
            friends.add(p);
            p.befriend(this); // Befriend the other person reciprocally
        }
    }

    /**
     * Unfriends the given person
     * @param p person
     */
    public void unfriend(Person p) {
        if (p != null && friends.contains(p)) {
            friends.remove(p);
            p.unfriend(this); // Unfriend the other person reciprocally
        }
    }

    /**
     * Gets friend names
     * @return returns friend names
     */
    public String getFriendNames() {
        StringBuilder friendNames = new StringBuilder();
        for (Person friend : friends) {
            friendNames.append(friend.getName()).append(" ");
        }
        return friendNames.toString().trim();
    }

    /**
     * Gets name of the person
     * @return name of the person
     */
    public String getName() {
        return name;
    }

}
