package ExercicioJava;
//exer1
public class Contador {

    private static int cont;

    public Contador(){
        cont++;
    }

    public static void incrementar(){
        Contador.cont++;
    }

    public static void zerar(){
        Contador.cont = 0;
    }

    public static int obterValor(){
        return cont;
    }
}
