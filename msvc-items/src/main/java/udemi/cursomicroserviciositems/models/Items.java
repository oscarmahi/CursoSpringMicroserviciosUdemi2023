package udemi.cursomicroserviciositems.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Items {

    private Producto producto;
    private Integer cantidad;

    public Double getTotal(){
        return producto.getPrecio()* this.cantidad.doubleValue();
    }

}
