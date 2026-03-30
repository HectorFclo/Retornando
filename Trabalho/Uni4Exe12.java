/* Enunciado:
Dados 3 valores lado1, lado2, lado3, que representam os comprimentos dos lados de um
triângulo, descreva um algoritmo que verifique se os mesmos podem ser os comprimentos
dos lados de um triângulo. Em caso afirmativo, verifique e informe se é
"triângulo equilátero", "triângulo isósceles" ou "triângulo escaleno". Em caso negativo,
informe que os mesmos não formam um triângulo.

Análise:
OK

Entradas:
ler(lado1)
ler(lado2)
ler(lado3)

Processos:
se (lado1 < lado2 + lado3 E lado2 < lado1 + lado3 E lado3 < lado1 + lado2) então
    se (lado1 == lado2 E lado1 == lado3) -> triângulo equilátero
    senao se (lado1 == lado2 OU lado1 == lado3 OU lado2 == lado3) -> triângulo isósceles
    senao -> triângulo escaleno
senao
    não formam um triângulo

Saídas:
imprimir o tipo do triângulo ou a mensagem de erro
*/

import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double lado1, lado2, lado3;

        System.out.println("Entre com o comprimento do lado 1:");
        lado1 = leitor.nextDouble();

        System.out.println("Entre com o comprimento do lado 2:");
        lado2 = leitor.nextDouble();

        System.out.println("Entre com o comprimento do lado 3:");
        lado3 = leitor.nextDouble();

        // Primeira validação: Verifica se as medidas formam um triângulo
        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
            
            // Se formam um triângulo, verifica qual é o tipo
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("triângulo equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("triângulo isósceles");
            } else {
                System.out.println("triângulo escaleno");
            }
            
        } else {
            // Se não passou na primeira validação
            System.out.println("não formam um triângulo");
        }

        leitor.close();
    }
}

/* * Valores de Testes:
 * * _ Caso 1 _
 * * lado1: 3
 * * lado2: 4
 * * lado3: 5
 * * saída: triângulo escaleno
 * *
 * * _ Caso 2 _
 * * lado1: 10
 * * lado2: 10
 * * lado3: 10
 * * saída: triângulo equilátero
 * *
 * * _ Caso 3 _
 * * lado1: 1
 * * lado2: 4
 * * lado3: 10
 * * saída: não formam um triângulo
 */