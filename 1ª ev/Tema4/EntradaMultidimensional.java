public class EntradaMultidimensional {
    public static void main(String[] args) {
        int [][] numeros= {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16,17}
        };

        //Cuantas filas tengo
        int numeroFilas= numeros.length; // Longitud de 4

        //Las columnas de la primera fila
        int columnasFila1=numeros[0].length;
        int columnasFila2=numeros[1].length;
        int columnasFila3=numeros[2].length;
        int columnasFila4=numeros[3].length;

        // sacar el ultimo elemento // 17
        // numeros[3][4]
        int ultimoNumero = numeros[numeros.length-1][numeros[numeros.length-1].length-1];

        // sacar el primer valor
        int primerValor=numeros[0][0];

        //modificar valor de una posición
        numeros[0][0]=0;

        // acceder a todos los elementos

        //recorrer filas

        // PARA MODIFICACIONES

        /*for (int i = 0; i <numeros.length ; i++) {
            //recorro las COLUMNAS de CADA FILA
            for (int j = 0; j <numeros[i].length ; j++) {
                System.out.print(numeros[i][j]+"\t"); //IMPRIME LA FILA Y SALTA CUANDO ACABA
            }
            System.out.println();
        }*/

        // PARA RECORRER LOS DATOS
        for (int[] item:numeros){
            for (int element:item){
                System.out.print(element+"\t");
            }
            System.out.println();
        }
    }
}
