package com.maurodegaspari.webservices.model;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Instant dataHora;
	
		//Associação
	@ManyToOne
	@JoinColumn(name = "fk_id_cliente" )
	private UserModel cliente;
	
		//Construtor
	public OrderModel() {

	}		

	//Construtor com argumentos
	public OrderModel(Long id, Instant dataHora, UserModel cliente) {
		super();
		this.id = id;
		this.dataHora = dataHora;
		this.cliente = cliente;
	}

		public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getDataHora() {
		return dataHora;
	}

	public void setDataHora(Instant dataHora) {
		this.dataHora = dataHora;
	}

	public UserModel getCliente() {
		return cliente;
	}

	public void setCliente(UserModel cliente) {
		this.cliente = cliente;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		OrderModel other = (OrderModel) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
