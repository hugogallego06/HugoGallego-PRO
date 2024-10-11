import java.util.Scanner;

public class ejerciciosFor {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un numero para ver su tabla de multiplicar");
        int numero=scanner.nextInt();
        for (int a=0; a<11; a++) {
            System.out.printf("%d * %d = %d\n ",numero,a,numero*a);
        }
    }
}
