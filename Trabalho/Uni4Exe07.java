package Trabalho;

import java.util.Scanner;

public class Uni4Exe07 {
    
public static void main(String[] args) {
       
        double peso, valorPagar, pesoExcedido, qtdeAdicional;
 
        Scanner leitor = new Scanner(System.in);
 
        System.out.println("Informe o peso da carta:");
        peso = leitor.nextDouble();
 
        if (peso <= 50) {
            valorPagar = 0.45;
            System.out.println(valorPagar);
        }
        else {
            pesoExcedido = peso - 50;
            qtdeAdicional = (pesoExcedido / 20) + 1;
            valorPagar = 0.45 + (0.45 * qtdeAdicional);
            System.out.println("O custo do selo é: " + valorPagar);
        }
        leitor.close();
    }


}
