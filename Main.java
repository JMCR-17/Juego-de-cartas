
public class Main {

    public static void main(String[] args) {

        String[] palos = {"oros", "copas", "espadas", "bastos"};
        TrabajarCartas mazo_1 = new TrabajarCartas(palos,12);

        mazo_1.barajar_mazo();

        for(int i = 0; i < mazo_1.mazo.size(); i++){
            mazo_1.get_carta();
        }

        System.out.println(
            "hay " + mazo_1.mazo.size() + " cartas"
        );

    }
    
}
