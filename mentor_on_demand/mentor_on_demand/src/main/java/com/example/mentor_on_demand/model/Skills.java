package com.example.mentor_on_demand.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="skills")
public class Skills {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="TOC")
	private String TOC;
	@Column(name="duration")
	private String duration;
	@Column(name="prerequites")
	private String prerequites;
	public Skills() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Skills(int id, String name, String tOC, String duration, String prerequites) {
		super();
		this.id = id;
		this.name = name;
		TOC = tOC;
		this.duration = duration;
		this.prerequites = prerequites;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTOC() {
		return TOC;
	}
	public void setTOC(String tOC) {
		TOC = tOC;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getPrerequites() {
		return prerequites;
	}
	public void setPrerequites(String prerequites) {
		this.prerequites = prerequites;
	}
	@Override
	public String toString() {
		return "Skills [id=" + id + ", name=" + name + ", TOC=" + TOC + ", duration=" + duration + ", prerequites="
				+ prerequites + "]";
	}
	

}
