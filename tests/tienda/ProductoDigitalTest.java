package tienda;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ProductoDigitalTest {

    @Test
    void reducirStockNoAfectaAlDigital() throws Exception {
        ProductoDigital pd = new ProductoDigital(
                "E-book", 15f, "Libros", 20, 20,
                "PDF avanzado", "img", "licencia", 0);

        int antes = pd.getStock();
        pd.reducirStock(100);     // para digitales no cambia nada

        assertEquals(antes, pd.getStock());
    }
}