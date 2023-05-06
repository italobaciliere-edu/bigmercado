package br.com.bigmercado.bigmercado.entidades;

public class Caixa extends Funcionario{

    Caixa(int matricula, String nome, int salario){
        super(matricula, nome, salario);
    }

    public double calcularSalario(double proventos, double descontos){
       return this.salario + proventos - descontos;
    }

    @Override
    public String toString(){
        StringBuilder funcionarioToString = new StringBuilder();
        funcionarioToString.append("Matrícula: " + super.getMatricula() + "\n");
        funcionarioToString.append("Nome: " + super.getNome() + "\n");
        funcionarioToString.append("Salário base: " + super.getSalario() + "\n");
        funcionarioToString.append("Salário final: " + super.getSalario() + "\n");
        return funcionarioToString.toString();
    }
}
