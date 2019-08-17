package com.example.mentor_on_demand.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mentor")
public class Mentor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "user_name")
	private String username;
	@Column(name = "linked_url")
	private String linkedUrl;
	@Column(name = "reg_datetime")
	private Date regDatetime;
	@Column(name = "reg_code")
	private int regCode;
	@Column(name = "year_of_experience")
	private int yearOfExperience;
	@Column(name = "active")
	private boolean active;
	public Mentor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mentor(int id, String username, String linkedUrl, Date regDatetime, int regCode, int yearOfExperience,
			boolean active) {
		super();
		this.id = id;
		this.username = username;
		this.linkedUrl = linkedUrl;
		this.regDatetime = regDatetime;
		this.regCode = regCode;
		this.yearOfExperience = yearOfExperience;
		this.active = active;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLinkedUrl() {
		return linkedUrl;
	}
	public void setLinkedUrl(String linkedUrl) {
		this.linkedUrl = linkedUrl;
	}
	public Date getRegDatetime() {
		return regDatetime;
	}
	public void setRegDatetime(Date regDatetime) {
		this.regDatetime = regDatetime;
	}
	public int getRegCode() {
		return regCode;
	}
	public void setRegCode(int regCode) {
		this.regCode = regCode;
	}
	public int getYearOfExperience() {
		return yearOfExperience;
	}
	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (active ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + ((linkedUrl == null) ? 0 : linkedUrl.hashCode());
		result = prime * result + regCode;
		result = prime * result + ((regDatetime == null) ? 0 : regDatetime.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + yearOfExperience;
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
		Mentor other = (Mentor) obj;
		if (active != other.active)
			return false;
		if (id != other.id)
			return false;
		if (linkedUrl == null) {
			if (other.linkedUrl != null)
				return false;
		} else if (!linkedUrl.equals(other.linkedUrl))
			return false;
		if (regCode != other.regCode)
			return false;
		if (regDatetime == null) {
			if (other.regDatetime != null)
				return false;
		} else if (!regDatetime.equals(other.regDatetime))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (yearOfExperience != other.yearOfExperience)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Mentor [id=" + id + ", username=" + username + ", linkedUrl=" + linkedUrl + ", regDatetime="
				+ regDatetime + ", regCode=" + regCode + ", yearOfExperience=" + yearOfExperience + ", active=" + active
				+ "]";
	}

	
}
