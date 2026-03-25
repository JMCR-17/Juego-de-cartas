import java.util.LinkedList;
import java.util.Queue;

public class TrabajarCartas{

    Queue<Cartas> mazo = new LinkedList<>();

    public void crear_mazo(){

        crear_palo(mazo, "oros");
        crear_palo(mazo, "bastos");
        crear_palo(mazo, "espadas");
        crear_palo(mazo, "copas");
    }

    public void get_carta(){
        mazo.add(mazo.peek());

        System.out.println(
            mazo.poll().toString_carta() 
        );
    }

    private void crear_palo(Queue mazo1, String palo) {
        for (int valor = 1; valor < 12; valor++) {
            Cartas c = new Cartas(palo, valor);
            mazo1.add(c);
        }
    }




}