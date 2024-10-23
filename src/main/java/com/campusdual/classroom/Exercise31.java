package com.campusdual.classroom;

import java.io.BufferedReader;
import java.io.FileReader;

public class Exercise31 {

    public static void main(String[] args) {
        BufferedReader br = null; // Inicializamos el buffered reader vacío

        /*
             El Buffer Reader almacena los datos en buffer para ahorrar una cantidad
             considerable de recursos.

             File reader es un método que lee secuencias de carácteres.
        */

        try {
            // Probamos a inicializar el Buffered reader
            br = new BufferedReader(new FileReader("src/main/resources/lorem.txt"));

            // Hacemos un bucle que recorra las líneas
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }


    }
}
