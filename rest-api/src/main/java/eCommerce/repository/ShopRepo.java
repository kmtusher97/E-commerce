package eCommerce.repository;

import eCommerce.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepo extends JpaRepository<Shop, Long> {
}
