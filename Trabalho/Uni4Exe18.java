package Trabalho;

import java.util.Scanner;

public class Uni4Exe18 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int diaVencimento, diaPagamento;
        double valorConta;

        System.out.println("Informe o dia do vencimento:");
        diaVencimento = leitor.nextInt();
        System.out.println("Informe o dia do pagamento:");
        diaPagamento = leitor.nextInt();
        System.out.println("Informe o valor da prestação:");
        valorConta = leitor.nextInt();

        if (diaPagamento > diaVencimento && diaVencimento >= 10) {

            valorConta += valorConta * ((0.02) * (diaPagamento - diaVencimento));

            System.out.println(
                    "O pagamento está atrasado. Multa de 2% por dia de atraso. Valor da prestação = R$ " + valorConta);
        }

        else if (diaPagamento > diaVencimento && diaVencimento <= 5) {

            System.out.println(
                    "O pagamento está atrasado. Porém dentro de 5 dias. Valor da prestação = R$ " + valorConta);

        } else if (diaPagamento <= diaVencimento) {

            valorConta -= valorConta * 0.1;

            System.out.println("O pagamento está em dia. O valor da prestação = R$" + valorConta);
        }
        leitor.close();
    }

}
