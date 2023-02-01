package ExercicioJava;

public class Exer02 {
    public static void main(String[] args) {
        imprimirTela(Calculadora.somar(1,2));
        imprimirTela(Calculadora.subtrair(1,2));
        imprimirTela(Calculadora.multiplicar(1,2));
        imprimirTela(Calculadora.dividir(1,2));
        imprimirTela(Calculadora.potencia(1.0,2.0));
    }

    static void imprimirTela(int num){
        System.out.println(num);
    }
    static void imprimirTela(double num){
        System.out.println(num);
    }
}
