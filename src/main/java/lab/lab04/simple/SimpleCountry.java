package lab.lab04.simple;

import lab.lab04.Country;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PRIVATE;

@Data
@Builder
@FieldDefaults(level = PRIVATE)
public class SimpleCountry implements Country {
    String name;
    String codeName;
}
