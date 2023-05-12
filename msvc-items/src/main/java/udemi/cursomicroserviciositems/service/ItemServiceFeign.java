package udemi.cursomicroserviciositems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import udemi.cursomicroserviciositems.clientes.ProductoClienteRest;
import udemi.cursomicroserviciositems.models.Items;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Primary    //esto es como tenemos dos implementaciones, para que sepa cual es la q se va a utilizar
public class ItemServiceFeign implements ItemsService{

    @Autowired
    ProductoClienteRest productoClienteRest;

    @Override
    public List<Items> findAll() {
        return productoClienteRest.listar().stream().map(p -> new Items(p, 1)).collect(Collectors.toList());
    }

    @Override
    public Items findById(Long id, Integer cantidad) {
        return new Items(productoClienteRest.getById(id), cantidad);
    }
}
