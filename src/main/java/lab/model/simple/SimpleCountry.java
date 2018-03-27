package lab.model.simple;

import lab.model.Country;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class SimpleCountry implements Country {
    String name;
    String codeName;
}
