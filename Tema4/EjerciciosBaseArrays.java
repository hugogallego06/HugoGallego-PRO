import java.util.Scanner;

public class EjerciciosBaseArrays {
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        ejercicio3();//error
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
    }
    public static void ejercicio1(){
        Scanner scanner =new Scanner(System.in);
        int [] numeros=new int [10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un numero");
            numeros[i]=scanner.nextInt();
            System.out.println("Tu numero en la posicion "+(i+1)+" es "+numeros[i]);
        }

    }
    public static void ejercicio2(){
        int puntos=0;
        int [] aleatorios=new int[30];
        for (int i = 0; i < aleatorios.length ; i++) {
            int aleatorio=(int)(Math.random()*11);
            System.out.println(aleatorio);
            puntos+=aleatorio;
        }
        System.out.println("El total de puntos es "+puntos);
        System.out.println("El total de puntos es "+((double)puntos/30));
    }
    public static void ejercicio3(){
        Scanner scanner=new Scanner(System.in);
        int [] numeros=new int[10];
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Introduce un numero");
            numeros[i]=scanner.nextInt();
        }
        // ERROR ME SALEN 9 Y NO 10
        for (int i = numeros.length-1; i >0  ; i--) {
            System.out.println("En orden inverso es "+numeros[i]+"\n");
        }
        for (int item:numeros) {
            System.out.println("En orden normal es "+item);
        }
    }
    public static void ejercicio4(){
        Scanner scanner=new Scanner(System.in);
        int [] numero= new int [20];
        int [] cuadrado= new int [20];
        int [] cubo= new int [20];
        for (int i = 0; i < 20; i++) {
            numero[20]=(int)(Math.random()*101);

        }
    }
}
