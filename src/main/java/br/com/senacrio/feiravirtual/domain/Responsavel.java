package br.com.senacrio.feiravirtual.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "responsavel")
public class Responsavel implements Serializable {

	private static final long serialVersionUID = 5016484405218022225L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int responsavel_id;

	private String nome_completo;

	private int responsavel_status;

	@OneToOne
	@JoinColumn(name = "empresa_id")
	private Empresa empresa;

	private String responsavel_usuario;

	private String responavel_senha;

	private String responsavel_email;

	private String responsavel_telefone;

	public Responsavel() {
		super();
	}

	public Responsavel(int responsavel_id, String nome_completo, int responsavel_status, Empresa empresa,
			String responsavel_usuario, String responavel_senha, String responsavel_email,
			String responsavel_telefone) {
		super();
		this.responsavel_id = responsavel_id;
		this.nome_completo = nome_completo;
		this.responsavel_status = responsavel_status;
		this.empresa = empresa;
		this.responsavel_usuario = responsavel_usuario;
		this.responavel_senha = responavel_senha;
		this.responsavel_email = responsavel_email;
		this.responsavel_telefone = responsavel_telefone;
	}

	public int getResponsavel_id() {
		return responsavel_id;
	}

	public void setResponsavel_id(int responsavel_id) {
		this.responsavel_id = responsavel_id;
	}

	public String getNome_completo() {
		return nome_completo;
	}

	public void setNome_completo(String nome_completo) {
		this.nome_completo = nome_completo;
	}

	public int getResponsavel_status() {
		return responsavel_status;
	}

	public void setResponsavel_status(int responsavel_status) {
		this.responsavel_status = responsavel_status;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getResponsavel_usuario() {
		return responsavel_usuario;
	}

	public void setResponsavel_usuario(String responsavel_usuario) {
		this.responsavel_usuario = responsavel_usuario;
	}

	public String getResponavel_senha() {
		return responavel_senha;
	}

	public void setResponavel_senha(String responavel_senha) {
		this.responavel_senha = responavel_senha;
	}

	public String getResponsavel_email() {
		return responsavel_email;
	}

	public void setResponsavel_email(String responsavel_email) {
		this.responsavel_email = responsavel_email;
	}

	public String getResponsavel_telefone() {
		return responsavel_telefone;
	}

	public void setResponsavel_telefone(String responsavel_telefone) {
		this.responsavel_telefone = responsavel_telefone;
	}
}
