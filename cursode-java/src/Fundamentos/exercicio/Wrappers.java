package Fundamentos;

import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //byte
        Byte b = 100;
        Short s = 1000;

        // Integer.parseInt(entrada.nextLine()); // int
        Integer i = 10000;
        Long l = 10000000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 8);
        System.out.println(l * 8);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);

        entrada.close();
    }
}
