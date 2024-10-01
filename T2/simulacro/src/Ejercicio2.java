import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nombre del 1º participante: ");
        String nombre1= scanner.next();
        System.out.println("Numero de jugadores del 1º participante: ");
        int numero1= scanner.nextInt();
        System.out.println("Presupuestos del 1º participante: ");
        int presupuesto1=scanner.nextInt();
        System.out.println("Nombre del 2º participante: ");
        String nombre2= scanner.next();
        System.out.println("Numero de jugadores del 2º participante: ");
        int numero2= scanner.nextInt();
        System.out.println("Presupuestos del 2º participante: ");
        int presupuesto2=scanner.nextInt();
        System.out.println("Nombre del 3º participante: ");
        String nombre3= scanner.next();
        System.out.println("Numero de jugadores del 3º participante: ");
        int numero3= scanner.nextInt();
        System.out.println("Presupuestos del 3º participante: ");
        int presupuesto3 =scanner.nextInt();

        boolean comparador = (numero1==11);
        System.out.println("El primer participante tiene 11 jugadores: "+comparador);
        comparador = (numero2%2)==0;
        System.out.println("El segundo participante tiene jugadores pares: "+comparador);
        comparador =  presupuesto3>0;
        System.out.println("El tercer participante tiene un presupuesto positivo: "+comparador);
        comparador = numero1==11 && presupuesto1>0 && numero2==11 && presupuesto2>0 && numero3==11 && presupuesto3>0;
        System.out.println("La liga está preparada para empezar: "+comparador);
    }
}
