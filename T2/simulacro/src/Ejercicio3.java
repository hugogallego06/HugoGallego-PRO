import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Precio del coche: ");
        int precio= scanner.nextInt();
        System.out.println("Plazos del coche: ");
        int plazos= scanner.nextInt();
        int total=precio/plazos;
        System.out.printf("Vas a pagar %d y en un plazo de %d meses," +
                "con un total de %d\n " +
                "(sin tener en cuenta los intereses)",precio,plazos,total);
    }
}
