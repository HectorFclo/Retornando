package Trabalho;
/* Enunciado:
Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um algoritmo para ler
as idades dos filhos e exibir quem é o caçula da família; suponha que não haja empates.

Análise:
OK

Entradas:
ler(idadeMarquinhos)
ler(idadeZezinho)
ler(idadeLuluzinha)

Processos:
Verificar qual das idades é a menor usando comparações lógicas (&&).
se (idadeMarquinhos < idadeZezinho E idadeMarquinhos < idadeLuluzinha) -> Marquinhos é caçula
senao se (idadeZezinho < idadeMarquinhos E idadeZezinho < idadeLuluzinha) -> Zezinho é caçula
senao -> Luluzinha é caçula

Saídas:
imprimir quem é o caçula
*/

import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int idadeMarquinhos, idadeZezinho, idadeLuluzinha;

        System.out.println("Idade de Marquinhos:");
        idadeMarquinhos = leitor.nextInt();

        System.out.println("Idade de Zezinho:");
        idadeZezinho = leitor.nextInt();

        System.out.println("Idade de Luluzinha:");
        idadeLuluzinha = leitor.nextInt();

        if (idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha) {
            System.out.println("O Marquinhos é o caçula.");
        } else if (idadeZezinho < idadeMarquinhos && idadeZezinho < idadeLuluzinha) {
            System.out.println("O Zezinho é o caçula.");
        } else {
            System.out.println("A Luluzinha é a caçula."); 
        }

        leitor.close();
    }
}

/* * Valores de Testes:
 * * _ Caso 1 _
 * * idadeMarquinhos: 15
 * * idadeZezinho: 11
 * * idadeLuluzinha: 18
 * * saída: O Zezinho é o caçula.
 * *
 * * _ Caso 2 _
 * * idadeMarquinhos: 5
 * * idadeZezinho: 8
 * * idadeLuluzinha: 12
 * * saída: O Marquinhos é o caçula.
 * *
 * * _ Caso 3 _
 * * idadeMarquinhos: 22
 * * idadeZezinho: 20
 * * idadeLuluzinha: 19
 * * saída: A Luluzinha é a caçula.
 */