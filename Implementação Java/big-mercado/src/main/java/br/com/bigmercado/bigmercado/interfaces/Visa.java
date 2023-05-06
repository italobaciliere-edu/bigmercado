package br.com.bigmercado.bigmercado.interfaces;

public class Visa implements iBandeiraCartao {

    private int setor;

    public void setSetor(int setor){
        this.setor = setor;
    }
    public int getSetor(){
        return this.setor;
    }

    @Override
    public String verificarBandeira(int setor) {
        return (setor == 4)?
            ">> BANDEIRA CONFERE VISA" : "*** BANDEIRA INVÁLIDA PARA VISA ***";
    }
}
