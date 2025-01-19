package sia.taco_cloud.data;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.Repository;
import sia.taco_cloud.models.Ingredient;

//import java.util.Optional;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
    //extends CrudRepository<Ingredient, String>

//    Iterable<Ingredient> findAll();
//
//    Optional<Ingredient> findById(String id);
//
//    Ingredient save(Ingredient ingredient);
}
