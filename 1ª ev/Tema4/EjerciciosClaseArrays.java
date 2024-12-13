import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosClaseArrays {
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        ejercicio9();
    }
    static Scanner scanner=new Scanner(System.in);
    public static void ejercicio1(){
        /*1. MultiplicarArray
         Crear un array de 5 posiciones:
        - se le pedirá al usuario que introduzca cada unos de los elementos del array
        - Multiplica cada elemento del array * 2 y vuelve a guardar su valor
        - Saca por consola la suma de todos los números
        - Saca la media de todos los elementos
        */
        int [] numeros= new int [5];
        int numeroMultiplicados=0, numeroSumados=0;
        for (int i = 0; i < numeros.length ; i++) {
        System.out.println("Introduce numero");
        numeros[i]=scanner.nextInt();
        }

        for (int i = 0; i < numeros.length ; i++) {
        numeros[i]*=2;
        numeroSumados+=numeros[i];
        }

        System.out.println("Los numeros obtenidos son: ");
        for(int item: numeros){
            System.out.println(item);
        }

        System.out.println("La suma de todos es "+numeroSumados);
        double media= (double)numeroSumados/numeros.length;
        System.out.println("La media es "+media);
    }
    public static void ejercicio2(){
        /*2. (MayorArray)
        Crea una aplicación que realice lo siguiente:
        - pida por pantalla la longitud del array de enteros
        - crea el array de enteros con la longitud introducida
        - pida al usuario que introduzca todos los datos del array
        - saque por pantalla el elemento mayor y el elemento menor
        */
        System.out.println("Introduce la longitud de tu Array");
        int cantidadArray=scanner.nextInt();
        int [] numeros=new int[cantidadArray];

        for (int i = 0; i < numeros.length ; i++) {
            System.out.println("Introduce los valores de tu Array");
            numeros[i]=scanner.nextInt();
        }
        //OPCION FACIL PARA ARRAYS MAYORES O MENORES
        /*
        Arrays.sort(numeros);
        System.out.println("El numero mas pequeño es "+numeros[0]);
        System.out.println("El numero mas grande es "+numeros[numeros.length-1]);
        */
        //OPCION DIFICIL (ACTUAL)
        int mayor=numeros[0];
        int menor=numeros[0];
        for (int item: numeros){
            if (item < menor) {
                menor = item;
            }
            if (item > mayor) {
                mayor = item;
            }
        }
    }
    public static void ejercicio3(){
        /*3. (SumaArrays)
        Crear una aplicación que:
        - pida la longitud de dos arrays de enteros
        - crea los array de enteros con las longitudes introducidas
        - rellena ambos arrays con números aleatorios
        - crea un tercer array de la misma longitud que los dos anteriores
        - rellena el tercer array con la suma de las posiciones (Array1.posicion1 + array2.posicion = array3.posicion)
        */
        System.out.println("Introduce la cantidad de tus 2 Arrays");
        int cantidadArray1=scanner.nextInt();
        
        int [] numeros1=new int[cantidadArray1];
        int [] numeros2=new int[numeros1.length];
        for (int i = 0; i < numeros1.length; i++) {
            numeros1[i]=(int)(Math.random()*11);
            numeros2[i]=(int)(Math.random()*11);
        }
        int [] numeros3=new int[numeros1.length];
        for (int i = 0; i <numeros3.length ; i++) {

        }
    }
    public static void ejercicio4(){
        /*4. (PosicionesArray)
        Crea una aplicación que:
        - pida por teclado la longitud de un array
        - cree el array de enteros de la longitud introducida
        - pida al usuario que introduzca todos los datos del array
         */
        System.out.println("Introduce la longitud de tu Array");
        int longitudArray=scanner.nextInt();

        int [] numeros=new int[longitudArray];
        for (int i = 0; i <numeros.length ; i++) {
            System.out.println("Introduce los valores de tu Array");
            numeros[i]=scanner.nextInt();
        }
        // ARRAY ORIGINAL
        for (int item:numeros){
            System.out.println("Array original: "+item);
        }
        /*
          - mueva una posición todos los elementos.
          el elemento de la posición 0 pasa a la posición 1 y así sucesivamente.
            El elemento que está en la última posición pasa a la primera
         */
        int moverDerecha=numeros[numeros.length-1]; // Guardamos el ultimo elemento
        for (int i = numeros.length-1; i >0 ; i--) {
            numeros[i]=numeros[i-1];
        }
        // COLOCAMOS EL UlTIMO ELEMENTO EN LA 1ª posicion
        numeros[0]=moverDerecha;
        for (int item:numeros){
            System.out.println("Despues de mover a la derecha "+item);
        }
        /*- realizar la tarea anterior pero al contrario.
            El elemento que está en la primera posición pasa a la última y así sucesivamente
         */
        int moverIzquierda= numeros[0];
        for (int i = 0; i < numeros.length -1; i++) {
            numeros[i] =numeros[i+1];
        }
        numeros[numeros.length-1]=moverIzquierda;
        for (int item:numeros){
            System.out.println("Despues de mover a la izquierda "+item);
        }
    }
    public static void ejercicio5(){
        /*5. (OperacionesArray) Crear un array con 10 posiciones y
            asígnale números enteros entre 0 y 9,
            ambos inclusive (de forma automática). Se mostrarán los datos separados
            por una coma y un espacio. Una vez hecho esto se modificará el array del
            de la manera indicada en cada apartado, y se mostrará de nuevo.
           
        */
        int [] numero=  new int [10];
        for (int i = 0; i < numero.length ; i++) {
            numero[i]=(int)(Math.random()*10);
        }
        for (int item:numero){
            System.out.print(item+", ");
        }
        System.out.println();
        /* - Incrementar en 1 los valores pares y en -1 los impares.*/
        for (int i = 0; i < numero.length; i++) {
            if (numero[i]%2==0){
                numero[i]++;
            }
            else{
                numero[i]--;
            }
        }
        for (int item:numero){
            System.out.print(item+", ");
        }
        System.out.println();
        /*- Duplicar los valores positivos menores que 5*/
        for (int i = 0; i <numero.length ; i++) {
            if (numero[i]<5 && numero[i]>0) {
                numero[i]*=2;
            }
        }
        for (int item:numero){
            System.out.print(item+", ");
        }
        System.out.println();
        /*- Sumar a cada valor un valor entero aleatorio entre -5 y 5.*/
       for (int i = 0; i <numero.length ; i++) {
            numero[i]=(int)(Math.random()*5)-5;
        }
        for (int item:numero){
            System.out.print(item+", ");
        }
        System.out.println();
        /*- Mover los datos una posición hacia la derecha (el primero pasa al segundo, el
                segundo al tercero, ..., y el último al primero).*/
        int moverDerecha=numero[numero.length-1];
        for (int i = numero.length-1; i >0 ; i--) {
            numero[i]=numero[i-1];
        }
        numero[0]=moverDerecha;
        for (int item:numero){
            System.out.println("Despues de mover a la derecha "+item);
        }
        /*- Intercambiar el primero con el segundo, el tercero con el cuarto, ..., el penúltimo con el último.*/
        for (int i = 0; i < numero.length - 1; i += 2) {
            int temp2 = numero[i];
            numero[i] = numero[i + 1];
            numero[i + 1] = temp2;
        }
        for (int item:numero){
            System.out.println("Despues del intercambio "+item);
        }
        /* - Invertir el array*/
        for (int i = 0; i < numero.length / 2; i++) {
            int temp3 = numero[i];
            numero[i] = numero[numero.length - 1 - i];
            numero[numero.length - 1 - i] = temp3;
        }
        for (int item:numero){
            System.out.println("Invertido "+item);
        }
        /*- Mostrar la posición del primer par y del último impar.*/

    }
    public static void ejercicio6(){
        /*1. (GeneradorPalabras) Crea un programa que cumpla los siguientes requisitos:
        - Crear un de chars con todas las letras del abecedario.
        - Crear un array de String con una longitud pedida por teclado
        - Pedir la longitud de cada una de las palabras que formarán parte del array del apartado
        2. Tras pedir la longitud se creará una palabra de forma aleatoria con la longitud deseada
        (cada letra será una posición del array del apartado 1) y se guardará en el array del apartado 2
        - Imprimir por pantalla las palabras generadas
    */
        Scanner scanner= new Scanner(System.in);
        char [] abecedario = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        System.out.println("Introduce la longitud de tu String Array");
        int longitud=scanner.nextInt();



    }
    public static void ejercicio9(){
        /*1. (MenuArray)Crear un programa que mediante un menú permita:
            - Crear un array de números enteros con n posiciones pedidas.
            - Rellenar el array creado con números aleatorios.
            - Rellenar el array creado con números pedidos por consola.
            - Ordenar el array de mayor a menor
            - Clonar el array con una una mayor longitud. Para ello pedir al usuario la nueva longitud (si esta es inferior a la que la existe continuar pidiendo)
            - Mover todas las posiciones (pedir al usuario que seleccione la orientación)
            - Mostrar por pantalla el array invertido
         */
        int opcion;
        int [] numeros=null;
        do {
            System.out.println("1. Crear un array de números enteros con n posiciones pedidas.\n" +
                    " 2. Rellenar el array creado con números aleatorios.\n" +
                    "3. Rellenar el array creado con números pedidos por consola.\n" +
                    "4. Ordenar el array de mayor a menor\n" +
                    "5. Clonar el array \n" +
                    "6. Mover izquierda \n" +
                    "7. Mover derecha\n"+
                    "8. Mover por pares\n"+
                    "9. Invertir\n"+
                    "10. Imprimir\n"+
                    "11. Salir\n"
                    );
            System.out.println("¿Que quieres hacer?");
            opcion=scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Vamos a generar el array");
                    System.out.println("Cuantas posiciones quieres reservar");
                    int posiciones=scanner.nextInt();
                    numeros=new int[posiciones];
                    System.out.println("Creado correctamente");
                    break;
                case 2:
                    if (numeros !=null) {
                        for (int i = 0; i < numeros.length; i++) {
                            numeros[i]=(int)(Math.random()*21);
                        }
                    }else{
                        System.out.println("Imposible, inicia el array antes ");
                    }
                    break;
                case 3:
                    if (numeros !=null) {
                        System.out.println("Vas a rellenar con aleatorios ");
                        for (int i = 0; i < numeros.length; i++) {
                            System.out.println("Introduce el numero de la posicion "+i);
                            numeros[i]=scanner.nextInt();
                        }
                    }else{
                        System.out.println("Imposible, inicia el array antes ");
                    }
                    break;
                case 4:
                    Arrays.sort(numeros);
                    break;
                case 5:
                    System.out.println("Cual es la nueva longitud del array");
                    int nuevaLongitud=scanner.nextInt();
                    numeros = Arrays.copyOf(numeros,nuevaLongitud);
                    break;
                case 6:
                    if (numeros != null) {
                        System.out.println("Vas a rotar a la izq");
                        int temporal=numeros[0];
                        for (int i = 0; i <numeros.length-1 ; i++) {
                            numeros[i]=numeros[i+1];
                        }
                        numeros[numeros.length-1]=temporal;
                    }else{
                        System.out.println("No se pude rotar");
                    }
                    break;
                case 7:
                    if (numeros != null) {
                        System.out.println("Vas a rotar a la derecha");
                        int temporal=numeros[numeros.length-1];
                        for (int i = numeros.length-1; i >0 ; i--) {
                            numeros[i]=numeros[i-1];
                        }
                        numeros[0]=temporal;
                    }else{
                        System.out.println("No se puede rotar");
                    }
                    break;
                case 8:
                    if (numeros != null) {
                        System.out.println("Vas a mover los pares");
                        for (int i = 0; i <numeros.length ; i+=2) {
                            int temporal = numeros[i];
                            numeros[i] = numeros[i + 1];
                            numeros[i + 1] = temporal;
                        }
                    }else{
                        System.out.println("No se pude rotar");
                    }
                    break;
                case 9:
                    if (numeros != null) {
                        System.out.println("Vas a invertir el array");
                        int temporal=numeros[0];
                        for (int i = 0; i <numeros.length/2 ; i++) {
                            numeros[i]=numeros[numeros.length-1-i];
                            numeros[numeros.length-1-i]=temporal;
                        }
                    }else{
                        System.out.println("No se pude rotar");
                    }
                    break;
                case 10:
                    if (numeros != null) {
                        for (int item:numeros) {
                            System.out.print(item+" ");
                        }
                        System.out.println();
                    }else {
                        System.out.println("No se ha iniciado el array");
                    }
                    break;
                default:
                    System.out.println("Saliendo...");
                    break;
            }
        }while (opcion!=11);



    }
    public static void posicionesPedidas(){

    }
}
