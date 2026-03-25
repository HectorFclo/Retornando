package Trabalho;

import java.util.Scanner;

public class Uni4Exe05 {
           public static void main(String[] args) {

        boolean cor;

        Scanner leitor = new Scanner(System.in);

        System.out.println("A cor é azul?");
        cor = leitor.nextBoolean();



        if (cor == true) {

            System.out.println("Sim.");
        }else{
            System.out.println("Não.");
        }
        leitor.close();
    }

}
