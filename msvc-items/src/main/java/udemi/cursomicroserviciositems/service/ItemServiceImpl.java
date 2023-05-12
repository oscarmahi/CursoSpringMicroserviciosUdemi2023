package udemi.cursomicroserviciositems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import udemi.cursomicroserviciositems.models.Items;
import udemi.cursomicroserviciositems.models.Producto;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemsService{

    @Autowired
    private RestTemplate clienteRest;

    @Override
    public List<Items> findAll() {
        List<Producto> productos = Arrays.asList(clienteRest.getForObject("http://localhost:8001/all", Producto[].class));
        return productos.stream().map(p -> new Items(p, 1)).collect(Collectors.toList());
    }

    @Override
    public Items findById(Long id, Integer cantidad) {
        Map<String, String> pathVariables = new HashMap<String, String>();
        pathVariables.put("id", id.toString());
        Producto producto = clienteRest.getForObject("http://localhost:8001/byId/{id}", Producto.class, pathVariables);
        return new Items(producto, cantidad);
    }
}
