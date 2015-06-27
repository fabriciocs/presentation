package br.com.bestsmart.presentation.model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the endereco database table.
 * 
 */
@Entity
@Table(name = "address")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private int id;

	@Column(length = 255)
	private String neighborhood;

	@Column(length = 255)
	private String cep;

	@Column(length = 255)
	private String city;

	@Column(length = 255)
	private String complement;

	@Column(length = 255)
	private String description;

	@Column(length = 255)
	private String state;

	@Column(length = 255)
	private String street;

	@Column(length = 255)
	private String number;

	@Column(length = 255)
	private String reference;

	public Address() {
	}

	public int getId() {
		return this.id;
	}

	public Address setId(int id) {
		this.id = id;
		return this;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public Address setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
		return this;
	}

	public String getCep() {
		return cep;
	}

	public Address setCep(String cep) {
		this.cep = cep;
		return this;
	}

	public String getCity() {
		return city;
	}

	public Address setCity(String city) {
		this.city = city;
		return this;
	}

	public String getComplement() {
		return complement;
	}

	public Address setComplement(String complement) {
		this.complement = complement;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public Address setDescription(String description) {
		this.description = description;
		return this;
	}

	public String getState() {
		return state;
	}

	public Address setState(String state) {
		this.state = state;
		return this;
	}

	public String getStreet() {
		return street;
	}

	public Address setStreet(String street) {
		this.street = street;
		return this;
	}

	public String getNumber() {
		return number;
	}

	public Address setNumber(String number) {
		this.number = number;
		return this;
	}

	public String getReference() {
		return reference;
	}

	public Address setReference(String reference) {
		this.reference = reference;
		return this;
	}

}