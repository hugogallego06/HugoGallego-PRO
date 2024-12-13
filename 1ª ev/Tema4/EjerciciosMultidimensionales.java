import java.util.Scanner;

public class EjerciciosMultidimensionales {
    public static void main(String[] args) {
        //definir array con filas 5 y columnas aleatorias entre 2-6
        int filas = (int)((Math.random()*5)+2);
        int [][] numeros= new int[5][filas];

        // rellenar el array (entero) con aleatorios
        for (int i = 0; i <numeros.length ; i++) {
            for (int j = 0; j <filas ; j++) {
                numeros[i][j] = (int) (Math.random() * 21);
            }
        }
        imprimirArray(numeros);


        // al array hay que quitarle 1 a cada posicion y volver a imprimir
        for (int i = 0; i < numeros.length ; i++) {
            for (int j = 0; j < numeros[i].length ; j++) {
                numeros[i][j]-=1;
            }
        }
        System.out.println("Imprimiendo modificado:");
        imprimirArray(numeros);

        Scanner scanner=new Scanner(System.in);
        // Modificar e imprimir el array 8 veces, donde
        // cada vez el usuario indica cuantas unidades se quitan
        System.out.println("En cuanto quieres modificar?");
        int numeroModificar=scanner.nextInt();
        for (int i = 0; i <numeros.length ; i++) {
            for (int j = 0; j <numeros[i].length ; j++) {
                numeros[i][j]-=numeroModificar;
            }
        }

        vecesArray(numeros);
    }

    public static void imprimirArray(int[][]array){
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element+"\t");}
        }
        System.out.println();
    }
    public static void vecesArray(int[][]array){


    }
}
