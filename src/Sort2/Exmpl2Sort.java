package Sort2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exmpl2Sort {
    public static void main(String[] args) {
        List<Personaje> personas = Arrays.asList(
                new Personaje("Juan", 25),
                new Personaje("Maria", 30),
                new Personaje("Carlos", 22),
                new Personaje("Laura", 28)
        );

        List<Personaje> personasOrdenadas = personas.stream()
                .sorted(Comparator.comparingInt(Personaje::getEdad).reversed())
                .toList();

        System.out.println("Personas ordenadas de mayor a menor edad:");
        personasOrdenadas.forEach(persona -> System.out.println(persona.getNombre() + " - Edad: " + persona.getEdad()));
    }
}
