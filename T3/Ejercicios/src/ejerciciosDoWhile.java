import java.util.Scanner;

public class ejerciciosDoWhile {
    public static void main(String[] args) {
        ejercicio1();
    }
    public static Scanner scanner= new Scanner(System.in);
    public static void ejercicio1(){
        int numero=scanner.nextInt();
        do{
            System.out.println("Tu número par es: "+numero);
            int resto=numero%2;
            boolean par=resto==0;
            System.out.println("Es par"+par);
        }while(numero>1);

    }
}
