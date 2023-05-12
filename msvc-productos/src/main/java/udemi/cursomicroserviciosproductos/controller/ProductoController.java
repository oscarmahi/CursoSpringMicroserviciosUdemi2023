package udemi.cursomicroserviciosproductos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import udemi.cursomicroserviciosproductos.model.Producto;
import udemi.cursomicroserviciosproductos.service.ProductoServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductoController {

    @Autowired
    ProductoServiceImpl productoService;

    @GetMapping("/all")
    public List<Producto> getAllController(){
        return productoService.findAllService();
    }

    @GetMapping("/byId/{id}")
    public Optional<Producto> getById(@PathVariable Long id){
        return productoService.findByIdService(id);
    }

}
