package br.com.senacrio.feiravirtual.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "empresa")
public class Empresa implements Serializable {

	private static final long serialVersionUID = -5389468643994078086L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empresa_id;

	@Column(name= "empresa_nome")
	private String empresa_nome;

	public int getEmpresa_id() {
		return empresa_id;
	}

	public void setEmpresa_id(int empresa_id) {
		this.empresa_id = empresa_id;
	}

	public String getEmpresa_nome() {
		return empresa_nome;
	}

	public void setEmpresa_nome(String empresa_nome) {
		this.empresa_nome = empresa_nome;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empresa_id;
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
		Empresa other = (Empresa) obj;
		if (empresa_id != other.empresa_id)
			return false;
		return true;
	}
}