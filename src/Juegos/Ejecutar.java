package Juegos;

public class Ejecutar {
    public static void main(String[] args) {
        Pie_Pa_Ti juego1 = new Pie_Pa_Ti();
        juego1.iniciar();
        juego1.jugar();
        juego1.finalizar();

        Caricellazo juego2 = new Caricellazo();
        juego2.iniciar();
        juego2.jugar();
        juego2.finalizar();
    }
    
}
