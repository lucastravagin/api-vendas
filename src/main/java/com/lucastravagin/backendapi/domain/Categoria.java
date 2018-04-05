package com.lucastravagin.backendapi.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categoria implements Serializable {
	// versão da classe
	private static final long serialVersionUID = 1L;
	
	//Estratégias de Geração automática dos ID
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int id;
	private String nome;
	
	
	//Método Construtor
	public Categoria() {	
	}

	public Categoria(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	//Metódos de acesso para os atributos da classe (Encapsulamento)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	
	//HashCode e Equals (Implementação padrão, somente ID)
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
