package Filter2;

import java.util.Arrays;
import java.util.List;

public class Exmpl2Filter {
    public static void main(String[] args) {
        List<Persona> listaPersonas = Arrays.asList(
                new Persona(1, "Luis", 17),
                new Persona(2, "Diego", 56),
                new Persona(3, "Samuel", 17)
        );
        int edadFiltrar = 17;
        List<Persona> personasMenores = listaPersonas.stream()
                .filter(i -> i.getEdad() == edadFiltrar)
                .toList();
        personasMenores.forEach(persona -> System.out.println(persona.getNombre()));
    }
}
