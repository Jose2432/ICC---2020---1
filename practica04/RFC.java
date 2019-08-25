import java.util.Scanner;

public class RFC {

	public static void main(String[] args) {
		//declaramos las variables que utilizaremos
		Scanner scanner = new Scanner(System.in);
		String nombreCompleto, fechaNaciemiento, aPaterno, aMaterno, nombre, ano, mes, dia, rfc, rfcfinal, nombreCompleto2;
		int posicion, posicion2;

		//utilizamos el escaner de Java para leer los datos que solicitaremos al usuario
		System.out.println("Hola :D");
		System.out.println("Ingresa tu nombre completo en una línea separado por espacios: ");
		nombreCompleto = nombreCompleto2 = scanner.nextLine();
		System.out.println();
		System.out.println("Ingresa tu dia de nacimiento (en formato dd/mm/aaaa): ");
		fechaNaciemiento = scanner.nextLine();
		System.out.println("");

		//identificamos el primer espacio para separar el nombre y despues guardamos la primera letra del nombre
		nombreCompleto = nombreCompleto.trim();
		posicion = nombreCompleto.indexOf(" ");
		nombre = nombreCompleto.substring(0,posicion);
		nombre = nombre.substring(0,1);
		nombreCompleto = nombreCompleto.substring(posicion+1, nombreCompleto.length());

		//identificamos el segundo espacio para separar el aPaterno y despues guardamos las primeras dos letras del aPaterno
		posicion = nombreCompleto.indexOf(" ");
		aPaterno = nombreCompleto.substring(0, posicion);
		aPaterno = aPaterno.substring(0,2);
 		nombreCompleto = nombreCompleto.substring(posicion+1, nombreCompleto.length());

		//fianlmente rescatamos la inicial del aMaterno
		aMaterno = nombreCompleto.substring(0,1);

		//haremos lo mismo que se hizo con el nombre, pero ahora para la fecha
		//identificamos la primer diagonal para separar el dia y guardamos esos dos digitos
		fechaNaciemiento = fechaNaciemiento.trim();
		posicion2 = fechaNaciemiento.indexOf("/");
		dia = fechaNaciemiento.substring(0,posicion2);
		dia = dia.substring(0,2);
		fechaNaciemiento = fechaNaciemiento.substring(posicion2+1, fechaNaciemiento.length());

		//identificamos la segunda diagonal para separar el mes y guardamos esos digitos
		posicion2 = fechaNaciemiento.indexOf("/");
		mes = fechaNaciemiento.substring(0,posicion2);
		mes = mes.substring(0,2);
		fechaNaciemiento = fechaNaciemiento.substring(posicion2+1, fechaNaciemiento.length());

		//finalmente rescatamos los ultimos dos digitos del año con un substring
		ano = fechaNaciemiento.substring(2,4);

		//utilizamos la variable rfcfinal para gaurdar y concatenar todas las cadenas que cortamos de los datos solicitados
		rfcfinal = aPaterno + aMaterno + nombre + ano + mes + dia;
		//hacemos que la variable rfcfinal se haga mayuscula con toUpperCase
		rfcfinal = rfcfinal.toUpperCase();
		//finalmente se imprime el RFC
		System.out.println("El RFC de " + nombreCompleto2 + " es: " + rfcfinal);
		System.out.println();

	}

}
