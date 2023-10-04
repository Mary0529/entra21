package ClassesObjetos01;

public class Pessoa01 {

	public static void main(String[] args) {
		/*
		 * Em uma classe denominada Pessoa, deseja-se manter o nome, sexo, data de
		 * nascimento e estado civil de uma pessoa. O sexo deve ser definido como um
		 * caracter. A data deve ser definida como String.
		 * 
		 * Crie 2 objetos de Pessoa.
		 */

		Pessoa um = new Pessoa("Maria", 'F', "17/08/2006", "Namorando", 18);

		System.out.println(um.toString());

	}

}
