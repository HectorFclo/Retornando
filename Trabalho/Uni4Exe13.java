package Trabalho;
/* Enunciado:
Escreva um algoritmo que obtém do usuário 3 valores inteiros representando as três
cartas deste usuário em uma mão de jogo de truco. O algoritmo deve imprimir na tela
a palavra "TRUCO" (se APENAS UMA for AS, 2 ou 3), "SEIS" (se APENAS DUAS forem AS, 2 ou 3) ou 
"NOVE" (se AS TRÊS forem AS, 2 ou 3). Se não houver, não é impresso nada.

Análise:
OK

Entradas:
ler(carta1)
ler(carta2)
ler(carta3)

Processos:
qtCartasBoas = 0
se (carta1 == 1 OU carta1 == 2 OU carta1 == 3) -> qtCartasBoas++
se (carta2 == 1 OU carta2 == 2 OU carta2 == 3) -> qtCartasBoas++
se (carta3 == 1 OU carta3 == 2 OU carta3 == 3) -> qtCartasBoas++

se qtCartasBoas == 1 -> TRUCO
senao se qtCartasBoas == 2 -> SEIS
senao se qtCartasBoas == 3 -> NOVE

Saídas:
imprimir(TRUCO, SEIS ou NOVE)
*/

import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int carta1, carta2, carta3;
        int qtCartasBoas = 0; // Nosso contador começa zerado

        System.out.println("Informe as 3 cartas: ");
        carta1 = leitor.nextInt();
        carta2 = leitor.nextInt();
        carta3 = leitor.nextInt();

        // Avalia a primeira carta
        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
            qtCartasBoas++; // Isso é a mesma coisa que qtCartasBoas = qtCartasBoas + 1
        }
        
        // Avalia a segunda carta (veja que são IFs independentes, e não else/if)
        if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            qtCartasBoas++;
        }
        
        // Avalia a terceira carta
        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            qtCartasBoas++;
        }

        // Avalia o resultado final do contador
        if (qtCartasBoas == 1) {
            System.out.println("TRUCO");
        } else if (qtCartasBoas == 2) {
            System.out.println("SEIS");
        } else if (qtCartasBoas == 3) {
            System.out.println("NOVE");
        }
        // Se qtCartasBoas for 0, ele simplesmente pula tudo e não imprime nada, como o exercício pediu.

        leitor.close();
    }
}

/* * Valores de Testes:
 * * _ Caso 1 _
 * * cartas: 10 11 12
 * * saída: (não imprime nada)
 * *
 * * _ Caso 2 _
 * * cartas: 1 12 7
 * * saída: TRUCO
 * *
 * * _ Caso 3 _
 * * cartas: 3 2 13
 * * saída: SEIS
 * *
 * * _ Caso 4 _
 * * cartas: 1 2 3
 * * saída: NOVE
 */