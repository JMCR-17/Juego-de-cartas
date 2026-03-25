import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class TrabajarCartas{
    private final int num_cartas_palo;
    private final String[] palos_cartas;

    Queue<Cartas> mazo = new LinkedList<>();

    public TrabajarCartas(String[] palos,int num_cartas_palo){
        this.palos_cartas = palos;
        this.num_cartas_palo = num_cartas_palo;

        //el mazo ya se crea nada mas se cree el objeto
        crear_mazo(palos, num_cartas_palo);
    }

    private void crear_mazo(String[] palos,int num_cartas_palo){

        for(int i = 0; i < palos.length; i++){
            crear_palo(mazo, palos[i], num_cartas_palo);
        }

    }

    // este metodo quita la carta del tope y no la vuelve a añadir al mazo
    public Cartas robar_carta(){

        Cartas carta_robada = mazo.poll();

        return carta_robada;
    }

    //este metodo roba la carta del tope pero la devuelve al mazo por detras
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

    private void crear_palo(Queue<Cartas> mazo1, String palos, int num_cartas_palo) {
        for (int valor = 1; valor <= num_cartas_palo; valor++) {
            Cartas c = new Cartas(palos, valor);
            mazo1.add(c);
        }
    }

}