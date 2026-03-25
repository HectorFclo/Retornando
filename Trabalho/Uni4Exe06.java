package Trabalho;

import java.util.Scanner;

public class Uni4Exe06 {

    public static void main(String[] args) {

        char letra;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o caracter");
        letra = leitor.next().charAt(0);

        if (letra == 'M') {

            System.out.println("Masculino.");
        }

        else if (letra == 'F') {
            System.out.println("Feminino");
        } else if (letra == 'I') {
            System.out.println("Não informado");
        } else {
            System.out.println("entrada incorreta");

        }

        leitor.close();
    }

}
