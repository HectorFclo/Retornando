import java.util.Scanner;

public class Uni4Comp02 {
    /*
     * Um sistema de monitoramento de TI verifica o status de um servidor através de
     * códigos numéricos.
     * O código 1 significa que o sistema está "OK". Escreva um algoritmo que leia
     * um número inteiro representando o status atual.
     * Se o status for diferente ('!=') de 1, o programa deve exibir o alerta:
     * "ATENÇÃO: Sistema operando com instabilidade!"
     * 
     * Entrada:
     * Ler(status)
     * 
     * 
     * Processa:
     * 
     * Se status !=1
     * print: "ATENÇÃO: Sistema operando com instabilidade!"
     * 
     * 
     * Saida:
     * imprimir(alerta)
     * 
     * 
     */

    public static void main(String[] args) {

        int status;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o status atual:");
        status = leitor.nextInt();

        if (status == 1) {

        } else {
            System.out.println("Sistema operando com instabilidade!");

        }

        leitor.close();
    }

}
