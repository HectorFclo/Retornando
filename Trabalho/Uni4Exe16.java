package Trabalho;

/*
Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que a idade entre homens e mulheres sempre serão diferentes). 
Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais novo com a mulher mais velha.


Análise:
OK


Entradas:
ler(idadeMulher1)
ler(idadeMulher2)
ler(idadeHomem1)
ler(idadeHomem2)

Processo:
se (idadeMulher1 > idadeMulher2) -> mVelha = m1  mNova = m2
senao mVelha = m2  mNova = m1


se (idadeHomem1 > idadeHomem2) -> hVelho = h1  hNovo = h2
senao hVelho = h2  hNovo = h1


Somar(hVelho + mNova)
multiplicar (hNovo * mVelha)

Saídas:
imprimir soma Idade
imprimir multiplicação idade



*/
import java.util.Scanner;

public class Uni4Exe16 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int m1, m2, h1, h2, hVelho, hNovo, mVelha, mNova, somaIdade, produto;

        System.out.println("Informe a idade da mulher 1:");
        m1 = leitor.nextInt();
        System.out.println("Informe a idade da mulher 2:");
        m2 = leitor.nextInt();
        System.out.println("Informe a idade do homem 1:");
        h1 = leitor.nextInt();
        System.out.println("Informe a idade do homem 2:");
        h2 = leitor.nextInt();

        if (h1 > h2) {
            hVelho = h1;
            hNovo = h2;
        } else {
            hVelho = h2;
            hNovo = h1;
        }

        if (m1 > m2) {
            mVelha = m1;
            mNova = m2;
        } else {
            mVelha = m2;
            mNova = m1;
        }

        somaIdade = hVelho + mNova;
        produto = hNovo * mVelha;

        System.out.println("Soma (Homem mais velho + Mulher mais nova): " + somaIdade);
        System.out.println("Produto (Homem mais novo + Mulher mais velha): " + produto);

        leitor.close();
    }
}
