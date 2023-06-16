package com.app.vdc.demo.Model;


import javax.persistence.*;
import java.util.ArrayList;


@Entity
public class Carrinho {
	@javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@OneToMany(fetch = FetchType.EAGER)
	private ArrayList<Produto> produtos;
	@OneToOne(fetch = FetchType.EAGER)
    private User consumidor;

	public void setId(Long id) {
		Id = id;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public User getConsumidor() {
		return consumidor;
	}

	public void setConsumidor(User consumidor) {
		this.consumidor = consumidor;
	}


    public Long getId() {
		return Id;
	}



	
}
