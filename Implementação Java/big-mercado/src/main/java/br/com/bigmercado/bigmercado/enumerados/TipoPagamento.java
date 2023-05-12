package br.com.bigmercado.bigmercado.enumerados;

public enum TipoPagamento {
    DINHEIRO(1),
    CHEQUE(2),
    CREDITO(3),
    DEBITO(4),
    PIX(5);

    private final int tipo;

    TipoPagamento(int tipo) {
        this.tipo = tipo;
    }
}
