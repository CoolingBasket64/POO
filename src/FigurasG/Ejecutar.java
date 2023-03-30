package FigurasG;

import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        float lado, base, altura, radio;
        int res, res2;

        do{

        System.out.println("Por favor digite la figura a la cual desea sacar area \n1: Cuadrado\n2: Rectangulo\n3: Triangulo\n4: Circulo");
        res=leer.nextInt();

        switch(res){

        case 1:
        System.out.println("Por favor digite el lado del cuadrado");
        lado=leer.nextFloat();
 
        Cuadradoo c1=new Cuadradoo(lado);
        c1.calcularArea();
        break;
        
        case 2:
        System.out.println("Por favor digite la base del rectángulo");
        base=leer.nextFloat();
        System.out.println("Por favor digite la altura del rectángulo");
        altura=leer.nextFloat();

        Rectangulo r1=new Rectangulo(base, altura);
        r1.calcularArea();
        break;

        case 3:
        System.out.println("Por favor digite la base del triangulo");
        base=leer.nextFloat();
        System.out.println("Por favor digite la altura del triangulo");
        altura=leer.nextFloat();
        
        Triangulo t1=new Triangulo(base, altura);
        t1.calcularArea();
        break;

        case 4:
        System.out.println("Por favor digite el radio del circulo");
        radio=leer.nextFloat();
        
        Circulo ci1=new Circulo(radio);
        ci1.calcularArea();
        break;
     }

     System.out.println("Desea volver a realizar el programa\n1: Si\n2: No");
     res2=leer.nextInt();

      }while(res2==1);

     leer.close();
    }
}