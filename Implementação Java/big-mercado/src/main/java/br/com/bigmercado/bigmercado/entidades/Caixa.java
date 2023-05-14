package br.com.bigmercado.bigmercado.entidades;

public class Caixa extends Funcionario{


    private double proventos;
    private double descontos;



    public double getProventos() {
        return proventos;
    }
    public void setProventos(double proventos) {
        this.proventos = proventos;
    }

    public double getDescontos() {
        return descontos;
    }
    public void setDescontos(double descontos) {
        this.descontos = descontos;
    }



    public Caixa(int matricula, String nome, int salario){
        super(matricula, nome, salario);
    }

    private double calcularSalario(double proventos, double descontos){
       return this.salario + proventos - descontos;
    }

    @Override
    public String toString(){
        StringBuilder funcionarioToString = new StringBuilder();
        funcionarioToString.append("Matrícula: " + super.getMatricula() + "\n");
        funcionarioToString.append("Nome: " + super.getNome() + "\n");
        funcionarioToString.append("Salário base: " + super.getSalario() + "\n");
        funcionarioToString.append("Salário final: " + this.calcularSalario(this.proventos, this.descontos) + "\n");
        return funcionarioToString.toString();
    }
}
