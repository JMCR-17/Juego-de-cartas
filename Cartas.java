public class Cartas {

    private static int contador_cartas= 0;
    private int ID_carta;
    private String palo;
    private int valor;

    public Cartas( String palo, int valor){
        
        this.ID_carta = contador_cartas; 
        this.palo = palo;
        this.valor = valor;

    }

    //no necesito setter porque el id nunca se va a cambiars
    public int getID_carta(){
        return ID_carta;
    }

    public void setPalo(String palo){
        this.palo = palo;
    }
    public String getPalo(){
        return palo;
    }

    public void setValor(int valor){
        this.valor = valor;
    }
    public int getValor(){
        return valor;
    }

    public String toString_carta(String palo, int valor, int ID_carta){
        return "la carta es el" + valor+ " de " + palo + " y tiene el ID" +ID_carta;
    }

}
