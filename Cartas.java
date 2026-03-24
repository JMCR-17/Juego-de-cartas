public class Cartas {

    private static int ID_carta = 0;
    private String palo;
    private int valor;

    public Cartas(int ID_carta, String palo, int valor){
        
        this.ID_carta = ID_carta; 
        ID_carta++;

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



}
