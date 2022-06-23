package com.example.spring.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String name;
	private String email;
	private String phone;
	private String passsword;
	
	public User() {
	}

	public User(long id, String name, String email, String phone, String passsword) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.passsword = passsword;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPasssword() {
		return passsword;
	}

	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", passsword="
				+ passsword + "]";
	}
	
	
}
