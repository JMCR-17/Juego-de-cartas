# poker

## crear clase cartas 

    tiene como atributos, todo private:
        - static int ID_carta
        - String palo
        - int valor

        static es para asignarle un id unico a cada carta
        cada vez que se crea una carta ID_carta++ y en el constructor this.ID_carta = ID_carta

## crear mazo

    se crearan dos ficheros, uno con la logica y otro con el main
    el que tiene la logica se llamara TrabajarCartas y el main Mazo

    para guardar el mazo se usara una cola 


## jugador (orientado a la brisca)

 va a tener tres cartas (un array de tres elementos) y una puntuacion