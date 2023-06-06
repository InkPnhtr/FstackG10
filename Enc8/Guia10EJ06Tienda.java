package main;

import Entidad.Tienda;
import Servicio.ServicioTienda;

public class Guia10EJ06Tienda {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Tienda i = new Tienda();
        ServicioTienda st = new ServicioTienda();
        st.cargarproducto();
        st.mostrar();
        st.modificarPrecio(i);
        st.eliminarProducto(i);
    }
}
