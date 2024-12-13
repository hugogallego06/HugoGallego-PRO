public class Entrada {
    public static void main(String[] args) {

        int [] numeros= new int[4];
        // 0 0 0 0 ----> Valor de los numeros en la caja

        // cuantas posiciones tienes (MUY USADA)
        /*System.out.println("La longitud es "+numeros.length);*/

        // 0 0 0 7 ----> Cambio de número en la posicion 3
        numeros [3]= 7;
        System.out.println("La ultima posicion ha pasado a ser "+numeros[numeros.length-1]);

        //String[] palabras = {}; // Valor 0

        String[] palabras = {"Hola","Que","Tal","Estas"};

        System.out.println("La palabra en la ultima posicion es "+palabras[palabras.length-1]);
        //La última posición sería "Estas"

        /*Puedo modificar el contenido del Array dentro del for
            for (int i = 0; i < palabras.length ; i++) {
                System.out.println("La palabra es "+palabras[i]);
            }*/

        // Rellenar el Array de numero con aleatorios de entre 0 y 100
        /*for (int i = 0; i < numeros.length ; i++) {
            numeros[i]=(int)(Math.random()*1001);

        }*/

        // EL FOR SIRVE PARA RECORRER UNA COLECCION, DONDE INDICO PRINCIPIO Y FINAL
        /*for (int i = 0; i < numeros.length ; i++) {
            System.out.println(numeros[i]);
            // Los numeros que estan en POSICION PAR
            /*if (i % 2 == 0) {
                System.out.println(numeros[i]);
            }*/

            // Los NUMEROS pares dentro del Array
                /*if (numeros[i]%2==0){
                    System.out.println(numeros[i]);
                 }
            }*/

    //EN EL FOREACH RECORREMOS TOTALMENTE EL CONTENIDO DEL ARRAY POR LO QUE NO TENDRIA QUE RECORRER i
       for (int item:numeros){
           if (item % 2 == 0) {
               System.out.println(item);

           }
       }
    }
}
