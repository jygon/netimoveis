package com.meuLocal.domain;

import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Proxy(lazy=false)
public class Vagas {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private int enderecoId;
	private boolean coberta;
	private int metrosQuadrados;
	private boolean disponivel;
	private String periodos;
	private String diasDisponiveis;
	private String horarios;
	private String logradouro;
	private int numero;
	private double longitude;
	private double latitude;

	public Vagas(){}

	public Vagas(Integer Id){
		this.id = Id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEnderecoId() {
		return enderecoId;
	}

	public void setEnderecoId(int enderecoId) {
		this.enderecoId = enderecoId;
	}

	public boolean isCoberta() {
		return coberta;
	}

	public void setCoberta(boolean coberta) {
		this.coberta = coberta;
	}

	public int getMetrosQuadrados() {
		return metrosQuadrados;
	}

	public void setMetrosQuadrados(int metrosQuadrados) {
		this.metrosQuadrados = metrosQuadrados;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public String getPeriodos() {
		return periodos;
	}

	public void setPeriodos(String periodos) {
		this.periodos = periodos;
	}

	public String getDiasDisponiveis() {
		return diasDisponiveis;
	}

	public void setDiasDisponiveis(String diasDisponiveis) {
		this.diasDisponiveis = diasDisponiveis;
	}

	public String getHorarios() {
		return horarios;
	}

	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}


}
