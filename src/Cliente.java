
public class Cliente {

	private String nome;
	private String cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf){
		if (validationCpf.isCPF(cpf)) {
			this.cpf = cpf;
		}
		else {
            throw new IllegalArgumentException("CPF inválido.");
        }
	}

	public String getCpf(){
		return cpf;
	}

	ValidationCpf validationCpf = new ValidationCpf();

	public ValidationCpf getValidationCpf() {
		return validationCpf;
	}

	public void setValidationCpf(ValidationCpf validationCpf) {
		this.validationCpf = validationCpf;
	}


}
