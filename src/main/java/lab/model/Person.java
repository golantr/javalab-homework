package lab.model;

import java.util.List;

public interface Person {
    String getFirstName();

    String getLastName();

    Country getCountry();

    int getAge();

    float getHeight();

    boolean isProgrammer();

    boolean isBroke();

    List<Contact> getContacts();
}
