package com.example.mentor_on_demand.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mentor_skill")

public class MentorSkill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "self_rating")
	private int selfRating;
	@Column(name = "year_of_exp")
	private int yearOfExp;
	@Column(name = "trainings_delivered")
	private String trainingsDelivered;
	@Column(name = "facilities_offered")
	private String facilitiesOffered;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mid",insertable=false,updatable=false)
	private Mentor mentor;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sid",insertable=false,updatable=false)
	private Skills skills;

	public MentorSkill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MentorSkill(int id, int selfRating, int yearOfExp, String trainingsDelivered, String facilitiesOffered,
			Mentor mentor, Skills skills) {
		super();
		this.id = id;
		this.selfRating = selfRating;
		this.yearOfExp = yearOfExp;
		this.trainingsDelivered = trainingsDelivered;
		this.facilitiesOffered = facilitiesOffered;
		this.mentor = mentor;
		this.skills = skills;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSelfRating() {
		return selfRating;
	}

	public void setSelfRating(int selfRating) {
		this.selfRating = selfRating;
	}

	public int getYearOfExp() {
		return yearOfExp;
	}

	public void setYearOfExp(int yearOfExp) {
		this.yearOfExp = yearOfExp;
	}

	public String getTrainingsDelivered() {
		return trainingsDelivered;
	}

	public void setTrainingsDelivered(String trainingsDelivered) {
		this.trainingsDelivered = trainingsDelivered;
	}

	public String getFacilitiesOffered() {
		return facilitiesOffered;
	}

	public void setFacilitiesOffered(String facilitiesOffered) {
		this.facilitiesOffered = facilitiesOffered;
	}

	public Mentor getMentor() {
		return mentor;
	}

	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}

	public Skills getSkills() {
		return skills;
	}

	public void setSkills(Skills skills) {
		this.skills = skills;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((facilitiesOffered == null) ? 0 : facilitiesOffered.hashCode());
		result = prime * result + id;
		result = prime * result + ((mentor == null) ? 0 : mentor.hashCode());
		result = prime * result + selfRating;
		result = prime * result + ((skills == null) ? 0 : skills.hashCode());
		result = prime * result + ((trainingsDelivered == null) ? 0 : trainingsDelivered.hashCode());
		result = prime * result + yearOfExp;
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
		MentorSkill other = (MentorSkill) obj;
		if (facilitiesOffered == null) {
			if (other.facilitiesOffered != null)
				return false;
		} else if (!facilitiesOffered.equals(other.facilitiesOffered))
			return false;
		if (id != other.id)
			return false;
		if (mentor == null) {
			if (other.mentor != null)
				return false;
		} else if (!mentor.equals(other.mentor))
			return false;
		if (selfRating != other.selfRating)
			return false;
		if (skills == null) {
			if (other.skills != null)
				return false;
		} else if (!skills.equals(other.skills))
			return false;
		if (trainingsDelivered == null) {
			if (other.trainingsDelivered != null)
				return false;
		} else if (!trainingsDelivered.equals(other.trainingsDelivered))
			return false;
		if (yearOfExp != other.yearOfExp)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MentorSkill [id=" + id + ", selfRating=" + selfRating + ", yearOfExp=" + yearOfExp
				+ ", trainingsDelivered=" + trainingsDelivered + ", facilitiesOffered=" + facilitiesOffered
				+ ", mentor=" + mentor + ", skills=" + skills + "]";
	}

	

}
