/* Enunciado:
Elabore um algoritmo para exibir o valor de reajuste que um funcionário receberá no seu salário.
A empresa irá conceder 5% de reajuste para o funcionário que for admitido há até de 12 meses.
Para funcionário admitido entre 13 e 48 meses, irá conceder 7% de reajuste. O seu algoritmo deve
solicitar ao usuário que digite a quantidade de meses que o funcionário foi admitido.

Análise:
OK

Entradas:
ler(meses)

Processos:
se (meses <= 12) -> 5%
senao se (meses >= 13 E meses <= 48) -> 7%
senao -> não informado

Saídas:
imprimir a mensagem com o reajuste correspondente
*/

import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int meses;

        System.out.println("Digite a quantidade de meses que o funcionário foi admitido:");
        meses = leitor.nextInt();

        if (meses <= 12) {
            System.out.println("O funcionário irá receber 5% de reajuste");
        } else if (meses >= 13 && meses <= 48) {
            System.out.println("O funcionário irá receber 7% de reajuste");
        } else {
            System.out.println("Reajuste não informado");
        }

        leitor.close();
    }
}

/* * Valores de Testes:
 * * _ Caso 1 _
 * * meses: 10
 * * saída: O funcionário irá receber 5% de reajuste
 * *
 * * _ Caso 2 _
 * * meses: 45
 * * saída: O funcionário irá receber 7% de reajuste
 * *
 * * _ Caso 3 _
 * * meses: 52
 * * saída: Reajuste não informado
 */