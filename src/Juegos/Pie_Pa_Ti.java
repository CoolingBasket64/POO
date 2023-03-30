package Juegos;

import java.util.Random;
import java.util.Scanner;

public class Pie_Pa_Ti implements Juegos{
    Scanner lectura=new Scanner(System.in);

    private int ap;
    private String nombre;
    Random random = new Random();
    private int op = random.nextInt(3) + 1;
    
    public void iniciar() {
        System.out.println("digite su nombre: ");
        nombre = lectura.nextLine();
   }
 
    public void jugar() {
        System.out.println("escoja en concordancia las opciones\n1: piedra\n2: papel\n3: tijera ");
        ap = lectura.nextInt();
    }

    
    public void finalizar() {
        if (op==1 && ap==1){
            System.out.println("Es un empate no gana nada");
             }else if (op==1 && ap==2){
               
                System.out.println(nombre+" gano frente a la maquina la cual eligio PIEDRA ");
             }else if (op==1 && ap==3){
                System.out.println(nombre+" perdio frente a la maquina la cual eligio PIEDRA ");

                 }else if (op==2 && ap==1){
                    System.out.println(nombre+" perdio frente a la maquina la cual eligio PAPEL");
                     }else if (op==2 && ap==2){
                        System.out.println("Es un empate");
                     }else if (op==2 && ap==3){
                        System.out.println(nombre+" gano frente a la maquina la cual eligio PAPEL ");

                    }else if (op==3 && ap==1){
                        System.out.println(nombre+" gano frente a la maquina la cual eligio TIJERA ");
                         }else if (op==3 && ap==2){
                            System.out.println(nombre+" perdio frente a la maquina la cual eligio TIJERA");
                         }else if (op==3 && ap==3){
                            System.out.println("Es un empate ");
                             }else{
                                System.out.println("Digito un dato invalido, vuelva a intentar");
                             }
    }
    
}
