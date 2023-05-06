package br.com.bigmercado.bigmercado.entidades;

import br.com.bigmercado.bigmercado.enumerados.StatusVenda;
import br.com.bigmercado.bigmercado.enumerados.TipoPagamento;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Venda {

    private int numero;
    private Date data;
    private TipoPagamento tipoPagamento;
    private StatusVenda statusVenda;
    private ArrayList<ItemVenda> itens;


    // construtores
    public Venda(){}

    public Venda(int numero, Date data, TipoPagamento tipoPagamento,
                 StatusVenda statusVenda, ArrayList<ItemVenda> itens){
        this.numero = numero;
        this.tipoPagamento = tipoPagamento;
        this.statusVenda = statusVenda;
        this.itens = itens;
    }


    // getters and setters
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
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
    public void setItens(ArrayList<ItemVenda> itens) {
        this.itens = itens;
    }


    // utilitarios
    public void adicionarItem(ItemVenda itemVenda){
        this.itens.add(itemVenda);
    }

    public void removerItem(ItemVenda itemVenda){
        this.itens.remove(itemVenda);
    }

    public double total(){
        double calcularTotal = 0.0;
        for (ItemVenda item: itens) {
            calcularTotal += item.subTotal();
        }
        return calcularTotal;
    }

    public void abrirCaixa(int m, Date d, double v){

    }

    private Date formatDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return null;
    }


    // default
    @Override
    public String toString(){
        return null; // implementar igual o layout
    }
}
