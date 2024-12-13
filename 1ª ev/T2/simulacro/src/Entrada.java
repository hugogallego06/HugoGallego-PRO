import java.util.Scanner;

public class Entrada {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre=scanner.next();
        System.out.println("Introduce tu apellido: ");
        String apellido=scanner.next();
        System.out.println("Introduce tu edad: ");
        int edad=scanner.nextInt();
        System.out.println("Introduce tu altura: ");
        float altura=scanner.nextFloat();
        System.out.println("Introduce tu peso: ");
        float peso=scanner.nextFloat();
        System.out.println("Introduce tu sexo: ");
        //char sexo=scanner.next().charAt(0); A
        String sexo=scanner.next();
        float imc= calculoIMC(peso,altura);
        System.out.printf("Hola %s tu IMC " +
                "teniendo en cuenta tu altura de %.2fm y " +
                "tu peso de %.2fkg, tiene un valor de %.2f\n"
        ,nombre,altura,peso,imc);
    }

    public static float calculoIMC(float peso, float altura){
        return (float)(peso/Math.pow(altura,2));
    }
}
