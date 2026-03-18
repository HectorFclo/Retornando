/*Enunciado: Uma loja virtual deseja dar um brinde para categorias específicas de clientes. 
Escreva um programa que leia um caractere representando o tipo de cupom ('S' para Especial, 'C' para Comum). 
Se o cupom for igual ('==') a 'S', o programa deve exibir a mensagem: "Cupom validado! 
Você ganhou um adesivo exclusivo." */
import java.util.Scanner;
public class Uni4Comp01 {
public static void main(String[] args) {
    char cupom;
    
    Scanner leitor = new Scanner(System.in);
cupom = leitor.next().charAt(0);

System.out.println("Informe o tipo de cupom:");


if (cupom == 'S'){

System.out.println("Cupom validado! Você ganhou um adesivo exclusivo.");

}if (cupom == 'C'){

    
}





}



}
