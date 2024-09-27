import java.util.Scanner;

public class Entrada {
    public static void main(String[] args){
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        ejercicio6();
        //ejercicio7();
    }

    public static void ejercicio1(){
        final String NOMBRE="Hugo Gallego Crespo";
        final String CALLE="C/ Ronda de Humedales";
        final int PORTAL=1;
        final int PISO=1;
        final char LETRAPISO='A';
        final int CODIGOPOSTAL=28971;
        final String LOCALIDAD="Griñon";
        final String PROVINCIA="Madrid";
        final String PAIS="España";

        System.out.println(NOMBRE);
        System.out.printf("%s nº%d %d%c\n",CALLE,PORTAL,PISO,LETRAPISO);
        System.out.printf("%d,%s %s\n",CODIGOPOSTAL,LOCALIDAD,PROVINCIA);
        System.out.println(PAIS);

    }

    static Scanner lector = new Scanner(System.in);

    public static void ejercicio2(){
        System.out.println("Introduce tu nombre completo");
        String nombre = lector.nextLine();
        System.out.println("Introduce tu edad ");
        int edad = lector.nextInt();
        System.out.println("Te llamas "+nombre+"\nTienes "+edad+" años");


    }

    public static void ejercicio3(){

        System.out.println("Introduce el primer operando ");
        int numero1= lector.nextInt();
        System.out.println("Introduce el segundo operando");
        int numero2= lector.nextInt();
        float divisionReal=(float)numero1/numero2;
        float restoReal=(float)numero1%numero2;

        System.out.printf("La suma de %d y %d es %d\n",numero1,numero2,numero1+numero2);
        System.out.printf("La resta de %d y %d es %d\n",numero1,numero2,numero1-numero2);
        System.out.printf("La multiplicacion de %d y %d es %d\n",numero1,numero2,numero1*numero2);
        System.out.printf("La division entera de %d y %d es %d\n",numero1,numero2,numero1/numero2);
        System.out.printf("El resto de %d y %d es %d\n",numero1,numero2,numero1%numero2);
        System.out.printf("La division real de %d y %d es %f\n",numero1,numero2,divisionReal);
        System.out.printf("El resto real de %d y %d es %f\n",numero1,numero2,restoReal);
    }
    public static void ejercicio4(){

        System.out.println("¿Cuantas bebidas quieren?");
        int bebidas= lector.nextInt();
        System.out.println("¿Y bocadillos?");
        int bocadillos= lector.nextInt();
        float costeBebidas=1.25f;
        float costeBocadillos=2.05f;
        float coste=(costeBebidas*bebidas)+(costeBocadillos*bocadillos);
        System.out.println("Coste de las bebidas: "+costeBebidas*bebidas);
        System.out.println("Coste de los bocadillos: "+costeBocadillos*bocadillos);
        System.out.println("Coste consumicion:"+coste);
    }
    public static void ejercicio5(){
        System.out.println("Introduce un numero de segundos");
        int segundos= lector.nextInt();
        int horas= segundos/3600;
        int segundosTotales=segundos%3600;
        int minutos=segundosTotales/60;
        System.out.println("Numero de segundos: "+segundos);
        System.out.println("Horas: "+horas);
        System.out.println("Minutos: "+minutos);
        System.out.println("Segundos: "+segundosTotales);
    }
    public static void ejercicio6(){
        System.out.println("Introduce el valor de la compra ");
        float precioArticulo=lector.nextFloat();
        System.out.println("Introduce el valor del IVA ");
        int iva=lector.nextInt();
        float ivaPagada=precioArticulo*((float)iva/100);
        float precioNeto=precioArticulo-ivaPagada;
        System.out.printf("Compra sin IVA: %.2f\n Precio IVA: %.2f\n =======\n ",ivaPagada,precioNeto);
    }
    public static void ejercicio7() {
        int radio=lector.nextInt();

    }
    public static void ejercicio8() {
        int radio=lector.nextInt();


    }
    public static void ejercicio9() {
        int radio=lector.nextInt();

    }
    public static void ejercicio10() {
        int radio=lector.nextInt();

    }
    public static void ejercicio11() {
        int radio=lector.nextInt();

    }
    public static void ejercicio12() {
        int radio=lector.nextInt();

    }
    public static void ejercicio13() {
        int radio=lector.nextInt();

    }
    public static void ejercicio14() {
        int radio=lector.nextInt();

    }
    public static void ejercicio15() {
        int radio=lector.nextInt();

    }

}
