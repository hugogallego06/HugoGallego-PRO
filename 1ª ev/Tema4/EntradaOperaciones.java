import java.util.Scanner;

public class EntradaOperaciones {
    public static void main(String[] args) {
        //Object[] cosas = new Object[4]; //null
        Object[] cosas = {5,"dam",true,'a',5.9,7};
        /* RECORREMOS NUESTRO ARRAY
        for (int i = 0; i <cosas.length ; i++) {
            //System.out.println(cosas[i]); PARA VER LO METIDO EN EL ARRAY

            // ERES INSTANCIA DE STRING (en este caso), preguntamos al object que clase es
            if (cosas[i] instanceof String) {
                System.out.println(cosas[i]);
                System.out.println("La lontigud de la palabra es "+((String) cosas[i]).length());
            }
        }
        */

        // BÚSQUEDAS -> {1,2,23,543897,654,7}
        // QUIERO SABER SI ESTA EL 7 -> Recorro y termino cuando encuentro
        //Lo encuentro cuando el item == elemento
        int [] numeros= {1234,5643,5643,6543,7636,54,90};

        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce el numero que quieres buscar ");
        /*
        if (!estaNUmero(numeroUsuario,numeros)){
            System.out.println("El numero no esta");
        }  */
        boolean respuesta;
        do {
            int numeroUsuario=scanner.nextInt();
            respuesta=estaNUmero(numeroUsuario,numeros);
        }while (!respuesta);
        /*
        estaNUmero(4,numeros);// true o false
        estaNUmero(8,numeros);
        estaNUmero(10,numeros);
        */
        // EN EL METODO DE ABAJO ESTA ESTO
        /*boolean encontrado=false;
        for (int item:numeros) {
            if (item == numeroUsuario) {
                encontrado=true;
                System.out.println("Numero encontrado");
                break;
            }
        }
        if (!encontrado){
            System.out.println("No esta el numero");
        }*/
    }
    public static boolean estaNUmero(int numeroBuscar, int [] conjunto){

        // {4, 7, 1, 9, 3}
        // 9

        for (int item : conjunto){
            if (item == numeroBuscar) {
                System.out.println("Numero encontrado");
                return true; //ROMPE EL BUCLE POR EL RETURN
            }
        }
        return false;
    }
}
