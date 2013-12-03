package com.teste;

import java.io.Serializable;

public class Person implements Serializable{

	private static final long serialVersionUID = -8125923686163465427L;
	
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Person [nome=" + nome + "]";
	}
	
}
