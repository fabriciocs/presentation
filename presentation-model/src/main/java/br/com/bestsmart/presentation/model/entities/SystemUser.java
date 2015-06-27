package br.com.bestsmart.presentation.model.entities;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;

/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@Table(name = "tb_system_user")
public class SystemUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private int id;

	@Column(nullable = false, length = 255)
	private String name;

	// bi-directional many-to-many association to Agendamento
	@ManyToMany
	@JoinTable(name = "attendance_confirmation", joinColumns = { @JoinColumn(name = "tb_system_user", nullable = false) }, inverseJoinColumns = { @JoinColumn(name = "scheduling", nullable = false) })
	private List<Scheduling> schedulers;

	// uni-directional many-to-many association to Endereco
	@OneToMany
	@JoinTable(name = "tb_system_user_address", joinColumns = { @JoinColumn(name = "tb_system_user", nullable = false) }, inverseJoinColumns = { @JoinColumn(name = "address", nullable = false) })
	private List<Address> address;

	@OneToOne
	@JoinColumn(name = "credencial", nullable = false)
	private Credencial credencial;

	// bi-directional many-to-many association to Telefone
	@OneToMany
	@JoinTable(name = "tb_system_user_phone", joinColumns = { @JoinColumn(name = "tb_system_user", nullable = false) }, inverseJoinColumns = { @JoinColumn(name = "phone", nullable = false) })
	private List<Phone> phones;

	public SystemUser() {
	}

	public int getId() {
		return this.id;
	}

	public SystemUser setId(int id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public SystemUser setName(String name) {
		this.name = name;
		return this;
	}

	public List<Scheduling> getSchedulers() {
		return schedulers;
	}

	public SystemUser setSchedulers(List<Scheduling> schedulers) {
		this.schedulers = schedulers;
		return this;
	}

	public List<Address> getAddress() {
		return address;
	}

	public SystemUser setAddress(List<Address> address) {
		this.address = address;
		return this;
	}

	public Credencial getCredencial() {
		return credencial;
	}

	public SystemUser setCredencial(Credencial credencial) {
		this.credencial = credencial;
		return this;
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public SystemUser setPhones(List<Phone> phones) {
		this.phones = phones;
		return this;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", schedulers="
				+ schedulers + ", address=" + address + ", credencial="
				+ credencial + ", phones=" + phones + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result
				+ ((credencial == null) ? 0 : credencial.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phones == null) ? 0 : phones.hashCode());
		result = prime * result
				+ ((schedulers == null) ? 0 : schedulers.hashCode());
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
		SystemUser other = (SystemUser) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (credencial == null) {
			if (other.credencial != null)
				return false;
		} else if (!credencial.equals(other.credencial))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phones == null) {
			if (other.phones != null)
				return false;
		} else if (!phones.equals(other.phones))
			return false;
		if (schedulers == null) {
			if (other.schedulers != null)
				return false;
		} else if (!schedulers.equals(other.schedulers))
			return false;
		return true;
	}

}