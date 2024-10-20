import java.util.Scanner;

public class ejerciciosWhile {
    public static void main(String[] args) {
        //ejercicio1();
        ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
    }
    static Scanner scanner=new Scanner(System.in);
    public static void ejercicio1(){
        int acumulador=0;
        int numero=-1;
        while (numero!=0){
            System.out.println("Introduce un numero");
            numero=scanner.nextInt();
            if (numero<0){
                System.out.println("El numero introducido es negativo. Introduce otro numero :");
                numero=scanner.nextInt();
            }else {
                acumulador+=numero;
            }
        }
        System.out.println("La suma de los numeros positivos es: "+acumulador);
    }
    public static void ejercicio2(){
        // Calcúlese el mínimo común múltiplo de dos números entre 1 y 100.

        System.out.println("Introduce un numero para saber su mcm ");
        int numero1=scanner.nextInt();

        System.out.println("Introduce otro numero ");
        int numero2=scanner.nextInt();
        int resultado=numero1;
        int multiplicador=1;
        while (resultado%numero2!=0){
            multiplicador++;
            resultado=numero1*multiplicador;
        }
        System.out.println("El Mínimo Común Múltiplo de " + numero1 + " y " + numero2 + " es: " + resultado);
    }
    public static void ejercicio3(){
        int aleatorio1=(int)(Math.random()+100);
        int aleatorio2=(int)(Math.random()+100);
        while (aleatorio1!=0 && aleatorio2!=0){
                aleatorio1=Integer.MAX_VALUE;
                aleatorio2=Integer.MAX_VALUE;
                System.out.println(aleatorio1+", "+aleatorio2);
        }
        System.out.println("Lo siento el numero genrado fue un 0");
    }
    public static void ejercicio4(){
        int acumulador=0;
        int numero=-1;
        while (numero!=0){
            System.out.println("Introduce un numero");
            numero=scanner.nextInt();
            if (numero<0){
                System.out.println("El numero introducido es negativo. Introduce otro numero :");
                numero=scanner.nextInt();
            }else {
                acumulador+=numero;
            }
        }
        System.out.println("La suma de los numeros positivos es: "+acumulador);
    }
    public static void ejercicio5(){
        int acumulador=0;
        int numero=-1;
        while (numero!=0){
            System.out.println("Introduce un numero");
            numero=scanner.nextInt();
            if (numero<0){
                System.out.println("El numero introducido es negativo. Introduce otro numero :");
                numero=scanner.nextInt();
            }else {
                acumulador+=numero;
            }
        }
        System.out.println("La suma de los numeros positivos es: "+acumulador);
    }
}
