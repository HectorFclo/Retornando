package Trabalho;
/* Enunciado:
Dados dois valores inteiros, escreva um algoritmo que informe se eles são múltiplos ou não.

Análise:
OK

Entradas:
ler(valor1)
ler(valor2)

Processos:
se (valor1 % valor2 == 0 ou valor2 % valor1 == 0) então são múltiplos, senão não são múltiplos.

Saídas:
imprimir("Os valores são múltiplos.") ou imprimir("Os valores não são múltiplos.")
*/

import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Informe o primeiro valor:");
        valor1 = leitor.nextInt();

        System.out.println("Informe o segundo valor:");
        valor2 = leitor.nextInt();

        if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
            System.out.println("Os valores são múltiplos.");
        } else {
            System.out.println("Os valores não são múltiplos.");
        }

        leitor.close();
    }
}

/* * Valores de Testes:
 * * _ Caso 1 _
 * * valor1: 6
 * * valor2: 3
 * * saída: Os valores são múltiplos.
 * *
 * * _ Caso 2 _
 * * valor1: 9
 * * valor2: 4
 * * saída: Os valores não são múltiplos.
 * * * * _ Caso 3 _ (Invertido)
 * * valor1: 5
 * * valor2: 25
 * * saída: Os valores são múltiplos.
 */