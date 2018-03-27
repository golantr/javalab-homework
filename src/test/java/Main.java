import lab.model.Person;
import lab.model.simple.SimpleContact;
import lab.model.simple.SimpleCountry;
import lab.model.simple.SimplePerson;
import lombok.experimental.FieldDefaults;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static lombok.AccessLevel.PRIVATE;
import static org.junit.jupiter.api.Assertions.assertEquals;

@FieldDefaults(level = PRIVATE)
public class Main {

    static final String APPLICATION_CONTEXT_XML_FILE_NAME = "ioc.xml";

    private BeanFactory context = new ClassPathXmlApplicationContext(
            APPLICATION_CONTEXT_XML_FILE_NAME);

    @Test
    void testInitPerson() {
        Person person = context.getBean("person", Person.class);
        assertEquals(getExpectedPerson(), person);
    }

    private Person getExpectedPerson() {
        return SimplePerson.builder()
                .age(35)
                .broke(false)
                .country(SimpleCountry.builder().name("Russia").codeName("RU").build())
                .contact(SimpleContact.builder().type("EMAIL").value("asd@asd.ru").build())
                .contact(SimpleContact.builder().type("TELEPHONE").value("+55 11 99999-5555").build())
                .firstName("John")
                .lastName("Smith")
                .height(1.78f)
                .isProgrammer(true)
                .build();
    }
}
