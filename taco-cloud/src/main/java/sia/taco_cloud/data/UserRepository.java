package sia.taco_cloud.data;

import org.springframework.data.repository.CrudRepository;
import sia.taco_cloud.models.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

}
