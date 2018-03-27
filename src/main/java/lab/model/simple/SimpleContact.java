package lab.model.simple;

import lab.model.Contact;
import lombok.Builder;
import lombok.Value;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PRIVATE;

@Builder
@Value
public class SimpleContact implements Contact {
    String type;
    String value;
}
