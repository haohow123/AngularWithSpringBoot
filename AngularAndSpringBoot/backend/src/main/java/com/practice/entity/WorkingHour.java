package com.practice.entity;

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
	private int id;

	private String date;

	private String week;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="WORK_HOUR")
	private Date workHour;

	//bi-directional many-to-one association to JoinProjectDate
	@ManyToOne(fetch=FetchType.LAZY)
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

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getWeek() {
		return this.week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public Date getWorkHour() {
		return this.workHour;
	}

	public void setWorkHour(Date workHour) {
		this.workHour = workHour;
	}

	public JoinProjectDate getJoinProjectDate() {
		return this.joinProjectDate;
	}

	public void setJoinProjectDate(JoinProjectDate joinProjectDate) {
		this.joinProjectDate = joinProjectDate;
	}

}