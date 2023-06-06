/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los
 * distintos productos que venderemos y el precio que tendrán. Además, se
 * necesita que la aplicación cuente con las funciones básicas. Estas las
 * realizaremos en el servicio. Como, introducir un elemento, modificar su
 * precio, eliminar un producto y mostrar los productos que tenemos con su
 * precio (Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto
 * y de valor el precio. Realizar un menú para lograr todas las acciones
 * previamente mencionadas.
 *
 * @author Pavilion
 */
public class ServicioTienda {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Double> lista = new HashMap();

    public HashMap<String, Double> cargarproducto() {

        String nupro = "";
        do {
            Tienda t = new Tienda();
            System.out.println("Ingrese producto");
            t.setProducto(sc.next());
            System.out.println("Ingrese precio");
            t.setPrecio(sc.nextDouble());
            lista.put(t.getProducto(), t.getPrecio());
            System.out.println("Su producto se cargo correctamente");
            System.out.println("Quiere ingresar mas productos");
            nupro = sc.next();

        } while (!"N".equalsIgnoreCase(nupro));
        return lista;
    }

    public void mostrar() {
        if (lista.isEmpty()) {
            System.out.println("No hay productos!");
        } else {
            System.out.println("Lista de productos disponibles");
            for (Map.Entry<String, Double> entry : lista.entrySet()) {

                System.out.println(entry.getKey() + ": $" + entry.getValue() + " por unidad");
            }

        }
    }

    public void modificarPrecio(Tienda t) {
        System.out.println("Que precio desea modificar");
        String pro = sc.next();
        if (lista.containsKey(pro)) {
            System.out.println("Ingrese el nuevo valor");

            t.setPrecio(sc.nextDouble());
            lista.put(pro, t.getPrecio());
            System.out.println("El producto se modifico correctamente");
        } else {
            System.out.println("El producto no se encuentra en la lista");
        }
        for (Map.Entry<String, Double> entry : lista.entrySet()) {

            System.out.println(entry.getKey() + ": $" + entry.getValue() + " por unidad");
        }
    }

    public void eliminarProducto(Tienda t) {
        System.out.println("Que producto desea eliminar");
        t.setProducto(sc.next());
        if (lista.containsKey(t.getProducto())) {
            lista.remove(t.getProducto());
        }

        for (Map.Entry<String, Double> entry : lista.entrySet()) {

            System.out.println(entry.getKey() + ": $" + entry.getValue() + " por unidad");
        }
    }
}
