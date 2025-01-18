package sia.taco_cloud.data;

import sia.taco_cloud.models.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
