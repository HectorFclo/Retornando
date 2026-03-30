package Trabalho;

/* Enunciado:
Dado uma letra, escreva um algoritmo que informe se ela é ou não uma vogal.

Análise:
OK

Entradas:
ler(letra)

Processos:
converter a letra para minúsculo para facilitar a validação.
se (letra == 'a' ou 'e' ou 'i' ou 'o' ou 'u') então é vogal, senão não é vogal.

Saídas:
imprimir("É vogal") ou imprimir("NÃO é vogal")
*/

import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a letra: ");
        char letra = leitor.next().toLowerCase().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("É vogal");
        } else {
            System.out.println("NÃO é vogal");
        }

        leitor.close();
    }
}

/* * Valores de Testes:
 * * _ Caso 1 _
 * * letra: u
 * * saída: É vogal
 * *
 * * _ Caso 2 _
 * * letra: M
 * * saída: NÃO é vogal
 * *
 * * _ Caso 3 _
 * * letra: A
 * * saída: É vogal
 */