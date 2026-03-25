package Trabalho;

import java.util.Scanner;

public class Uni4Exe02 {

    public static void main(String[] args) {

        double valor;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o valor");
        valor = leitor.nextDouble();

        if (valor % 2 == 0) {

            System.out.println("Número é par");
        } else {
            System.out.println("Número é impar");
        }
        leitor.close();
    }

}
