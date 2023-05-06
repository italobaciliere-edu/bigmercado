package br.com.bigmercado.bigmercado.aplicacao;

import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        int op;
        do{
            showMenu();
            System.out.print("Informe a opção: ");
            op = sc.nextInt();

            if(op < 1 || op > 6)
                System.out.println("Opção inválida!");

            if(op == 1){
                realizarVendaEhEmitirCupomFiscal();
            }
        }while(op!=5);
        System.out.println("*** PROGRAMA FINALIZADO ***");
    }



    // UTILITARIOS
    private static final Scanner sc = new Scanner(System.in);
    private static void limpezaDoBuffer(){
        if(sc.hasNextLine()) sc.nextLine();
    }
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd//MM/yyyy");
    private static String getStringInput(){
        return "a";
    }
    private static int getIntInput(){
        int value;
        do{
            try {
                value = sc.nextInt();
            }catch (InputMismatchException e){
                value = 0;
                System.out.println("*** VALOR INVÁLIDO, INSIRA NOVAMENTE! ***");
            }
            limpezaDoBuffer();
        }while(value == 0);
        return value;
    }


    private static void showMenu(){
        StringBuilder menuLayout = new StringBuilder();
        menuLayout.append("MENU DE OPÇÕES\n");
        menuLayout.append("\n");
        menuLayout.append("1 - Realizar Venda, emitir cupom fiscal\n");
        menuLayout.append("2 - Calcular Salários Líquidos Dos Funcionários\n");
        menuLayout.append("3 - Verificar Bandeira do Cartão\n");
        menuLayout.append("4 - Sobre o Programa\n");
        menuLayout.append("5 - Sair");
        System.out.println(menuLayout);
    }


    private static void realizarVendaEhEmitirCupomFiscal(){

        System.out.print("\nNúmero da venda..: ");
        int numeroDaVenda = getIntInput();

        System.out.print("\nData da venda..: ");
        String dataDaVenda = sc.nextLine();

        int tipoPagamento;
        System.out.print("\nTipo Pagamento (1) DINHEIRO, (2) CHEQUE, (3) CREDITO, (4) DEBITO, (5) PIX: ");
        do{
            tipoPagamento = sc.nextInt();
            limpezaDoBuffer();
            if(tipoPagamento < 1 || tipoPagamento > 5){
                System.out.println("***VALOR INVÁLIDO***");
                System.out.print("Insira novamente: ");
            }
        }while(tipoPagamento < 1 || tipoPagamento > 5);


        System.out.print("\nProduto número: ");
        int produtoNumero = getIntInput();

        System.out.print("\nQuantidade: ");
        int quantidade = getIntInput();

        System.out.print("\nPreço unitário: ");
        int precoUnitario = getIntInput();

        System.out.print("\nNome do produto: ");
        String nomeProduto = sc.nextLine();

        System.out.println("\n");
        System.out.println("Novo item? Acione qualquer letra para sim ou \"n\" para [n]ão?");
    }
    private static void calcularSalarioLiquidoDosFuncionarios(){}
}
