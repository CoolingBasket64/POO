package Salud2;

public class Ejecutarz{

    public static void main(String[] args) {
        
    Persona persona = new Persona();
    persona.pedirDatos();
    Empleado empleado = new Empleado();
    empleado.calcularHonorarios();
    empleado.imprimirInformacion();   
    
}
}