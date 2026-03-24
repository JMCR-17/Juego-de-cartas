public class Cartas {

    private static int contador_cartas= 0;
    private static int ID_carta;
    private static String palo;
    private static int valor;

    public Cartas(String palo, int valor){
        
        this.ID_carta = contador_cartas; 
        contador_cartas++;

        this.palo = palo;
        this.valor = valor;

    }

    //no necesito setter porque el id nunca se va a cambiars
    public int getID_carta(){
        return ID_carta;
    }

    // tampoco necesito setters en los demas atributos porque quiero que NO se cambien una vez creaod el objeto
    public String getPalo(){
        return palo;
    }

    public int getValor(){
        return valor;
    }

    public String toString_carta(){
        return "la carta es el " + valor+ " de " + palo + " y tiene el ID" +ID_carta;
    }

}
