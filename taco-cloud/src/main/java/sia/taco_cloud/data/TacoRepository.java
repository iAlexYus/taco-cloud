package sia.taco_cloud.data;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sia.taco_cloud.models.Taco;
import sia.taco_cloud.models.TacoOrder;
import sia.taco_cloud.models.User;

import java.util.List;

public interface TacoRepository extends CrudRepository<Taco, Long> {

    Iterable<Taco> findAll();
//    Page<Taco> findAll(PageRequest pageable);

}
