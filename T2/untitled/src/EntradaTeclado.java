import java.util.Scanner;
public class EntradaTeclado {
    static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args){
        //String nombre; //null = sin valor

        System.out.println("Porfavor introduce tu nombre");
        nombre = lectorTeclado.next();
        System.out.println("Porfavor introduce tu edad");
        int edad= lectorTeclado.nextInt();
        System.out.println("Porfavor introduce tu altura");
        float altura= lectorTeclado.nextFloat();
        System.out.println("Porfavor introduce tu experiencia");
        boolean experiencia=lectorTeclado.nextBoolean();
        System.out.printf("Mi nombre es: %s tengo %d y mido %1.fm\n",
                nombre, edad, altura);

        // el usuario introduzca su nombre por el teclado
        //nombre = lectorTeclado.next();
        //System.out.println("Mi nombre es " +nombre);
        // Mi nombre es XXX(Borja) tengo XXX(40) mido XXX(1,73)
        // y tengo experiencia trabajando XXX(true)

        System.out.println("Mi nombre es " +nombre);
        // Mi nombre es XXX(Borja) tengo XXX(40) mido XXX(1,73)
        // y tengo experiencia trabajando XXX(true)
    }
}
