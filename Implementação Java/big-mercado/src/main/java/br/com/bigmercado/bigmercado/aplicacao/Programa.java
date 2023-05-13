package br.com.bigmercado.bigmercado.aplicacao;

import br.com.bigmercado.bigmercado.entidades.ItemVenda;
import br.com.bigmercado.bigmercado.entidades.Venda;
import br.com.bigmercado.bigmercado.enumerados.StatusVenda;
import br.com.bigmercado.bigmercado.enumerados.TipoPagamento;
import br.com.bigmercado.bigmercado.utilitarios.Utilitarios;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Programa {

//    private int matricula;
//    private String nome;
//    private double salario;
//    private double proventos;
//    private double descontos;
//    private double comissao;

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

        Venda venda = new Venda();
        venda.setStatusVenda(StatusVenda.ABERTURA);

        //------------------------------------
        System.out.print("\nNúmero da venda..: " + venda.getNumero());
        //------------------------------------

        //------------------------------------
        System.out.print("\nData da venda..: ");
        ZonedDateTime brazilDateTime = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("America/Sao_Paulo"));
        System.out.println(utilitarios.formatadorDeData(brazilDateTime));
        // TODO - Usar a formatação apenas na exibição
        venda.setData(brazilDateTime);
        //------------------------------------

        //------------------------------------
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
        if(tipoPagamento == 1)
            venda.setTipoPagamento(TipoPagamento.DINHEIRO);
        if(tipoPagamento == 2)
            venda.setTipoPagamento(TipoPagamento.CHEQUE);
        if(tipoPagamento == 3)
            venda.setTipoPagamento(TipoPagamento.CREDITO);
        if(tipoPagamento == 4)
            venda.setTipoPagamento(TipoPagamento.DEBITO);
        if(tipoPagamento == 5)
            venda.setTipoPagamento(TipoPagamento.PIX);
        //------------------------------------

        venda.setStatusVenda(StatusVenda.INICIANDO);

        //------------------------------------
        String opcao;
        do{
            venda.setStatusVenda(StatusVenda.REGISTRANDO);
            ItemVenda item = new ItemVenda();

            System.out.print("\nProduto número: ");
            item.setNumero(utilitarios.getIntInput());

            System.out.print("Quantidade: ");
            item.setQuantidade(utilitarios.getIntInput());

            System.out.print("Preço unitário: ");
            item.setPrecoUnitario(utilitarios.getIntInput());

            System.out.print("Nome do produto: ");
            item.setNome(utilitarios.getStringInput());

            System.out.println("\n");
            System.out.println("Novo item? Acione qualquer letra para sim ou \"n\" para [n]ão?");
            opcao = utilitarios.getStringInput();

            venda.adicionarItem(item);
        }while(!opcao.equalsIgnoreCase("n"));
        //------------------------------------

        venda.setStatusVenda(StatusVenda.PROCESSANDO);
        System.out.println(venda);
    }
//    private static void calcularSalarioLiquidoDosFuncionarios(){}
}
