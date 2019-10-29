package ajedrez.piezas;
//import java.ajedrez.Tablero;
import java.util.List;

import java.util.LinkedList;

public class Dama extends Pieza{
  public Dama(Color color, Posicion posicion){
    super(color, posicion);
  }

  @Override
  public List<Posicion> obtenerJugadasLegales(){
    int fila = obtenerPosicion().obtenerFila();
    int columna = obtenerPosicion().obtenerColumna();
    LinkedList<Posicion> jugadas = new LinkedList<>();

    for(int i=fila-1, j=columna-1; i>=0 && j>=0; i--, j--){

    }

    if(columna == 3 && fila == 7){
      jugadas.add(new Posicion(fila-1, columna+1));
    }
    if(columna == 3 && fila == 7){
      jugadas.add(new Posicion(fila-1, columna-1));
    }
    if(columna == 3 && fila == 7){
      jugadas.add(new Posicion(fila, columna-1));
    }
    if(columna == 3 && fila == 7){
      jugadas.add(new Posicion(fila, columna+1));
    }
    if(columna == 3 && fila == 7){
      jugadas.add(new Posicion(fila-1, columna));
    }


    if(columna == 3 && fila == 0){
      jugadas.add(new Posicion(fila+1, columna+1));
    }
    if(columna == 3 && fila == 0){
      jugadas.add(new Posicion(fila+1, columna-1));
    }
    if(columna == 3 && fila == 0){
      jugadas.add(new Posicion(fila, columna-1));
    }
    if(columna == 3 && fila == 0){
      jugadas.add(new Posicion(fila, columna+1));
    }
    if(columna == 3 && fila == 0){
      jugadas.add(new Posicion(fila-1, columna));
    }

    return jugadas;

  }

}
