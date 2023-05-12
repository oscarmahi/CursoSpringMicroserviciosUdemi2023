package udemi.cursomicroserviciositems.service;

import udemi.cursomicroserviciositems.models.Items;

import java.util.List;

public interface ItemsService {

    public List<Items> findAll();
    public Items findById(Long id, Integer cantidad);


}
