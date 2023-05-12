package udemi.cursomicroserviciositems.clientes;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import udemi.cursomicroserviciositems.models.Producto;

import java.util.List;
import java.util.Optional;

@FeignClient(name = "servicio-productos", url="localhost:8001")
public interface ProductoClienteRest {
    @GetMapping("/all")
    public List<Producto> listar();

    @GetMapping("/byId/{id}")
    public Producto getById(@PathVariable Long id);


}
