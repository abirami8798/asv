package com.example.mentor_on_demand.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="payment")
public class Payment {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
    @Column(name="transaction_type")
	private String transactionType;
    @Column(name="amount")
	private double amount;
    @Column(name="date_time")
	private Date dateTime;
    @Column(name="remarks")
	private String remarks;
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="mentor_id",insertable=false,updatable=false)
	private Mentor mentor;
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="training_id",insertable=false,updatable=false)
	private Trainings trainings;
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(int id, String transactionType, double amount, Date dateTime, String remarks, Mentor mentor,
			Trainings trainings) {
		super();
		this.id = id;
		this.transactionType = transactionType;
		this.amount = amount;
		this.dateTime = dateTime;
		this.remarks = remarks;
		this.mentor = mentor;
		this.trainings = trainings;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Mentor getMentor() {
		return mentor;
	}
	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}
	public Trainings getTrainings() {
		return trainings;
	}
	public void setTrainings(Trainings trainings) {
		this.trainings = trainings;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((dateTime == null) ? 0 : dateTime.hashCode());
		result = prime * result + id;
		result = prime * result + ((mentor == null) ? 0 : mentor.hashCode());
		result = prime * result + ((remarks == null) ? 0 : remarks.hashCode());
		result = prime * result + ((trainings == null) ? 0 : trainings.hashCode());
		result = prime * result + ((transactionType == null) ? 0 : transactionType.hashCode());
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
		Payment other = (Payment) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (dateTime == null) {
			if (other.dateTime != null)
				return false;
		} else if (!dateTime.equals(other.dateTime))
			return false;
		if (id != other.id)
			return false;
		if (mentor == null) {
			if (other.mentor != null)
				return false;
		} else if (!mentor.equals(other.mentor))
			return false;
		if (remarks == null) {
			if (other.remarks != null)
				return false;
		} else if (!remarks.equals(other.remarks))
			return false;
		if (trainings == null) {
			if (other.trainings != null)
				return false;
		} else if (!trainings.equals(other.trainings))
			return false;
		if (transactionType == null) {
			if (other.transactionType != null)
				return false;
		} else if (!transactionType.equals(other.transactionType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Payment [id=" + id + ", transactionType=" + transactionType + ", amount=" + amount + ", dateTime="
				+ dateTime + ", remarks=" + remarks + ", mentor=" + mentor + ", trainings=" + trainings + "]";
	}	
}
