package udemi.cursomicroserviciositems.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import udemi.cursomicroserviciositems.models.Items;
import udemi.cursomicroserviciositems.service.ItemServiceImpl;
import udemi.cursomicroserviciositems.service.ItemsService;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemsService itemsService;

    @GetMapping("/listaitems")
    public List<Items> listarItems(){
        return itemsService.findAll();
    }

    @GetMapping("/detalle/{id}/cantidad/{cantidad}")
    public Items detalle(@PathVariable Long id, @PathVariable Integer cantidad){
        return itemsService.findById(id, cantidad);
    }




}
