package sia.taco_cloud.data;

import org.springframework.data.repository.CrudRepository;
import sia.taco_cloud.models.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
//    TacoOrder save(TacoOrder order);
}
