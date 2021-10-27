package projeto_descricao_funcionarios;

public class Professor extends Funcionario {
	private int horasAula;
	private double salarioTotal;
	private double bonus;
	
	public Professor(String nome, double salario) {
		super(nome, salario);
		this.horasAula = 20;
		this.bonus = 20;
		//Salário total calculado
		this.salarioTotal = this.getSalario() + (this.getHorasAula() * this.getBonus());
	}
	
	//Getters and Setters
	public int getHorasAula() {
		return horasAula;
	}
	public void setHorasAula(int horasAula) {
		this.horasAula = horasAula;
	}

	public double getSalarioTotal() {
		return salarioTotal;
	}
	public void setSalarioTotal(double salarioTotal) {
		this.salarioTotal = salarioTotal;
	}

	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	

	@Override
	public String toString() {
		return "\tHoras de Aula: " + this.getHorasAula() + "\n\tSalário Total: R$ " + this.getSalarioTotal();
	}

}
