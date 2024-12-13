import java.util.Scanner;

public class ejerciciosWhile {
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        ejercicio4();
        //ejercicio5y6();
    }
    static Scanner scanner=new Scanner(System.in);
    public static void ejercicio1(){
        int numero;
        int acumulador=0;
        do{
            System.out.println("Introduce un numero");
            numero=scanner.nextInt();
            if (numero>0) {
                acumulador += numero;
            }
        } while (numero!=0);

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
            //Cosas dentro del while
        }
        System.out.println("El Mínimo Común Múltiplo de " + numero1 + " y " + numero2 + " es: " + resultado);
    }
    public static void ejercicio3(){
        int num1, numeroMax=-1, numeroMinimo = 101;
        do{
            num1=(int)(Math.random()*101);

            System.out.println(num1);

            if (num1 > numeroMax) {
                numeroMax = num1;
            }
            if (num1 > numeroMinimo) {
                numeroMinimo=num1;
            }
        }while (num1!=0);
        System.out.printf("Tu numero mas grande es %d : \n ",numeroMax);
        System.out.printf("Tu numero mas pequeño es %d : \n ",numeroMinimo);

    }
    public static void ejercicio4(){
        int numero, base, division, resto;
        do {
            System.out.println("Introduce un entero no negativo," +
                    " para convertirlo en binario,octal" +
                    " y hexadecimal");
            base=2;
            numero=scanner.nextInt();
            division=numero/base;
            division/=base;
            System.out.println(division);
            resto=numero%base;
            String binario=" ";
            System.out.println(resto);

        } while (numero>1);


        //10 y en binario 1010
        // 10 / 2 = 5 resto 0.
        // 5 / 2 = 2 resto 1.
        // 2 / 2 = 1 resto 0.
        // para sacarlo dividmos entre 2 hasta que no se pueda mas
        // los restos son mis numeros binarios


    }
    public static void ejercicio5y6() {

        //una vez termine el juego preguntar si quiere repetir
        String repetir;
        do{
            int numero=(int)(Math.random()*21);
            int numeroUsuario=0;
            int intentos=0;
            //Solo tengo 5 intentos
            int numeroIntentos=5;

        do{
            System.out.println("Lo siento, intentalo de nuevo:");
            numeroUsuario=scanner.nextInt();
            intentos++;
            numeroIntentos--;
            if (numero == numeroUsuario) {
                System.out.printf("Enhorabuena, has acertado el número en %d intentos",intentos);
            }
            else {
                System.out.println("Lo siento has fallado, intentalo de nuevo");
            }
        } while (numero!=numeroUsuario && numeroIntentos>0);

        System.out.println("Quieres volver a jugar (S/N) :");
        repetir=scanner.nextLine();

        }while (repetir.equalsIgnoreCase("S"));
    }
}
