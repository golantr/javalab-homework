package lab.model.simple;

import lab.model.Contact;
import lab.model.Country;
import lab.model.Person;
import lombok.Builder;
import lombok.Singular;
import lombok.Value;
import lombok.experimental.Wither;

import java.util.List;

@Builder
@Value
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
