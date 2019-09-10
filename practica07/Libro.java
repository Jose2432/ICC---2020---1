/**
* Una breve descripcion de la clase Libro.
* @author José Marín
* @version 1.0
*/
public class Libro{
  private String titulo;
  private String autor;
  private int añoPublicacion;

  /**
   * Constructor que inicializa los atributos a cadenas vacías o a cero
   */
  public Libro(){
    titulo = "";
    autor = "";
    añoPublicacion = 0;
  }

  /**
   * Método que Asigna un titulo
   * @param titulo Asigna un titulo al atributo titulo
   */
  public void setTitulo(String titulo){
    this.titulo = titulo;
  }

  /**
   * Método que asigna un autor
   * @param autor Asigna un autor al atributo autor
  **/
  public void setAutor(String autor){
    this.autor = autor;
  }

  /**
   * Método que asigna un año de publicacion
   * @param añoPublicacion Asigna un año al atributo añoPublicacion
  **/
  public void setAñoPub(int añoPublicacion){
    this.añoPublicacion = añoPublicacion;
  }

  /**
   * Método que devuelve el titulo
   * @return el titulo ingresado
  **/
  public String getTitulo(){
    return titulo;
  }

  /**
   * Método que devuelve el autor
   * @return el autor ingresado
  **/
  public String getAutor(){
    return autor;
  }

  /**
   * Método que devuelve el año de publicacion
   * @return el año de publicacion ingresado
  **/
  public int getAñoPub(){
    return añoPublicacion;
  }
}
