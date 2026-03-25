public class Jugador {

    private Cartas[] cartas_del_jugador = new Cartas[3];
    private int puntuacion_jugador = 0;

    public Jugador(TrabajarCartas mazo){

        this.cartas_del_jugador = cartas_del_jugador;
        this.puntuacion_jugador = puntuacion_jugador;

        primeras_3_cartas(mazo);
    }

    public int getPuntuacion_jugador(){
        return puntuacion_jugador;
    }

    public void setPuntuacion_jugador(int añadir_puntuacion){
        this.puntuacion_jugador = this.puntuacion_jugador + añadir_puntuacion;
    }

    public Cartas[] getCartas_del_jugador(int indice){
        if(cartas_del_jugador[indice] == null){
            System.out.println("no ha carta en esa posicion");
        } else{
            Cartas carta_seleccionada = cartas_del_jugador[indice];
        }
            return carta_seleccionada;
    }

    public void setCartas_del_jugador(Cartas[] cartas_del_jugador, int indice) {
        if( cartas_del_jugador[indice] != null ){
            System.out.println("no puedes meter una carta porque ya hay una");
        }else{
            this.cartas_del_jugador[indice] = cartas_del_jugador;
        }
    }

    private void primeras_3_cartas(TrabajarCartas mazo){
       
        for (int i = 0; i < cartas_del_jugador.length; i++) {
            
            this.cartas_del_jugador[i] = mazo.robar_carta();
        }

    }

    
    
}
