package br.com.bigmercado.bigmercado.entidades;

public class ItemVenda {


    // PROPRERTIES
    private int numero;
    private String nome;
    private int quantidade;
    private double precoUnitario;


    // CONSTRUCTORS
    public ItemVenda(){}
    ItemVenda(int numero, String nome, int quantidade, double precoUnitario){
        this.numero = numero;
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }


    // GETTERS AND SETTERS
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }


    // UTILS
    public double subTotal() {
        return this.precoUnitario * this.quantidade;
    }

    @Override
    public String toString(){
        StringBuilder toString = new StringBuilder();
        toString.append("Numero:" + this.numero + "\n");
        toString.append("Nome:" + this.nome + "\n");
        toString.append("Preço Unitário:" + this.precoUnitario + "\n");
        toString.append("Quantidade:" + this.quantidade + "\n");
        toString.append("Subtotal:" + this.subTotal() + "\n");
        return toString.toString();
    }
}
