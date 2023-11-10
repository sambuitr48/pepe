package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exmpl1Sort {
    public static void main(String[] args) {
        List<Producto> menu = Arrays.asList(
                new Producto("Hamburguesa", 599),
                new Producto("Papas Fritas", 249),
                new Producto("Refresco", 199),
                new Producto("Ensalada", 429)
        );

        menu.stream()
                .sorted(Comparator.comparing(Producto::getPrecio))
                .forEach(producto -> System.out.println("Nombre: " + producto.getComida() + ", Precio: " + producto.getPrecio()));
    }
}
