
public class Main {

    public static void main(String[] args) {
        
        TrabajarCartas mazo_1 = new TrabajarCartas();

        mazo_1.crear_mazo();

        for (int i = 0; i < 100; i++) {
            mazo_1.get_carta();
        }

    }
    
}
