package Salud;

import java.util.Scanner;

public class Persona {
    Scanner leer = new Scanner(System.in);
    //ATRIBUTOS
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private Double peso;
    private Double estatura;
    private int edad;
    private String sexo;
    private Double calculo; 

    //METODOS
    public void pedirDatos(){
        System.out.println("Digite su tipo de documento \nCC: Cedula\nTI: tarjeta de identidad");
        tipoDoc = leer.next();
        System.out.println("Digite su numero de documento");
        documento = leer.nextInt();
        System.out.println("Digite su nombre");
        nombre = leer.next();
        System.out.println("Digite su apellido");
        apellido = leer.next();
        System.out.println("Digite su peso (en kilogramos)");
        peso = leer.nextDouble();
        System.out.println("Digite su estatura (en metros)");
        estatura = leer.nextDouble();
        System.out.println("Digite su edad");
        edad = leer.nextInt();
        System.out.println("Digite su sexo \nM: Masculino\nF: Femenino");
        sexo = leer.next();
    }

    public void mostrarPersona(){
        System.out.println("Tipo de documento: "+tipoDoc+"\nDocumento: "+documento+"\nNombre: "+nombre+"\nApellido: "+apellido+"\nPeso: "+peso+"\nEstatura: "+estatura+"\nEdad: "+edad+"\nSexo: "+sexo);
    }

    public void calcularImc(){
        calculo = peso/(estatura*estatura);
        if (calculo<20){
            System.out.println("\nEl peso esta por debajo de lo ideal");
        }else if (calculo>=20 && calculo<=25){
            System.out.println("\nEl peso es ideal");
        }else if (calculo>25) {
            System.out.println("\nTiene sobrepeso");
        }
    }

    public void mayorEdad(){
        if (edad>=18) {
            System.out.println("\nUsted es mayor de edad");
        }else if (edad<18) {
            System.out.println("\nUsted es menor de edad");
        }
    }

}
