package ExercicioJava;
//exer02
public class Calculadora {
   //public static par nao fazer estancia da classe pra acessar o metodo

    public static int somar(int num1, int num2){
        return num1 + num2;
    }

    public static int subtrair(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    public static int dividir (int num1, int num2){
        return num1 / num2;
    }

    // x^n
    //x*x*x*x (n vezes)
    public static double potencia(double num1, double num2){
        return Math.pow(num1,num2);

        //ou
        /* int total = num1;
        for(int i=1; i<=num2; i++){
            total *= num1;
            return total; */
        }
    }

