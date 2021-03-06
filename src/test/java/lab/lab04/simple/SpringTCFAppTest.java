package lab.lab04.simple;

import static lab.lab04.simple.SimplePersonTest.getExpectedPerson;
import static org.junit.jupiter.api.Assertions.assertEquals;

import lab.lab04.Person;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:ioc.xml")
@AllArgsConstructor(onConstructor = @__(@Autowired))
class SpringTCFAppTest {
	
	Person person;

	@Test
	void testInitPerson() {
		assertEquals(getExpectedPerson(), person);
		System.out.println(person);
	}

}
