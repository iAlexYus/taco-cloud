package sia.taco_cloud.data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import sia.taco_cloud.models.TacoOrder;

import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
//    TacoOrder save(TacoOrder order);

    //Spring автоматически определяет запрос по имени метода
    //когда есть глагол(find, get и т.д.) и слово By
    List<TacoOrder> findByDeliveryZip(String deliveryZip);

    @Query(value = "Select o from Taco_Order o where o.deliveryCity='Seattle'",
            nativeQuery = true)
    List<TacoOrder> readOrdersDeliveredInSeattle();
}
