package sia.taco_cloud.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
//import org.springframework.data.relational.core.mapping.Table;

@Data
//@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@RequiredArgsConstructor
public class Ingredient {

    @Id
    private final String id;

    private final String name;

    private final Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
