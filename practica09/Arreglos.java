/**
 * Clase para practicar el uso de arreglos y la estructura for.
 */
public class Arreglos {

    /**
     * Regresa el índice de un elemento en el arreglo dado, o -1 si no aparece.
     * @param arr el arreglo en el cual se buscará el parámetro k
     * @param k el entero a buscar
     * @return el índice de k en arr, o -1 si no aparece
     */
    public static int buscar(int[] arr, int k) {
        for(int i=0; i<arr.length; i++){
          if(k == arr[i]){
              return i;
          }
        }
        return -1;
    }

    /**
     * Regresa el mayor entero de un arreglo. Puedes suponer que arr contiene al menos un elemento.
     * @param arr el arreglo
     * @return el elemento máximo de arr
     */
    public static int max(int[] arr){
        for(int i=0; i<arr.length; i++){
          if(arr[i] > arr[0]){
            arr[0] = arr[i];
          }
        }
        return arr[0];
    }

    /**
     * Determina si existen dos elementos consecutivos en el arreglo dado que sumen a k.
     * @param arr el arreglo en el que se buscará
     * @param k el número a buscar
     * @return true si existen dos elementos consecutivos que sumen a k
     */
    public static boolean consecutivos(int[] arr, int k) {
        for(int i=0,j=1; i<arr.length && j<arr.length; i++, j++){
          int sumaCon = arr[i] + arr[j];
          if(sumaCon == k){
            return true;
          }
        }
        return false;
    }

    /**
     * Determina la suma de los elementos dado un arreglo
     * @param arr el arreglo cuyos elementos serán sumados
     * @return la suma de los elementos
     */
    public int suma(int[] arr){
      int total = 0;
      for(int i=0; i<arr.length; i++){
        total += arr[i];
      }
      return total;
    }

    /**
     * Pruebas unitarias para verificar que tus implementaciones son correctas.
     */
    public static void main(String[] args) {
        pruebasDe2a4();
        int [] arrPrueba = {56,0,233,16,25,41,108,360,2};
        Arreglos a1 = new Arreglos();
        System.out.println("");
        System.out.println("|||||  PRUEBAS DE 2 A 4 Y LA SUMA  |||||");
        System.out.println("Dado el arreglo: "+java.util.Arrays.toString(arrPrueba));
        System.out.println("El número 25 está en la posición "+a1.buscar(arrPrueba,25)+" del arreglo");
        System.out.println("El número maximo es: "+a1.max(arrPrueba));
        System.out.println("¿La suma de dos números consecutivos da el sieguiente elemento? "+a1.consecutivos(arrPrueba,41));
        System.out.println("La suma de los elementos del arreglo es: "+a1.suma(arrPrueba));
        System.out.println();

    }

    private static void pruebasDe2a4() {
        var random = new java.util.Random();
        int COTA = 20, N = 15 + random.nextInt(10);
        var mal = false;
        var arrI = new Integer[N];
        int aPos = 0, bPos = 0;
        while (aPos == bPos) {
            aPos = random.nextInt(arrI.length);
            bPos = random.nextInt(arrI.length);
        }
        arrI[0] = random.nextInt(COTA);
        for (int i = 1; i < arrI.length; i++) {
            arrI[i] = arrI[i - 1] + random.nextInt(COTA) + 1;
        }

        java.util.Collections.shuffle(java.util.Arrays.asList(arrI));
        int[] arr = java.util.Arrays.stream(arrI).mapToInt(Integer::intValue).toArray();
        int a = arr[aPos], b = arr[bPos];

        // Buscar
        if (buscar(arr, a) != aPos) {
            imprimir("arr = %s", java.util.Arrays.toString(arr));
            imprimir("buscar(arr, %d) debió regresar %d pero regresó %d.\n", a, aPos, buscar(arr, a));
            mal = true;
        }
        if (buscar(arr, b) != bPos) {
            imprimir("arr = %s", java.util.Arrays.toString(arr));
            imprimir("buscar(arr, %d) debió regresar %d pero regresó %d.\n", b, bPos, buscar(arr, b));
            mal = true;
        }
        if (buscar(arr, Integer.MIN_VALUE) != -1) {
            imprimir("arr = %s", java.util.Arrays.toString(arr));
            imprimir("buscar(arr, %d) debió regresar %d pero regresó %d.\n",
                Integer.MIN_VALUE, -1, buscar(arr, Integer.MIN_VALUE));
            mal = true;
        }

        // Max
        int max = java.util.Arrays.stream(arr).max().getAsInt();
        if (max(arr) != max) {
            imprimir("arr = %s", java.util.Arrays.toString(arr));
            imprimir("max(arr) debió regresar %d pero regresó %d.\n", max, max(arr));
            mal = true;
        }

        // Consecutivos
        if (consecutivos(arr, -10)) {
            imprimir("arr = %s", java.util.Arrays.toString(arr));
            imprimir("consecutivos(arr, -10) debió regresar false pero regresó true.\n");
            mal = true;
        }
        int c = aPos < arr.length - 1 ? aPos : bPos;
        if (!consecutivos(arr, arr[c] + arr[c + 1])) {
            imprimir("arr = %s", java.util.Arrays.toString(arr));
            imprimir("consecutivos(arr, %d) debió regresar true pero regresó false.\n",
                arr[c] + arr[c + 1]);
            mal = true;
        }

        if (!mal) {
            System.out.println("Los incisos 2, 3, y 4 están bien.");
        }
    }

    private static void imprimir(String format, Object... objs) {
        System.out.println(String.format(format, objs));
    }

}
