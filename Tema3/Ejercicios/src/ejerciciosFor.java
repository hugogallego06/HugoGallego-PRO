import java.sql.SQLOutput;
import java.util.Scanner;

public class ejerciciosFor {
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio3();
        //ejercicio4();

        ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
    }
    public static Scanner scanner=new Scanner(System.in);
    public static void ejercicio1(){
        System.out.println("Cuantas temperaturas quieres introducir: ");
        int nTemperaturas=scanner.nextInt();
        int temperatura=0;

        //acumulador
        int sumatorio=0;

        if (nTemperaturas<=0){
            nTemperaturas=10;
        }
        for (int i=0; i<nTemperaturas; i++){
            System.out.println("Introduce la temperatura: ");
            temperatura =scanner.nextInt();
            sumatorio += temperatura;
        }
        System.out.println("La media es "+(float)sumatorio/2);
    }
    public static void ejercicio3(){
        for (int i = 0; i < 11; i++) {
            System.out.println("Tabla de multiplicar del "+i);
            for (int j = 0; j < 11; j++){
                System.out.printf("%d * %d = %d\n",i,j,i*j);
            }
        }

    }
    public static void ejercicio4(){
        System.out.println("Dime cual es el numero inicial: ");
        int numeroInicial=scanner.nextInt();
        System.out.println("Dime cual es el numero final: ");
        int numeroFinal=scanner.nextInt();

        if (numeroInicial>=numeroFinal){
            System.out.println("No se puede proceder a la ejecución");
        }else {
            for (int i = numeroInicial; i < numeroFinal; i++) {
                System.out.println("Tabla de multiplicar del " + i);
                for (int j = 0; j < 11; j++) {
                    System.out.printf("%d * %d = %d\n", i, j, i * j);
                }
            }
        }
    }
    public static void ejercicio5(){

        }
}
