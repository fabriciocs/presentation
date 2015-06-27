package br.com.bestsmart.presentation.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the telefone database table.
 * 
 */
@Entity
@Table(name = "phone")
public class Phone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private int id;

	@Column(nullable = false, length = 2)
	private String ddd;

	@Column(length = 255)
	private String description;

	@Column(nullable = false, length = 9)
	private String number;

	public Phone() {
	}

	public int getId() {
		return this.id;
	}

	public Phone setId(int id) {
		this.id = id;
		return this;
	}

	public String getDdd() {
		return ddd;
	}

	public Phone setDdd(String ddd) {
		this.ddd = ddd;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public Phone setDescription(String description) {
		this.description = description;
		return this;
	}

	public String getNumber() {
		return number;
	}

	public Phone setNumber(String number) {
		this.number = number;
		return this;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", ddd=" + ddd + ", description="
				+ description + ", number=" + number + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ddd == null) ? 0 : ddd.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
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
		Phone other = (Phone) obj;
		if (ddd == null) {
			if (other.ddd != null)
				return false;
		} else if (!ddd.equals(other.ddd))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

}