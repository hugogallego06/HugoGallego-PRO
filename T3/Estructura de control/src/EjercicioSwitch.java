import java.util.Scanner;

public class EjercicioSwitch {
    public static void main(String[]args){
    //ejercicio1();
    //ejercicio2();
    //ejercicio3();
    ejercicio4();
    }
    public static void ejercicio1(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe un numero del 1 al 7");
        int numero=scanner.nextInt();
        switch (numero){
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sabado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;

        }
    }
    public static void ejercicio2(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe un caracter");
        char letra=scanner.next().charAt(0);
        switch (letra){
            case 'A' | 'E'| 'I'| 'O'| 'U':
            default:
                System.out.println("Es una consonante");
        }
    }
    public static void ejercicio3(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero=scanner.nextInt();
        int resto=numero%2;
        switch (resto){
            case 0:
                System.out.println("Es par");
                break;
            default:
                System.out.println("Es impar");
                break;
        }

    }
    public static void ejercicio4(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 12 y te dire el mes con dias que tiene: ");
        int mes=scanner.nextInt();
        switch (mes){
            case 1 | 4 | 6 :
            case  8 | 10 | 12:
                System.out.println("Tiene 31 dias");
                break;
            case 2:
                System.out.println("Tiene 28 dias");
                break;
            default:
                System.out.println("Tiene 30 dias");
        }

    }

 }
