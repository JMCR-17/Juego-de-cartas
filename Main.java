
public class Main {

    public static void main(String[] args) {
        
        TrabajarCartas mazo_1 = new TrabajarCartas();

        mazo_1.crear_mazo();

        mazo_1.barajar_mazo();

        for(int i = 0; i < mazo_1.mazo.size(); i++){
            mazo_1.get_carta();
        }

    }
    
}
