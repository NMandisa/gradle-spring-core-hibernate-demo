package za.co.mkhungo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.mkhungo.model.Order;

/**
 * @author Noxolo.Mkhungo
 */
public interface OrderRepository extends JpaRepository<Order,Long> {
}
