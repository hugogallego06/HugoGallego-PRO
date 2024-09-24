public class Entrada {

    static int edadClase = 50;
    //mod_acc mod_adicional mod_retorno nombre (argumentos) { cuerpo }

    public static void main (String[] args){

        // edadClase=20;

        System.out.println("Proyecto de variables");

        //Tipo nombre = valor (el valor es opcional)
        String nombre = "Borja";
        final String CIF = "B12345"; // La variable no puede cambiar por el final y SIEMPRE en mayusculas

        char letra ='A';
        Character letraCompleta = 'a';

        // PROBLEMAS DE MEMORIA CON VARIABLES INCORRECTAS
        // VARIABLES COMPLEJAS MEJORES PARA MAS USOS SINO VARIABLES NORMALES
        short numeroPequeno= 23; // numero pequeño (-255,255)
        Short PequenioCompleto = 23;
        //pequenioCompleto


        int edad= 40; //numero sin decimal (-65.435, 65.435)
        Integer edadCompleja = 40;


        System.out.println("Mi edad es "+edad);
        edad=41;
        System.out.println("Cambio");
        System.out.println("Mi edad es "+edad);

        long telefono= 123456789;
        Long telefonoCompleto= 123123123123L; //SI EL DATO ES MUY GRANDE ACABAMOS EN L

        float altura= 3.14f; //SIEMPRE TERMINAMOS CON F
        Float alturaCompleja= 4.134567f;

        double decimalesDetalle= 3.123456;
        Double decimalesComplejos= 3.3567;

        boolean carne= true; //false //SOLO VALORES TRUE O FALSE
        Boolean carnetComplejo= true;
    }
    public static void miMetodo (){
        edadClase=80;
        String nombre = "Julia";
        int edad = 40;
    }
    public static void otroMetodo(){
        edadClase=90;
        // this.edadClase=90;
        //Para nombrar a una variable de CLASE que tenga el mismo NOMBRE que una variable de BLOQUE usamos this.
    }
    public void valoresMaximos(){
        System.out.println("Imprimiendo los valores maximos y minimos de los tipos");
    }
}
