import java.util.Scanner;

public class Uni4Comp03 {
    /*
     * Uma transportadora utiliza uma esteira de separação rápida para pacotes
     * leves, visando agilizar a logística.
     * Escreva um algoritmo que leia o peso de uma caixa (em kg).
     * Se o peso for menor ('<') que 2.5 kg, o programa deve informar:
     * "Encaminhar para a Esteira Rápida (Pacote Leve)".
     * 
     * 
     * Entrada:
     * 
     * ler(peso)
     * 
     * Processa:
     * 
     * Se peso for menor que 2.5kg informar:
     * "Encaminhar para a Esteira Rápida (Pacote Leve)"
     * 
     * 
     * Saida(Esteira)
     * 
     */

    public static void main(String[] args) {

        double peso;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o peso:");
        peso = leitor.nextDouble();

        if (peso < 2.5) {

            System.out.print("Encaminhar para a Esteira Rápida (Pacote Leve)");
        } else {

        }
        leitor.close();

    }
}
