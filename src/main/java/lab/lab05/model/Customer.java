package lab.lab05.model;

import lab.lab04.Contact;
import lab.lab04.Country;
import lab.lab04.simple.SimplePerson;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class Customer extends SimplePerson {

    public Customer(String firstName, String lastName, Country country, int age, float height, boolean isProgrammer, boolean broke, List<Contact> contacts) {
        super(firstName, lastName, country, age, height, isProgrammer, broke, contacts);
    }
}
