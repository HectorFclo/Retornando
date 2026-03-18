import java.util.Scanner;

public class Uni4Comp05 {
    
    /*
    Enunciado: Escreva um programa que valide um cupom de desconto em formato de texto. 
    Leia o nome do cupom digitado pelo usuário. Se o cupom for exatamente igual a "SOUFURB", 
    o programa deve exibir a mensagem: "Desconto de 15% aplicado com sucesso!".
    
    
    
    */

    public static void main(String[] args) {
        
        String cupom;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o tipo de cupom:");
        cupom = leitor.nextLine();

        if (cupom.equals ("SOUFURB")) {

            System.out.println("Desconto de 15% aplicado com sucesso!");

        }

        leitor.close();

    }
}
