package aplicacion;

import processing.core.PApplet;

public class A extends PApplet {

    public static void main(String[] args) {
        PApplet.main(A.class.getName());
    }

    @Override
    public void settings() {
        size(800, 800);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
      for(int i=0; i<=8; i++){
  			for(int j=0; j<=8; j++){
  				if((i+j)%2 == 0){
  					fill(0,0,0);   //color negro
  				}else{
  					fill(255,255,255);    //color blanco
  				}
  				rect(j*(800/8),i*(800/8),(800/8),(800/8));
  			}
  		}
    }
}
//javac -classpath lib/core.jar -d build src/aplicacion/A.java
//java -classpath build:lib/core.jar aplicacion.A
