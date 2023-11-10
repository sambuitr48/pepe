package filter;

import java.util.Arrays;
import java.util.List;

public class Exmplfilter1Empleado {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = Arrays.asList(
                new Empleado(1, "Laura", 3500, "Cocina"),
                new Empleado(2, "Juan Manuel", 1500, "Animador"),
                new Empleado(3, "Valentina", 1500, "Mesera"),
                new Empleado(4, "Samuel", 400, "Cocina")
        );
        List<Empleado> empleadosCocina = listaEmpleados.stream()
                .filter(i -> i.getCargo().equals("Cocina"))
                .toList();
        System.out.println("Empleados de cargo cocina: ");
        empleadosCocina.forEach(empleado -> System.out.println(empleado.getNombre()));
    }
}
