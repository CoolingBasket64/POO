package Salud1;

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

    //METODOS
    public Persona(double peso, double estatura){
        this.peso=peso;
        this.estatura=estatura;
    }
    
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getEstatura() {
        return estatura;
    }
    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void pedirDatos(){
        System.out.println("Digite su tipo de documento \nCC: Cedula\nTI: tarjeta de identidad");
        tipoDoc = leer.next();
        System.out.println("Digite su numero de documento");
        documento = leer.nextInt();
        System.out.println("Digite su nombre");
        nombre = leer.next();
        System.out.println("Digite su apellido");
        apellido = leer.next();
        System.out.println("Digite su edad");
        edad = leer.nextInt();
        System.out.println("Digite su sexo \nM: Masculino\nF: Femenino");
        sexo = leer.next();
    }

    public void mostrarPersona(){
        System.out.println("Tipo de documento: "+tipoDoc+"\nDocumento: "+documento+"\nNombre: "+nombre+"\nApellido: "+apellido+"\nPeso: "+peso+"\nEstatura: "+estatura+"\nEdad: "+edad+"\nSexo: "+sexo);
    }

    public void calcularImc(){
        Double calculo;
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
