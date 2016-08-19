package com.meuLocal.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.Proxy;


@Entity
@Proxy(lazy=false)
public class Pessoa {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private long cpf;
	private Date created;
	private int idade;
	private String nome;
	private Integer celular1;
	private Integer celular2;
	private Integer telefone1;
	private Integer telefone2;
	private String email1;
	private String email2;
	private String profissao;

	@Transient
	private SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

	Pessoa(){}

	Pessoa(Integer Id){
		this.id = Id;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getCreatedAsShort(){
		return format.format(created);
	}

	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Integer getCelular1() {
		return celular1;
	}
	public void setCelular1(Integer celular1) {
		this.celular1 = celular1;
	}

	public Integer getCelular2() {
		return celular2;
	}
	public void setCelular2(Integer celular2) {
		this.celular2 = celular2;
	}

	public Integer getTelefone1() {
		return telefone1;
	}
	public void setTelefone1(Integer telefone1) {
		this.telefone1 = telefone1;
	}

	public Integer getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(Integer telefone2) {
		this.telefone2 = telefone2;
	}

	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String toString(){
		StringBuilder value = new StringBuilder("* PessoasEntry(");
		value.append("Id: ");
		value.append(id);
		value.append(",Nome: ");
		value.append(nome);
		value.append(",Cpf: ");
		value.append(cpf);
		value.append(",Created: ");
		value.append(getCreatedAsShort());
		value.append(")");
		return value.toString();
	}
}
