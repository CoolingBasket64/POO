package Salud2;
import java.util.Scanner;

public class Empleado extends Persona {
  Scanner leer = new Scanner(System.in);

  private String cargo;
  private double valorHora;
  private int horasTrabajadas;
  private double honorarios;
  private double total;
  private double reteica;


  public Empleado(String tipoDoc, int documento, String nombre, String apellido, Double peso, Double estatura, int edad, String sexo, Double calculo) {
    super(tipoDoc, documento, nombre, apellido, peso, estatura, edad, sexo, calculo);
  
  }
 
  public Empleado() {

  }
  
  public Empleado(String cargo, double valorHora, int horasTrabajadas, String departamento, double honorarios, double total, double reteica) {
    this.cargo = cargo;
    this.valorHora = valorHora;
    this.horasTrabajadas = horasTrabajadas;
  }

  public void calcularHonorarios() {
      System.out.println("Digite su cargo");
      cargo = leer.next();
      System.out.println("Digite el valor que tiene las hora");
      valorHora = leer.nextDouble();
      System.out.println("Digite sus horas trabajadas");
      horasTrabajadas = leer.nextInt();

    total = valorHora * horasTrabajadas;
    reteica = total * 0.00966;
    honorarios = total-reteica;
    
  }

  public void imprimirInformacion() {
    System.out.println("Tipo de documento: "+getTipoDoc()+"\nNumero de documento "+getDocumento()+"\nNombre: "+getNombre()+"\nApellido: "+getApellido());
    System.out.println("Cargo: " + cargo);
    System.out.println("Horas Trabajadas: " + horasTrabajadas);
    System.out.println("Valor Hora: " + valorHora);
    System.out.println("Total a Pagar: "+honorarios);
  }
} 