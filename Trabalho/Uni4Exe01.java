package Trabalho;

import java.util.Scanner;

/*
A jornada de trabalho semanal de um funcionário é de 40 horas. 
O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o valor por hora e escreva o salário total do funcionário, 
que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).

     * Entrada:
     * Ler(horas, valor por hora)
     * 
     * 
     * Processa:
     * 
     * Se horas > 40 acrescimo de 50% no valor da hora
     * 
     * 
     * Saida:
     * imprimir(salario)


*/

public class Uni4Exe01 {

    public static void main(String[] args) {
        
        double salario, valor, horas, acrescimo;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe quantas horas");
        horas = leitor.nextDouble();

        System.out.println("Informe valor da hora");
        valor = leitor.nextDouble();

        salario = horas * valor;
        if (horas > 160) {

            acrescimo = (horas - 160) * (valor * 0.5);

            salario = salario + acrescimo;

            System.out.print("O salário total é: " + salario);
        }
        leitor.close();
    }
}
