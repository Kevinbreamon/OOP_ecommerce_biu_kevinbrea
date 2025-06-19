package tienda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarritoDeComprasTest {

    @Test
    void totalSeActualizaAlAgregar() throws Exception {
        ProductoDigital pd = new ProductoDigital(
                "Curso", 50f, "Educación", 30, 30,
                "desc", "img", "lic", 0);

        CarritoDeCompras c = new CarritoDeCompras(1);
        c.agregarProducto(pd, 2);

        assertEquals(100f, c.calcularTotal(), 0.001);
    }

    @Test
    void modificarCantidadRecalculaTotal() throws Exception {
        ProductoDigital pd = new ProductoDigital(
                "Curso", 10f, "Edu", 31, 31,
                "desc", "img", "lic", 0);

        CarritoDeCompras c = new CarritoDeCompras(2);
        c.agregarProducto(pd, 1);
        c.modificarCantidad(31, 4);

        assertEquals(40f, c.calcularTotal(), 0.001);
    }
}