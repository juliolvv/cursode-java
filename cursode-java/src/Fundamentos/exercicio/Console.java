package Fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

         System.out.print("Bom");
         System.out.print(" dia!\n");
         System.out.println("Bom");
         System.out.println(" dia!");

         System.out.printf("Megasena: %d %d %d %d %d \n",
                 1, 2, 3, 4, 5);
         System.out.printf("Salário: %.1f", 1234.5678);

         Scanner entrada = new Scanner(System.in);

         System.out.print("\nDigite seu nome: ");
         String nome = entrada.nextLine();

        System.out.print("\nDigite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("\nDigite sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("\n%s %s tem %d anos.%n",
                nome, sobrenome, idade);

        entrada.close();
    }
}
