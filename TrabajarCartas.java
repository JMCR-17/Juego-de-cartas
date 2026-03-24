import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

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

    public void barajar_mazo(){
        int tamaño_baraja = mazo.size();

        Random random = new Random();
        Cartas[] mazo_temporal = new Cartas[tamaño_baraja];
        
        for(int i = 0; i < tamaño_baraja ;i++){
            mazo_temporal[i] = mazo.poll();
        }

        for(int i = tamaño_baraja -1; i > 0; i--){

            int j = random.nextInt(i + 1);

            Cartas temp = mazo_temporal[i];
            mazo_temporal[i] = mazo_temporal[j];
            mazo_temporal[j] = temp;

        }

        mazo.clear();

        for(int i = 0; i < mazo_temporal.length ; i++){
            mazo.add( mazo_temporal[i]);
        }
    }

    private void crear_palo(Queue<Cartas> mazo1, String palo) {
        for (int valor = 1; valor < 12; valor++) {
            Cartas c = new Cartas(palo, valor);
            mazo1.add(c);
        }
    }

}