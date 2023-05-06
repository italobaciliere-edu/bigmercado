package br.com.bigmercado.bigmercado.interfaces;

public class MasterCard implements iBandeiraCartao {

    private String setor;

    public void setSetor(String setor) {
        this.setor = setor;
    }
    public String getSetor() {
        return setor;
    }

    @Override
    public String verificarBandeira(int setor) {
        return (setor == 51 || setor == 52 || setor == 53 || setor == 54 || setor == 55)?
                ">> BANDEIRA CONFERE PARA MASTERCARD" : "*** BANDEIRA INVÁLIDA MASTERCARD***";
    }
}
