import java.util.Scanner;

public class ejemplosEjerciciosFor {
    public static void main(String[]args){
        //ejercicioClase1();
        //ejercicioClase2();
        ejercicioClase3();
    }
    public static Scanner scanner=new Scanner(System.in);
    public static void ejercicioClase1(){
        System.out.println("Introduce un numero para ver su tabla de multiplicar");
        int numero=scanner.nextInt();
        for (int a=0; a<11; a++) {
            System.out.printf("%d * %d = %d\n ",numero,a,numero*a);
        }
    }
    public static void ejercicioClase2(){
        int suma = 0;
        System.out.println("Introduce 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i+1) + ": ");
            int numero = scanner.nextInt();
            suma += numero;
        }

        System.out.println("La suma total es: " + suma);

    }
    public static void ejercicioClase3(){
        for (int a=0; a<100; a++){
            int num=(int)(Math.random()*1001);
            System.out.println("Numero "+(a+1)+":"+num);
            int resto=num%2;
            boolean par=resto==0;
            System.out.println("Este numero es"+par);
        }
        }
}
