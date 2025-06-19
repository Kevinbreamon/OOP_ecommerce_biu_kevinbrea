package tienda;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import tienda.excepciones.InventarioInsuficienteException;

class ProductoFisicoTest {

    @Test
    void reducirStockDisminuyeCantidad() throws Exception {
        ProductoFisico p = new ProductoFisico(
                "Camisa", 20f, "Ropa", 10, 10,
                "Algodón", "img", 8, 0.3f, Arrays.asList("30x20x2"));

        int antes = p.getStock();
        p.reducirStock(3);

        assertEquals(antes - 3, p.getStock());
    }

    @Test
    void reducirStockLanzaExcepcionSiInsuficiente() {
        ProductoFisico p = new ProductoFisico(
                "Camisa", 20f, "Ropa", 11, 11,
                "Algodón", "img", 1, 0.3f, Arrays.asList("30x20x2"));

        assertThrows(InventarioInsuficienteException.class,
                     () -> p.reducirStock(5));      // ← lambda
    }
}