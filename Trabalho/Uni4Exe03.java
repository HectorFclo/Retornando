package Trabalho;

import java.util.Scanner;

public class Uni4Exe03 {
    

        public static void main(String[] args) {

        double valor1, valor2;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o primeiro valor");
        valor1 = leitor.nextDouble();
        System.out.println("Informe o segundo valor");
        valor2 = leitor.nextDouble();


        if (valor1 > valor2) {

            System.out.println("O valor " +valor1+ " é maior do que o valor "+ valor2);
        }else{
            System.out.println("O valor " +valor2+ " é maior do que o valor "+ valor1);
        }
        leitor.close();
    }

}
