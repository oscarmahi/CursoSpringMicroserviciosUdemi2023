package udemi.cursomicroserviciosproductos.service;

import udemi.cursomicroserviciosproductos.model.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {

    public List<Producto> findAllService();
    public Optional<Producto> findByIdService(Long id);

}
