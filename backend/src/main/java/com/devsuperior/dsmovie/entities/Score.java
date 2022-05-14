package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {
	
	@EmbeddedId
	private ScorePK id = new ScorePK(); //quando se faz uma chave composta é preciso darum new para garantir que o objeto ta instanciado

	private Double value;
	
	public Score() {
		
	}
	
	//escrever um metodo que vai servir para associar um filme com o score
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	//salvar a ref
	public void setUser(User user) {
		id.setUser(user);
	}
	
	
	//puxar get e sets, metodos de acesso
	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	
}
