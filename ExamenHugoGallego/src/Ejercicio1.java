import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        //a
        System.out.println("Introduce tu nombre :");
        String nombre = scanner.next();
        System.out.println("Introduce tu apellido :");
        String apellido = scanner.next();
        //b
        System.out.println("Dinero a disponer: ");
        double dinero=scanner.nextInt();
        //c
        System.out.println("Cuanto cuesta la play 5 que te quieres comprar(precio sin iva)");
        int precioPlay=scanner.nextInt();
        //d
        System.out.println("Cuanto cuesta el iPhone 15 que te quieres comprar(precio sin iva)");
        int precioIphone=scanner.nextInt();
        //e
        System.out.println("Iva actual");
        int iva=scanner.nextInt();
        double totalPlay= precioPlay+(precioPlay*(float)iva/100);
        double totalIphone= precioPlay+(precioPlay*(float)iva/100);
        //f
        boolean comparador=totalPlay<dinero;
        System.out.println("Te puedes comprar la play: "+comparador);
        comparador=totalIphone<dinero;
        System.out.println("Te puedes comprar el Iphone 15: "+comparador);
        comparador=totalIphone<dinero && totalPlay<dinero;
        System.out.println("Te puedes comprar las dos cosas: "+comparador);
    }
}
