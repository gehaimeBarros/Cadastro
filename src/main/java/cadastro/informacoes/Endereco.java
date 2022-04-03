package cadastro.informacoes;

public class Endereco {

	private String rua;
	private String bairro;
	private String estado;
	private int numeroRecidencial;

	/**
	 * @return the rua
	 */
	public String getRua() {
		return rua;
	}

	/**
	 * @param rua the rua to set
	 */
	public void setRua(String rua) {
		this.rua = rua;
	}

	/**
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the numeroRecidencial
	 */
	public int getNumeroRecidencial() {
		return numeroRecidencial;
	}

	/**
	 * @param numeroRecidencial the numeroRecidencial to set
	 */
	public void setNumeroRecidencial(int numeroRecidencial) {
		this.numeroRecidencial = numeroRecidencial;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + numeroRecidencial;
		result = prime * result + ((rua == null) ? 0 : rua.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Endereco)) {
			return false;
		}
		Endereco other = (Endereco) obj;
		if (bairro == null) {
			if (other.bairro != null) {
				return false;
			}
		} else if (!bairro.equals(other.bairro)) {
			return false;
		}
		if (estado == null) {
			if (other.estado != null) {
				return false;
			}
		} else if (!estado.equals(other.estado)) {
			return false;
		}
		if (numeroRecidencial != other.numeroRecidencial) {
			return false;
		}
		if (rua == null) {
			if (other.rua != null) {
				return false;
			}
		} else if (!rua.equals(other.rua)) {
			return false;
		}
		return true;
	}

	public Endereco(String rua, String bairro, String estado, int numeroRecidencial) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.estado = estado;
		this.numeroRecidencial = numeroRecidencial;
	}

	public Endereco() {
		super();
	}

	@Override
	public String toString() {
		return "\n\n\t\t\tEndereço\nRua: " + rua + "\nBairro: " + bairro + "\nEstado: " + estado + "\nNumero: "
				+ numeroRecidencial + "\n\n";
	}

}
