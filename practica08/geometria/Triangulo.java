package geometria;

/**
 * Representa un polígono de tres lados. Está definido por tres puntos en el plano cartesiano.
 */
public class Triangulo{
  private Punto a;
  private Punto b;
  private Punto c;

  /**
   * Triángulo con todos sus lados de la misma longitud.
   */
  public static final int EQUILATERO = 0;

  /**
   * Triángulo con todos sus lados de longitud distinta.
   */
  public static final int ESCALENO = 2;

  /**
   * Triángulo con exactamente dos lados de la misma longitud.
   */
  public static final int ISOSCELES = 1;

  /**
   * Crea un triángulo equilátero de lado 1 con vértices en (0, 0), (1, 0) y (0.5, sin(π / 3)).
   */
  public Triangulo(){
      this.a = new Punto(0,0);
      this.b = new Punto(1,0);
      this.c = new Punto(0.5, Math.sin(Math.PI / 3));
  }

  /**
   * Crea un triángulo con los tres puntos dados.
   */
  public Triangulo(Punto a, Punto b, Punto c){
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public Punto getPa(){
    return this.a;
  }

  public Punto getPb(){
    return this.b;
  }

  public Punto getPc(){
    return this.c;
  }

  /**
   * Determina si los vértices de este triángulo están alineados.
   */
  public boolean tieneVerticesAlineados(){
    return this.a.estanAlineados(b,c);
  }

  /**
   * Regresa el tipo de este triángulo según la longitud de sus lados; puede ser equilátero, isósceles o escaleno.
   */
  public int tipo(){
    if (a.distancia(b) == b.distancia(c) && b.distancia(c) == c.distancia(a)){
      return EQUILATERO;
    }else if(a.distancia(b) != b.distancia(c) && b.distancia(c) != c.distancia(a) && c.distancia(a) != a.distancia(b)){
      return ESCALENO;
    }
      return ISOSCELES;
  }

}
