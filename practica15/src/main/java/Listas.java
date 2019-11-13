package main.java;

import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.Comparator;

public class Listas{

    //Método ejemplo
    public static String f(List<String> list){
      return list.stream()
            .filter(s -> !s.isBlank())
            .map(StringBuilder::new)
            .map(StringBuilder::reverse)
            .reduce(new StringBuilder(), StringBuilder::append)
            .toString();
    }

    /*
     * Método que ordena una lista por su tamaño, del más largo al más corto
     * @param s -- Lista que va a ser ordenada
     * @return List -- Lista que devulve un Stream<String> ordenado
     */
    public static Stream<String> ordenarLargoCorto(List<String> s){
		return s.stream().sorted​(Comparator.reverseOrder());
    }


    /*
     * Método que recibe una cadena s y devuelve un Stream<String> infinito
     * @param s -- Cadena cuyos valores se almacenan en una lista
     * @return List -- Lista que devuelve un Stream<String> infinito
     */
    public static Stream<String> infinito(String s){
      return Stream.generate(new Supplier<String>(){
        int i=0;
        public String get(){
          return s.repeat(i++);
        }
      });
    }

}
