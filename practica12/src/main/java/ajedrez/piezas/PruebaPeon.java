public class PruebaPeon{
  public static void main(String[] args) {

    Color c = Color.BLANCO;
    Posicion p = new Posicion(2,3);
    Peon p1 = new Peon(c,p);

    for(int i=0; i<10; i++){
      p1.obtenerJugadasLegales();
    }

    System.out.println("Peon con posición " + p + " el cual se puede mover a " + p1.obtenerJugadasLegales());

  }
}
