package lab.lab04.simple;

import lab.lab04.Contact;
import lab.lab04.Country;
import lab.lab04.Person;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SimplePerson implements Person {
    String firstName;
    String lastName;
    Country country;
    int age;
    float height;
    boolean isProgrammer;
    boolean broke;

    @Singular
    List<Contact> contacts;
}
