public class Main {

    public static void main(String[] args){
        imprimirMenu();
    }

    private static void imprimirMenu(){
        System.out.println("i. Ingresar datos");
        System.out.println("ii. Mostrar sismo de mayor magnitud");
        System.out.println("iii. Contar sismos mayores o iguales a 5.0");
        System.out.println("iv. Enviar SMS por cada sismo mayor o igual a 7.0");
        System.out.println("v.  Salir (S/N)");
    }
}
