import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){

        final int precio= 30000;
        final float plazos= 3.5f;
        float totalPrimero =(precio*plazos)/100;

        System.out.printf("El interés pagado es %.1f en el primer mes es de %.0f\n ",plazos,totalPrimero);
        float interes=3.5f*2;
        float total = (25000*interes)/100;

        System.out.printf("El interés pagado es %.0f en el segundo mes es de %.0f\n ",interes,total);
        interes+=3.5f;
        total= (20000*interes)/100;
        System.out.printf("El interés pagado es %.1f en el tercer mes es de %.0f\n ",interes,total);
        interes+=3.5f;
        total=(15000*interes)/100+400;
        System.out.printf("El interés pagado es %.0f en el cuarto mes es de %.0f\n ",interes,total);
        interes+=3.5f;
        total= (10000*interes)/100;
        System.out.printf("El interés pagado es %.1f en el quinto mes es de %.0f\n ",interes,total);
        interes+=3.5f;
        total= (5000*interes)/100;
        System.out.printf("El interés pagado es %.0f en el sexto mes es de %.0f\n ",interes,total);

    }

}
