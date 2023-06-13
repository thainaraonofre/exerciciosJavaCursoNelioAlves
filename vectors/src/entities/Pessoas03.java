package entities;

public class Pessoas03 {
	
	private String name;
	private int idade;
	private double altura;
	
	public Pessoas03() {
	
	}
	
	public Pessoas03(String name, int idade, double altura) {
		this.name = name;
		this.idade = idade;
		this.altura = altura;
	}


	public String getName() {
		return name;
	}

	
	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calculaMediaAltura(double altura, int quantidadePessoas) {
		return altura / quantidadePessoas;
	}

    public double mediaPessoasMenosDeDezesseis(Pessoas03[] pessoa, int quantidadePessoa) {
    	int menoresQueDezesseis = 0;
    	
    	for (int i = 0; i < quantidadePessoa; i++) {
			if (pessoa[i].idade < 16) {
				menoresQueDezesseis++;
			}
		}
    	
    	double totalMenorQueDezesseis = quantidadePessoa * 100 / menoresQueDezesseis;
    	
		return totalMenorQueDezesseis;
    }
	
}
