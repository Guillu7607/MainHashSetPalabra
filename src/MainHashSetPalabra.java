import java.util.HashSet;
import java.util.Set;

public class MainHashSetPalabra {
    public static void main(String[] args) {

        String texto = "Hola hola adios alo hola Buenas adios";

        texto = texto.toLowerCase().replaceAll("[^a-záéíóúñ ]", "");

        String[] palabras = texto.split(" ");

        Set<String> palabrasUnicas = new HashSet<>();

        for (String palabra : palabras) {
            palabrasUnicas.add(palabra);
        }

        System.out.println("Palabras únicas:");
        for (String palabra : palabrasUnicas) {
            System.out.println(palabra);
        }
    }
}
