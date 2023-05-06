package br.com.bigmercado.bigmercado.entidades;

public class Gerente extends Funcionario{
    public Gerente(int matricula, String nome, int salario) {
        super(matricula, nome, salario);
    }

    public double calcularSalario(double proventos, double descontos){
        return this.salario + proventos - descontos;
    }

    public void encerrarCaixa(){

    }

    @Override
    public String toString(){
        return "";
        // FALTA FAZER LAYOUT
    }
}
