package ClassesObjetos01;

public class Pessoa {

	private String nome;
	private char sexo;
	private String data;
	private String estadoCivil;
	private int idade;

	public Pessoa(String nome, char sexo, String data, String estadoCivil, int idade) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.data = data;
		this.estadoCivil = estadoCivil;
		this.idade = idade;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade < 0) {
			System.out.println("Numero Invalido");
		} else {
			this.idade = idade;
		}
	}

	@Override
	public String toString() {
		return "O nome da pessoa é " + this.getNome() + " Seu sexo é " + this.getSexo() + " Sua data de nascimento é "
				+ getData() + " Seu estado civil é " + this.getEstadoCivil() + " E sua idade é " + this.getIdade();
	}
}
