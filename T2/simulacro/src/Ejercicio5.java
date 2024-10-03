import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){

        System.out.println("Introduce la base: ");
        int baseTriangulo = teclado.nextInt();
        System.out.println("Introduce la altura: ");

        int alturaTriangulo = teclado.nextInt();
        int totalTriangulo = areaTriangulo(baseTriangulo, alturaTriangulo);

        System.out.println("Total triangulo: "+ totalTriangulo);

        System.out.println("Introduce el radio del círculo: ");
        int radioCirculo = teclado.nextInt();
        int area = areaCirculo(radioCirculo);
        System.out.println("El area del circulo es "+area);

        System.out.println("Introduce la altura del triangulo ");
        int altura =teclado.nextInt();
        System.out.println("Introduce la base del triangulo ");
        int base = teclado.nextInt();
        System.out.println("Introduce el lado del triangulo ");
        int lado = teclado.nextInt();
        System.out.printf("El área del triangulo con base %d y altura %d es %d \n",base,altura,((base*altura)/2));
        boolean comparador= (altura==base && base==lado);
        System.out.println("El triangulo es equilatero "+comparador);
        comparador= (altura==base || base==lado || altura==lado) && (altura!=base || base!=lado) ;
        System.out.println("El triangulo es isosceles "+comparador);
    }
    static Scanner teclado=new Scanner(System.in);
    public static int areaTriangulo(int baseTriangulo, int alturaTriangulo){
        return ((baseTriangulo* alturaTriangulo)/2);
    }
    public static int areaCirculo(int radioCirculo){

        return (int) ((radioCirculo * radioCirculo) * Math.PI);
    }
}



