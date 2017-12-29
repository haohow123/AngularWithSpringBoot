package com.practice.AngularAndSpringBoot.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the WORKING_HOUR database table.
 * 
 */
@Entity
@Table(name="WORKING_HOUR")
@NamedQuery(name="WorkingHour.findAll", query="SELECT w FROM WorkingHour w")
public class WorkingHour implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	@Column(length=45)
	private String week;

	@Column(name="WORK_HOUR")
	private int workHour;

	//bi-directional many-to-one association to JoinProjectDate
	@ManyToOne
	@JoinColumn(name="ME_PRJ_ID")
	private JoinProjectDate joinProjectDate;

	public WorkingHour() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getWeek() {
		return this.week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public int getWorkHour() {
		return this.workHour;
	}

	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}

	public JoinProjectDate getJoinProjectDate() {
		return this.joinProjectDate;
	}

	public void setJoinProjectDate(JoinProjectDate joinProjectDate) {
		this.joinProjectDate = joinProjectDate;
	}

}