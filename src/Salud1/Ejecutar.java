package Salud1;

import java.util.Scanner;


public class Ejecutar {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double peso, estatura;

        System.out.println("Digite su peso (en kilogramos)");
        peso = leer.nextDouble();
        System.out.println("Digite su estatura (en metros)");
        estatura = leer.nextDouble();
        
    Persona persona = new Persona(peso, estatura);
    persona.pedirDatos();
    persona.mostrarPersona();
    persona.calcularImc();
    persona.mayorEdad();
 
    leer.close();
}
}
