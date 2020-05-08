package br.com.senacrio.feiravirtual.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="stand")
public class Stand implements Serializable {

	private static final long serialVersionUID = -6468767406858064279L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stand_id;

	private String stand_nome;

	private String stand_link_apresentacao;

	private String stand_link_chat;

	private String stand_status;

	private String stand_link_logomarca;

	@OneToOne
	@JoinColumn(name = "empresa_id")
	private Empresa empresa;

	public Stand() {
		super();
	}

	public Stand(int stand_id, String stand_nome, String stand_link_apresentacao, String stand_link_chat,
			String stand_status, String stand_link_logomarca, Empresa empresa) {
		super();
		this.stand_id = stand_id;
		this.stand_nome = stand_nome;
		this.stand_link_apresentacao = stand_link_apresentacao;
		this.stand_link_chat = stand_link_chat;
		this.stand_status = stand_status;
		this.stand_link_logomarca = stand_link_logomarca;
		this.empresa = empresa;
	}

	public int getStand_id() {
		return stand_id;
	}

	public void setStand_id(int stand_id) {
		this.stand_id = stand_id;
	}

	public String getStand_nome() {
		return stand_nome;
	}

	public void setStand_nome(String stand_nome) {
		this.stand_nome = stand_nome;
	}

	public String getStand_link_apresentacao() {
		return stand_link_apresentacao;
	}

	public void setStand_link_apresentacao(String stand_link_apresentacao) {
		this.stand_link_apresentacao = stand_link_apresentacao;
	}

	public String getStand_link_chat() {
		return stand_link_chat;
	}

	public void setStand_link_chat(String stand_link_chat) {
		this.stand_link_chat = stand_link_chat;
	}

	public String getStand_status() {
		return stand_status;
	}

	public void setStand_status(String stand_status) {
		this.stand_status = stand_status;
	}

	public String getStand_link_logomarca() {
		return stand_link_logomarca;
	}

	public void setStand_link_logomarca(String stand_link_logomarca) {

		this.stand_link_logomarca = stand_link_logomarca;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + stand_id;
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
		Stand other = (Stand) obj;
		if (stand_id != other.stand_id)
			return false;
		return true;
	}
	
	

}
