package br.com.bigmercado.bigmercado.enumerados;

public enum TipoPagamento {
    DINHEIRO(1, "Dinheiro"),
    CHEQUE(2, "Cheque"),
    CREDITO(3, "Crédito"),
    DEBITO(4, "Débito"),
    PIX(5, "Pix");

    private final int tipo;
    private final String nome;

    TipoPagamento(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    // TODO pesquisar a forma correta de utilizar o enum

}
