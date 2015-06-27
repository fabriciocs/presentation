package br.com.bestsmart.presentation.model.entities;

import java.io.Serializable;

import javax.persistence.*;

/**
 * The persistent class for the credencial database table.
 * 
 */
@Entity
@Table(name = "credencial")
public class Credencial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private int id;

	@Column(nullable = false)
	private Boolean administrator;

	@Column(nullable = false, length = 50)
	private String email;

	@Column(nullable = false, length = 50)
	private String login;

	@Column(nullable = false, length = 64)
	private String password;

	// bi-directional one-to-one association to Usuario
	@OneToOne(mappedBy = "credencial")
	private SystemUser systemUser;

	public Credencial() {
	}

	public int getId() {
		return this.id;
	}

	public Credencial setId(int id) {
		this.id = id;
		return this;
	}

	public Boolean getAdministrator() {
		return administrator;
	}

	public Credencial setAdministrator(Boolean administrator) {
		this.administrator = administrator;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public Credencial setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getLogin() {
		return login;
	}

	public Credencial setLogin(String login) {
		this.login = login;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public Credencial setPassword(String password) {
		this.password = password;
		return this;
	}

	public SystemUser getSystemUser() {
		return systemUser;
	}

	public Credencial setSystemUser(SystemUser user) {
		this.systemUser = user;
		return this;
	}

	@Override
	public String toString() {
		return "Credencial [id=" + id + ", administrator=" + administrator
				+ ", email=" + email + ", login=" + login + ", password="
				+ password + ", user=" + systemUser + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((administrator == null) ? 0 : administrator.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((systemUser == null) ? 0 : systemUser.hashCode());
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
		Credencial other = (Credencial) obj;
		if (administrator == null) {
			if (other.administrator != null)
				return false;
		} else if (!administrator.equals(other.administrator))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (systemUser == null) {
			if (other.systemUser != null)
				return false;
		} else if (!systemUser.equals(other.systemUser))
			return false;
		return true;
	}

}