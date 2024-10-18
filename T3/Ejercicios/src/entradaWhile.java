import java.util.Scanner;

public class entradaWhile {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        //int i = 10;
        /*while(i>0){
            System.out.println("El valor de i es "+i);
            i--;
        }*/

        /*int numero=-1;
        while (numero!=0){
            i++;
            System.out.println("Introduce numero ");
            numero=scanner.nextInt();
        } while (numero%2!=0) PARA UN PAR*/
        /*int i=0;
        int numero;
        do {
            System.out.println("Introduce numero");
            numero=scanner.nextInt();
            i++;
        }while (numero!=0);
        System.out.println("El numero de introducidos es "+i);*/
        int numero;
        do {
            System.out.println("1. Opcion añadir\n"+
                                "2. Opcion borrar\n"+
                                "3. Opcion listar\n"+
                                "4. Opcion buscar\n"+
                                "5. Salir\n");
            System.out.println("¿Que quieres hacer?");
            numero=scanner.nextInt();
            switch (numero){
                case 1:
                    System.out.println("Has introducido la opcion 1, añadir");
                    break;
                case 2:
                    System.out.println("Has introducido la opcion 2, borrar");
                    break;
                case 3:
                    System.out.println("Has introducido la opcion 3, listar");
                    break;
                case 4:
                    System.out.println("Has introducido la opcion 4, buscar");
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción incorrecta, introduce otro numero");
            }
        }while (numero!=5);
    }
}
