package tienda;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class GestorInventarioFisicoTest {

    @Test
    void añadirProductoIncrementaStock() {
        GestorInventario inv = new GestorInventarioFisico();

        ProductoFisico p = new ProductoFisico(
                "Zapato", 30f, "Calzado", 40, 40,
                "Cuero", "img", 0, 0.5f, Arrays.asList("30x10x12"));

        inv.añadirProducto(p, 6);

        assertEquals(6, p.getStock());
    }
}