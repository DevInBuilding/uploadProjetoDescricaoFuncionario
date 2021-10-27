package projeto_descricao_funcionarios;

public class Funcionario {
	private String nome;
	private double salario;
	
	//Constructor Method
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	//Getters and Setters added
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString(){
		return "Funcionário >>" + "\n\tNome: " + this.nome + "\n\tSalário: R$ " + this.salario;
	}
}