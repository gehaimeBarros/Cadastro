package cadastro.informacoes;

public class Pessoa extends Endereco {

	private String email;
	private String nome;
	private Object sexo;
	private int idade;

	Endereco endereco = new Endereco();

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Object getSexo() {
		return sexo;
	}

	public void setSexo(Object sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Pessoa)) {
			return false;
		}
		Pessoa other = (Pessoa) obj;
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (idade != other.idade) {
			return false;
		}
		if (nome == null) {
			if (other.nome != null) {
				return false;
			}
		} else if (!nome.equals(other.nome)) {
			return false;
		}
		if (sexo == null) {
			if (other.sexo != null) {
				return false;
			}
		} else if (!sexo.equals(other.sexo)) {
			return false;
		}
		return true;
	}

	public Pessoa(String email, String nome, Object sexo, int idade) {
		super();
		this.email = email;
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}

	public Pessoa() {
		super();
	}

	@Override
	public String toString() {
		return "\t\t\tInformação do Usuario\n\nE-mail: " + email + "\nNome: " + nome + "\nSexo: " + sexo + "\nIdade: "
				+ idade + " anos";
	}
}
