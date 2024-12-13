import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        //a
        System.out.println("Introduce un tipo de café (espresso, latte, capuchino): ");
        String cafe=scanner.next();
        //b
        System.out.println("Introduce la cantidad de azucar del café: ");
        int azucar=scanner.nextInt();
        //c
        System.out.println("Introduce el tamaño del café (pequeño, mediano, grande): ");
        String tamano=scanner.next();
        //d
        System.out.printf("Preparando un cafe de tipo %s de tamaño %s con %d " +
                "cucharaditas de azucar",cafe,tamano,azucar);

    }
}
