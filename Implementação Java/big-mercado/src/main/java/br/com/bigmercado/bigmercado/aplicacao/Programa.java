package br.com.bigmercado.bigmercado.aplicacao;

import br.com.bigmercado.bigmercado.entidades.ItemVenda;
import br.com.bigmercado.bigmercado.entidades.Venda;
import br.com.bigmercado.bigmercado.enumerados.StatusVenda;
import br.com.bigmercado.bigmercado.utilitarios.Utilitarios;

import java.util.ArrayList;

public class Programa {

    private int matricula;
    private String nome;
    private double salario;
    private double proventos;
    private double descontos;
    private double comissao;

    private static Utilitarios utilitarios = new Utilitarios();

    public static void main(String[] args) {
        int op;
        do{
            showMenu();
            System.out.print("Informe a opção: ");
            op = utilitarios.getIntInput();

            if(op < 1 || op > 6)
                System.out.println("Opção inválida!");

            if(op == 1){
                realizarVendaEhEmitirCupomFiscal();
            }
        }while(op!=5);
        System.out.println("*** PROGRAMA FINALIZADO ***");
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
        int numeroDaVenda = utilitarios.getIntInput();

        System.out.print("\nData da venda..: ");
        String dataDaVenda = utilitarios.getStringInput();

        // TODO refatorar para um método com parametro
        int tipoPagamento;
        System.out.print("\nTipo Pagamento (1) DINHEIRO, (2) CHEQUE, (3) CREDITO, (4) DEBITO, (5) PIX: ");
        do{
            tipoPagamento = utilitarios.getIntInput();
            if(tipoPagamento < 1 || tipoPagamento > 5){
                System.out.println("***VALOR INVÁLIDO***");
                System.out.print("Insira novamente: ");
            }
        }while(tipoPagamento < 1 || tipoPagamento > 5);

        Venda venda = new Venda();
        venda.setNumero(numeroDaVenda);

        // TODO transformar o campo para o tipo data. Usar a formatação apenas na exibição
        venda.setData(dataDaVenda);
        // TODO pesquisar a forma correta de utilizar o enum
        venda.setTipoPagamento(tipoPagamento);
        venda.setStatusVenda(StatusVenda.ABERTURA);

        ArrayList<ItemVenda> itens = new ArrayList<>();

        String opcao;
        do{
            System.out.print("\nProduto número: ");
            int produtoNumero = utilitarios.getIntInput();

            System.out.print("\nQuantidade: ");
            int quantidade = utilitarios.getIntInput();

            System.out.print("\nPreço unitário: ");
            int precoUnitario = utilitarios.getIntInput();

            System.out.print("\nNome do produto: ");
            String nomeProduto = utilitarios.getStringInput();

            System.out.println("\n");
            System.out.println("Novo item? Acione qualquer letra para sim ou \"n\" para [n]ão?");

        }while(true);

        // TODO definir a forma corretar de adicionar os itens. Será que da certo já instânciar com o objeto vazio
        venda.setItens(itens);

    }
    private static void calcularSalarioLiquidoDosFuncionarios(){}
}
