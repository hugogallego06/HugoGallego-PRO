import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        System.out.println("Introduce la base: ");
        int baseTriangulo = teclado.nextInt();
        System.out.println("Introduce la altura: ");
        int alturaTiangulo = teclado.nextInt();
        int totalTriangulo = areaTriangulo(baseTriangulo, alturaTiangulo);
        System.out.println("Total triangulo: "+ totalTriangulo);
    }
    static Scanner teclado=new Scanner(System.in);

    public static int areaTriangulo(int baseTriangulo, int alturaTriangulo){
            return (int) ((baseTriangulo* alturaTriangulo)/2);
        }

    }
    public static void apartadoB(){

    }

