    package FigurasG;

public class Cuadradoo extends Figura{
    
    float lado;
    

    public Cuadradoo(float lado) {
        this.lado = lado;
    }
    
    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }
    
    public void calcularArea(){
    float area;
    area=lado*lado;
    System.out.println("El lado del cuadrado es: "+lado+" y su área es: "+area);
    }
    
}

