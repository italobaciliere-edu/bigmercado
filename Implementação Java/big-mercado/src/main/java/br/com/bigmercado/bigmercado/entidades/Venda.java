package br.com.bigmercado.bigmercado.entidades;

import br.com.bigmercado.bigmercado.enumerados.StatusVenda;
import br.com.bigmercado.bigmercado.enumerados.TipoPagamento;
import br.com.bigmercado.bigmercado.utilitarios.Utilitarios;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Venda {


    private static int numeroPedido = 0;
    private ZonedDateTime data;
    private TipoPagamento tipoPagamento;
    private StatusVenda statusVenda;
    private ArrayList<ItemVenda> itens;


    // construtores
    public Venda(){
        this.numeroPedido++;
        this.itens = new ArrayList<>();
    }


    public Venda(ZonedDateTime data, TipoPagamento tipoPagamento,
                 StatusVenda statusVenda){
        super();
        this.data = data;
        this.tipoPagamento = tipoPagamento;
        this.statusVenda = statusVenda;
    }


    // getters and setters
    public int getNumero() {
        return this.numeroPedido;
    }

    public ZonedDateTime getData() {
        return data;
    }
    public void setData(ZonedDateTime data) {
        this.data = data;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }
    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public StatusVenda getStatusVenda() {
        return statusVenda;
    }
    public void setStatusVenda(StatusVenda statusVenda) {
        this.statusVenda = statusVenda;
    }

    public ArrayList<ItemVenda> getItens() {
        return itens;
    }

    // utilitarios
    public void adicionarItem(ItemVenda itemVenda){
        this.itens.add(itemVenda);
    }

    public void removerItem(ItemVenda itemVenda){
        this.itens.remove(itemVenda);
    }


    public double total(){
        // TODO testar
        double total = 0;
        for (ItemVenda item: itens) {
            total += item.subTotal();
        }
        return total;
    }


    public String listarItens(){
        StringBuilder listaItens = new StringBuilder();
        for (ItemVenda item: itens) {
            listaItens.append("\n");
            listaItens.append("-"); // número do pedido vai ser inserido pela class venda
            listaItens.append(" " + item.getNome());
            listaItens.append(" R$ " + item.getPrecoUnitario());
            listaItens.append(" x " + item.getQuantidade());
            listaItens.append("  =  R$" + (item.getPrecoUnitario() * item.getQuantidade()));
        }
        return listaItens.toString();
    }


    public void abrirCaixa(int m, Date d, double v){

    }


    @Override
    public String toString(){
        StringBuilder notaFiscal = new StringBuilder();
        this.statusVenda = StatusVenda.valueOf("IMPRIMINDO");
        String linhaDupla = "================================";
        notaFiscal.append("\n"+linhaDupla);
        notaFiscal.append("\nBIG MERCADOS DO BAIRRO LTDA");
        notaFiscal.append("\nDADOS DA VENDA:");
        notaFiscal.append("\n"+linhaDupla);
        notaFiscal.append("\nData do pedido: " + new Utilitarios().formatadorDeData(this.data));
        notaFiscal.append("\nStatus do pedido: " + String.valueOf(this.statusVenda));
        notaFiscal.append("\nTipo do pagamento: " + String.valueOf(this.tipoPagamento));
        notaFiscal.append("\nLocal de Entrega: Conforme Info NFE");
        notaFiscal.append("\n"+linhaDupla);
        notaFiscal.append("\nITENS DA VENDA");
        notaFiscal.append("\n"+linhaDupla);
        notaFiscal.append("\n" + this.listarItens());
        notaFiscal.append("\n--------------------------------");
        notaFiscal.append("\nTotal da Venda..........: R$ " + this.total());
        notaFiscal.append("\n\n");
        return notaFiscal.toString();
    }
}
