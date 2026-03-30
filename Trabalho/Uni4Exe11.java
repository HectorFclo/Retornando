package Trabalho;
/* Enunciado:
Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escrever uma
mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS. Considere
que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente
dos demais, e apenas irmãos se todas as idades forem diferentes.

Análise:
OK

Entradas:
ler(ano1)
ler(ano2)
ler(ano3)

Processos:
se (ano1 == ano2 E ano1 == ano3) -> TRIGÊMEOS
senao se (ano1 == ano2 OU ano1 == ano3 OU ano2 == ano3) -> GÊMEOS
senao -> APENAS IRMÃOS

Saídas:
imprimir a classificação dos irmãos
*/

import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int ano1, ano2, ano3;

        System.out.println("Ano de nascimento do irmão 1:");
        ano1 = leitor.nextInt();

        System.out.println("Ano de nascimento do irmão 2:");
        ano2 = leitor.nextInt();

        System.out.println("Ano de nascimento do irmão 3:");
        ano3 = leitor.nextInt();

        // Verifica primeiro se os 3 são iguais (Trigêmeos)
        if (ano1 == ano2 && ano1 == ano3) {
            System.out.println("TRIGÊMEOS");
        } 
        // Se não são trigêmeos, verifica se pelo menos 2 são iguais (Gêmeos)
        else if (ano1 == ano2 || ano1 == ano3 || ano2 == ano3) {
            System.out.println("GÊMEOS");
        } 
        // Se não caiu em nenhum dos casos acima, todos são diferentes
        else {
            System.out.println("APENAS IRMÃOS");
        }

        leitor.close();
    }
}

/* * Valores de Testes:
 * * _ Caso 1 _
 * * ano1: 10
 * * ano2: 10
 * * ano3: 5
 * * saída: GÊMEOS
 * *
 * * _ Caso 2 _
 * * ano1: 16
 * * ano2: 16
 * * ano3: 16
 * * saída: TRIGÊMEOS
 * *
 * * _ Caso 3 _
 * * ano1: 10
 * * ano2: 21
 * * ano3: 16
 * * saída: APENAS IRMÃOS
 */