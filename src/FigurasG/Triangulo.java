package FigurasG;

public class Triangulo {
    float base, altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

public void calcularArea(){
    float area;
    area=(base*altura)/2;
    System.out.println("la altura del triangulo es: "+altura+" su base es: "+base+" y su área es: "+area);
    }  
}
