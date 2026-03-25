package Trabalho;

import java.util.Scanner;

public class Uni4Exe04 {
    
        public static void main(String[] args) {

        double valor;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o valor");
        valor = leitor.nextDouble();



        if (valor % 1 == 0) {

            System.out.println("Casas decimais não foram digitadas.");
        }else{
            System.out.println("Casas decimais foram digitadas.");
        }
        leitor.close();
    }



}
