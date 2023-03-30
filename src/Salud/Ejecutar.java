package Salud;

import Salud2.Persona;

public class Ejecutar {

    public static void main(String[] args) {
        
    Persona persona = new Persona();
    persona.pedirDatos();
    persona.mostrarPersona();
    persona.calcularImc();
    persona.mayorEdad();
    
}
}
