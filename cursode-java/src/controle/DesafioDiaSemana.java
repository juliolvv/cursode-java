package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

    public static void main(String[] args) {

        // Domingo -> 1
        // Segunda -> 2
        // Terça   -> 3
        // Quarta  -> 4
        // Quinta  -> 5
        // Sexta   -> 6

        Scanner diaSemana = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");

        String dia = diaSemana.nextLine();

        if (dia.equals("Domingo")) {
            System.out.println("1");
        }
        else if (dia.equals("Segunda")) {
            System.out.println("2");
        }
        else if (dia.equals("Terça")) {
            System.out.println("3");
        }
        else if (dia.equals("Quarta")) {
            System.out.println("4");
        }
        else if (dia.equals("Quinta")) {
            System.out.println("5");
        }
        else if (dia.equals("Sexta")) {
            System.out.println("6");
        }else if (dia.equals("Sábado")) {
            System.out.println("7");
        } else
            System.out.println("Não é válido!");
        diaSemana.close();
    }
}
