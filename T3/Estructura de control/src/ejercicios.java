import java.util.Scanner;

public class ejercicios {
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        ejercicio3();
    }
    static Scanner scanner= new Scanner(System.in);
    public static void ejercicio1(){
        System.out.println("Introduce un numero: ");
        int a = scanner.nextInt();
        String s ="Impar";
        if (a%2==0){
            s="Par";
        }
        System.out.println(s);
    }
    public static void ejercicio2(){
        System.out.println("Introduce un numero: ");
        int a = scanner.nextInt();
        if (a%2==0){
            // a+=1;
            a++;
        }else if (a<10){
            //a-=1;
            a--;
        } else if (a<100) {
            a*=2;
            // a+=1;
            a++;
        }
        else {
            a=0;
        }
        System.out.println("El valor de a es: "+a);
    }
    public static void ejercicio3(){
        System.out.println("Introduce un numero: ");
        int a = scanner.nextInt();
        if (a<0){
            System.out.println("Negativo");
        } else if (a<10) {
            System.out.println("Un digito");
        }
        else if(a<100){
            System.out.println("Dos digitos");;
        }
        else if (a<1000){
            System.out.println("Tres digitos");
        }
    }
}
