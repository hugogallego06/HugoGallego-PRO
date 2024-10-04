import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        //a
        System.out.println("Introduce tu nombre: ");
        String nombre=scanner.next();
        System.out.println("Introduce tu apellido: ");
        String apellido=scanner.next();
        //b
        System.out.println("Sueldo que esperas recibir: ");
        int sueldo=scanner.nextInt();
        //c
        System.out.println("Introduce tu edad");
        int edad=scanner.nextInt();
        //d
        System.out.println("Introduce tu dia de cumpleaños: ");
        int dia=scanner.nextInt();
        //e
        System.out.println("Introduce si tienes carnet de conducir o no: ");
        String carnet=scanner.next();
        //f
        boolean comparador=(edad<50 && sueldo<40000 && carnet.equalsIgnoreCase("Si")) || (edad>45 && sueldo<20000 && dia%2==0);
        System.out.printf("Con los datos introducidos, el candidato cuyo nombre es" +
                " %s tiene como resolución: %s",nombre,comparador);
    }
}
