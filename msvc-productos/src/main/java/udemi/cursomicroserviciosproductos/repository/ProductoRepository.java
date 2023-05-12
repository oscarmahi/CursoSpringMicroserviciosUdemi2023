package udemi.cursomicroserviciosproductos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import udemi.cursomicroserviciosproductos.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {



}
