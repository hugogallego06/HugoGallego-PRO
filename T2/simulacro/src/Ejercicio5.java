import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        apartadoA(42);
    }
    static Scanner scanner=new Scanner(System.in);

    public static int apartadoA(int formula){

        System.out.println("Introduce un numero entero");
        int a=scanner.nextInt();
        System.out.println("Introduce un numero entero");
        int b=scanner.nextInt();
        return formula*(a*b)/2;

    }
    public static void apartadoB(){

    }
}
