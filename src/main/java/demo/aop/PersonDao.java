package demo.aop;

import lab.lab04.Person;
import lombok.experimental.FieldDefaults;

import java.sql.SQLException;

import static lombok.AccessLevel.PRIVATE;

@FieldDefaults(level = PRIVATE)
public class PersonDao {

    public Person get(Integer id) throws SQLException {
        return null;
    }
}
