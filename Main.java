import java.util.Random;
import java.util.Scanner;

public class Main {

    public static double[][] sismos = new double[7][24];

    public static void main(String[] args) {

        int opcion;
        boolean salir = true;

        do{

            imprimirMenu();
            opcion = pedirCasoMenu();
            switch (opcion) {
                case 1:
                    ingresarDatos();
                    break;
                case 2:
                    System.out.printf("El mayor sismo es %f", buscarMayorSismo());
                    break;
                case 3:
                    System.out.printf("Hay %d sismos de magnitud mayor o igual a 5.0", contarSismos());
                    break;
                case 4:
                    enviarSMS();
                    break;
                case 5:
                    salir = false;
                    break;
                default:
                    System.out.println("Número no válido");
                    break;
            }
        }while(salir);
    }

    private static void imprimirMenu(){
        System.out.println("i. Ingresar datos");
        System.out.println("ii. Mostrar sismo de mayor magnitud");
        System.out.println("iii. Contar sismos mayores o iguales a 5.0");
        System.out.println("iv. Enviar SMS por cada sismo mayor o igual a 7.0");
        System.out.println("v.  Salir (S/N)");
    }

    private static void ingresarDatos(){
        Random random = new Random();
        double numeroAleatorio;

        for(int i = 0; i < 7; i++) {
            for (int j = 0; j < 24; j++) {
                numeroAleatorio = random.nextDouble() * 9.9;
                sismos[i][j] = numeroAleatorio;
            }
        }
    }

    private static double buscarMayorSismo(){
        double mayor = -1;
        for (int i = 0; i < 7; i++)
            for (int j = 0; j < 24; j++)
                if(sismos[i][j] > mayor)mayor = sismos[i][j];

        return mayor;
    }

    private static int contarSismos(){
        int mayoresQueCinco = 0;
        for (int i = 0; i < 7; i++)
            for (int j = 0; j < 24; j++)
                if(sismos[i][j] >= 5.0)mayoresQueCinco++;

        return mayoresQueCinco;
    }

    private static void enviarSMS(){
        for (int i = 0; i < 7; i++)
            for (int j = 0; j < 24; j++)
                if(sismos[i][j] >= 7.0)
                    System.out.println("Alerta!!! se debe evacuar zona costera!");

    }

    private static int pedirCasoMenu(){
            Scanner scanner = new Scanner(System.in);
            int caso = scanner.nextInt();
            return caso;
        }
}
