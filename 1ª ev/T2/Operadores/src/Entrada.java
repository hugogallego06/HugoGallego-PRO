public class Entrada {
    public static void main(String[] args){

        //OPERADORES ARITMÉTICOS - BINARIOS
        System.out.println("OPERADORES ARITMÉTICOS");
        float operador1=10;
        int operador2=5;
        float resultado= operador1 + operador2; //15
        System.out.println("El resultado de la suma es "+resultado);
        resultado= operador1-operador2; //5.
        System.out.println("El resultado de la resta es "+resultado);
        resultado= operador1*operador2; //50
        System.out.println("El resultado de la multiplicacion es "+resultado);
        operador1=7;
        operador2=4;
        resultado=operador1/operador2; //2
        System.out.println("El resultado de la division es "+resultado);
        resultado=operador1%operador2; // 3.0
        System.out.println("El resultado del resto es "+resultado);

        //ARITMÉTICOS MONARIOS

        resultado = -resultado; // -3
        System.out.println("El resultado del opuesto es "+resultado); // -3
        // ASI NO resultado = resultado  + 1
        resultado++;
        resultado++;
        resultado++;
        resultado++;
        resultado++;
        System.out.println("El resultado del incremento es "+resultado); // 2
        resultado--;
        System.out.println("El resultado del decremento es "+resultado); // 1

        System.out.println("OPERADORES DE ASIGNACIÓN");
        // resultado = 1
        operador1=10;
        resultado+=operador1;
        System.out.println("El resultado de la suma asignada es "+resultado);// 11
        resultado-=6;
        System.out.println("El resultado de la resta asignada es"+resultado); // 5
        resultado*=3;
        System.out.println("El resultado de la multiplicación asignada es"+resultado); // 15
        resultado/=2;
        System.out.println("El resultado de la división asignada es "+resultado); // 7.5
        resultado%=2;
        System.out.println("El resultado de la modulo asignado es "+resultado); // -1


        //COMPARADORES ARITMÉTICOS
        operador1=15;
        operador2=10;
        // > mayor que
        boolean comparacion= operador1>operador2; // 15 > 10
        System.out.println("El resultado de la comparación es "+comparacion);
        // >= mayor o igual que
        comparacion= operador1>=operador2; // 15 >= 10
        System.out.println("El resultado de la comparación es "+comparacion);
        // < menor que
        comparacion= operador1<operador2; // 15 < 10
        System.out.println("El resultado de la comparación es "+comparacion);
        // <= menor o igual que
        operador1=80;
        operador2=30;
        comparacion= operador1<=operador2; // 80 <= 30
        System.out.println("El resultado de la comparación es "+comparacion);
        // == igual que
        operador1=90;
        operador2=90;
        comparacion= operador1==operador2; // 90 == 90
        System.out.println("El resultado de la comparación es "+comparacion);
        // != diferente
        comparacion= operador1!=operador2; // 90 != 90
        System.out.println("El resultado de la comparación es "+comparacion);
        // ! negación
        comparacion = !comparacion; // true
        System.out.println("El resultado de la comparación es "+comparacion);

        System.out.println("OPERADORES LÓGICOS");

        operador1=30;
        operador2=40;
        boolean n3= true;
        int n4=-20;
        boolean resultadoLogico=(operador1<operador2) && n3 && n4<0; //true && true && true = true
        System.out.println("El resultado lógico de las && es "+resultadoLogico);
        resultadoLogico = (operador1>0) || (operador2!=operador1) ||n3 || n4>0; // true / true / true / false = true
        System.out.println("El resultado lógico de las && es "+resultadoLogico);
        boolean resultadoCompuesto = ((operador1>operador2) && !n3 && (n4=10)) || n4>0 || operador2>0;

        String palabra1 = "Hola";
        String palabra2 = "hola";
        boolean resultadoPalabras = palabra1.equalsIgnoreCase(palabra2);
        System.out.println("El resultado de la comparación de las palabras es "+resultadoPalabras);

        // CASTING

        int n1= 4;
        int n2=3;
        double resultadoOperacion= (double)n1/n2;
        System.out.println("El resultado de la division es "+resultadoOperacion);

        // PARSEO para forzar los datos a otros tipos

        String n1string = String.valueOf(n1);
        String palabra= "12345";
        int numeroPalabra= Integer.parseInt(palabra);
    }
}
