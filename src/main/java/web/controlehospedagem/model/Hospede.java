package web.controlehospedagem.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
//import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "hospede")
@DynamicUpdate
public class Hospede implements Serializable{
	
	private static final long serialVersionUID = 7562368353372595892L;
	@Id
	@SequenceGenerator(name="gerador", sequenceName="hospede_codigo_seq", allocationSize=1)
	@GeneratedValue(generator="gerador", strategy = GenerationType.SEQUENCE)
	private Long codigo;
	//@NotBlank(message = "O nome é obrigatório")
	private String nome;
	private String cpf;
	private String telefone;
	@Enumerated(EnumType.STRING)
	private Status status = Status.ATIVO;
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hospede other = (Hospede) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Hospede [codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", status="
				+ status + "]";
	}
	
}
