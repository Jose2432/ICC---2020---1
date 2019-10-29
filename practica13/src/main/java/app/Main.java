package app;

import processing.core.PApplet;
import processing.core.PImage;
import java.util.HashMap;
import ajedrez.Tablero;
import ajedrez.piezas.Color;
import ajedrez.piezas.Pieza;
import ajedrez.piezas.Peon;
import ajedrez.piezas.Dama;

public class Main extends PApplet {

    private Tablero tablero;
    private HashMap<String, PImage> imagenes;

    public static void main(String[] args) {
        PApplet.main("app.Main");
    }

    @Override
    public void settings() {
        size(800, 800);
    }

    @Override
    public void setup() {
        tablero = Tablero.obtenerInstancia();
        imagenes = new HashMap<>();
        imagenes.put("PeonBLANCO",loadImage(getClass().getResource("/w-pawn.png").getPath()));
        imagenes.put("PeonNEGRO",loadImage(getClass().getResource("/b-pawn.png").getPath()));
        imagenes.put("DamaBLANCO",loadImage(getClass().getResource("/w-queen.png").getPath()));
        imagenes.put("DamaNEGRO",loadImage(getClass().getResource("/b-queen.png").getPath()));
        noLoop();
    }

    @Override
    public void draw() {
      for(int i=0; i<=8; i++){
  			for(int j=0; j<=8; j++){
  				if((i+j)%2 == 0){
            fill(0x44000000);   //color negro
  				}else{
  					fill(255,255,255);    //color blanco
  				}
  				rect(j*(800/8),i*(800/8),(800/8),(800/8));

          Pieza pieza = tablero.obtenerPieza(i,j);
          if(pieza != null){
            image(imagenes.get(pieza.getClass().getSimpleName()
              + pieza.obtenerColor()),j*(800/8),i*(800/8),(800/8),(800/8));
          }
  			}
  		}
    }
}

//javac -cp lib/core.jar:src/main/java -d build/classes/java/main src/main/java/*/*.java src/main/java/*/*/*.java
//java -cp lib/core.jar:src/main/java:build/resources/main:build/classes/java/main app.Main








//javac -classpath lib/core.jar -d build src/aplicacion/A.java
//java -classpath build:lib/core.jar aplicacion.A
