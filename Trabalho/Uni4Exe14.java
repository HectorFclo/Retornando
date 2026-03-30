/* Enunciado:
Leia uma data e determine se ela é válida. Ou seja, verifique se o mês está entre
1 e 12, e se o dia existe naquele mês. Note que fevereiro tem 29 dias em anos bissextos,
e 28 dias em anos não bissextos.

Análise:
OK

Entradas:
ler(dia)
ler(mes)
ler(ano)

Processos:
Validar se os valores base são minimamente reais (dia > 0, mes < 13, ano > 0).
Validar os meses com 31 dias.
Validar os meses com 30 dias.
Validar fevereiro (com 28 dias).
Validar o ano bissexto para liberar o dia 29 de fevereiro.

Saídas:
imprimir "Valida" ou "Nao valida"
*/

import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int dia, mes, ano;

        System.out.println("Digite o dia: ");
        dia = leitor.nextInt();

        System.out.println("Digite o mes: ");
        mes = leitor.nextInt();

        System.out.println("Digite o ano: ");
        ano = leitor.nextInt();

        // Primeira grande peneira: descarta números impossíveis (ex: dia 35, mês -2, ano 0)
        if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0) {
            
            // Meses com 31 dias
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                System.out.println("Valida");
            } 
            // Meses com 30 dias (mes != 2 garante que não é fevereiro)
            else if (mes != 2 && dia < 31) {
                System.out.println("Valida");
            } 
            // Fevereiro em ano normal (até 28 dias)
            else if (mes == 2 && dia < 29) {
                System.out.println("Valida");
            } 
            // Validação final: Dia 29 de fevereiro em ano bissexto
            else if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)) {
                System.out.println("Valida");
            } 
            // Se não encaixou em nenhuma das regras de meses válidos
            else {
                System.out.println("Nao valida");
            }
            
        } else {
            // Se não passou nem na primeira peneira
            System.out.println("Nao valida");
        }

        leitor.close();
    }
}

/* * Valores de Testes:
 * * _ Caso 1 _
 * * data: 29 2 2024
 * * saída: Valida (2024 é bissexto)
 * *
 * * _ Caso 2 _
 * * data: 29 2 2023
 * * saída: Nao valida (2023 não é bissexto)
 * *
 * * _ Caso 3 _
 * * data: 31 4 2026
 * * saída: Nao valida (Abril só tem 30 dias)
 * *
 * * _ Caso 4 _
 * * data: 15 8 2026
 * * saída: Valida
 */