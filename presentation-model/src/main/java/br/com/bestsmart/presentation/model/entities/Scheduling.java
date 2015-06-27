package br.com.bestsmart.presentation.model.entities;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.List;

/**
 * The persistent class for the agendamento database table.
 * 
 */
@Entity
@Table(name = "scheduling")
public class Scheduling implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private int id;

	@Column(nullable = false, length = 255)
	private String description;

	@Column(nullable = false, name = "scheduling_end")
	private Timestamp schedulingEnd;

	@Column(nullable = false, name = "scheduling_start")
	private Timestamp schedulingStart;

	@Column(name = "participants_minimun", nullable = false)
	private int participantsMinimun;

	@Column(name = "amount", nullable = false)
	private double amount;

	// uni-directional many-to-one association to Endereco
	@ManyToOne
	@JoinColumn(name = "adress", nullable = false)
	private Address address;

	// bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name = "responsible", nullable = false)
	private SystemUser responsible;

	// bi-directional many-to-many association to Usuario
	@ManyToMany(mappedBy = "schedulers")
	private List<SystemUser> schedulers;

	public Scheduling() {
	}

	public int getId() {
		return this.id;
	}

	public Scheduling setId(int id) {
		this.id = id;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public Scheduling setDescription(String description) {
		this.description = description;
		return this;
	}

	public int getParticipantsMinimun() {
		return participantsMinimun;
	}

	public Scheduling setParticipantsMinimun(int participantsMinimun) {
		this.participantsMinimun = participantsMinimun;
		return this;
	}

	public double getAmount() {
		return amount;
	}

	public Scheduling setAmount(double amount) {
		this.amount = amount;
		return this;
	}

	public Address getAddress() {
		return address;
	}

	public Scheduling setAddress(Address address) {
		this.address = address;
		return this;
	}

	public SystemUser getResponsible() {
		return responsible;
	}

	public Scheduling setResponsible(SystemUser responsible) {
		this.responsible = responsible;
		return this;
	}

	public List<SystemUser> getSchedulers() {
		return schedulers;
	}

	public Scheduling setSchedulers(List<SystemUser> schedulers) {
		this.schedulers = schedulers;
		return this;
	}

	@Override
	public String toString() {
		return "Scheduling [id=" + id + ", description=" + description
				+ ", end=" + schedulingEnd + ", start=" + schedulingStart
				+ ", participantsMinimun=" + participantsMinimun + ", amount="
				+ amount + ", address=" + address + ", responsible="
				+ responsible + ", schedules=" + schedulers + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result
				+ ((schedulingEnd == null) ? 0 : schedulingEnd.hashCode());
		result = prime * result + participantsMinimun;
		result = prime * result
				+ ((responsible == null) ? 0 : responsible.hashCode());
		result = prime * result
				+ ((schedulers == null) ? 0 : schedulers.hashCode());
		result = prime * result
				+ ((schedulingStart == null) ? 0 : schedulingStart.hashCode());
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
		Scheduling other = (Scheduling) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (Double.doubleToLongBits(amount) != Double
				.doubleToLongBits(other.amount))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (schedulingEnd == null) {
			if (other.schedulingEnd != null)
				return false;
		} else if (!schedulingEnd.equals(other.schedulingEnd))
			return false;
		if (participantsMinimun != other.participantsMinimun)
			return false;
		if (responsible == null) {
			if (other.responsible != null)
				return false;
		} else if (!responsible.equals(other.responsible))
			return false;
		if (schedulers == null) {
			if (other.schedulers != null)
				return false;
		} else if (!schedulers.equals(other.schedulers))
			return false;
		if (schedulingStart == null) {
			if (other.schedulingStart != null)
				return false;
		} else if (!schedulingStart.equals(other.schedulingStart))
			return false;
		return true;
	}

}