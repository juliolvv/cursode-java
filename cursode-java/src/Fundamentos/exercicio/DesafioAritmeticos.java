package Fundamentos;

public class DesafioAritmeticos {

    public static void main(String[] args) {

        double parteA = Math.pow(6 * (3 + 2), 2) / (3 * 2);
        double parteB = Math.pow((1 - 5) * (2 - 7) / 2, 2);

        double resultadoFinal = Math.pow(parteA - parteB, 3) / Math.pow(10,3);

        System.out.println("Resultado final é: " + (int)resultadoFinal);

    }
}
