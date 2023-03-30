package Juegos;

import java.util.Random;
import java.util.Scanner;

public class Caricellazo implements Juegos {

    Scanner lectura=new Scanner(System.in);

    private int ap;
    private String nombre;
    Random random = new Random();
    private int op = random.nextInt(2) + 1;
    
    public void iniciar() {
        System.out.println("digite su nombre: ");
        nombre = lectura.nextLine();
   }
 
    public void jugar() {
        System.out.println("escoja en concordancia las opciones\n1: Sello\n2: Cara");
        ap = lectura.nextInt();
    }

    
    public void finalizar() {
        if (op==1 && ap==1){
            System.out.println(nombre+" gano ya que la maquina eligio SELLO");
             }else if (op==1 && ap==2){
                System.out.println(nombre+" perdio ya que la maquina eligio SELLO");
             }else if (op==2 && ap==2){
                System.out.println(nombre+" gano ya que la maquina eligio CARA");
                 }else if (op==2 && ap==1){
                    System.out.println(nombre+" perdio ya que la maquina eligio CARA");
                 }else{
                    System.out.println("Digito un valor diferente, vuleva a intentar");
                 }
    }
    
}
