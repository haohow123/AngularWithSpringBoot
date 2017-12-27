package com.practice.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the MEMBERS database table.
 * 
 */
@Entity
@Table(name="MEMBERS")
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="CN_NAME")
	private String cnName;

	@Column(name="EN_NAME")
	private String enName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ENTRY_DATE")
	private Date entryDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LEAVE_DATE")
	private Date leaveDate;

	private int mobile;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	//bi-directional many-to-one association to JoinProjectDate
	@OneToMany(mappedBy="member")
	private List<JoinProjectDate> joinProjectDates;

	public Member() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCnName() {
		return this.cnName;
	}

	public void setCnName(String cnName) {
		this.cnName = cnName;
	}

	public String getEnName() {
		return this.enName;
	}

	public void setEnName(String enName) {
		this.enName = enName;
	}

	public Date getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Date getLeaveDate() {
		return this.leaveDate;
	}

	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}

	public int getMobile() {
		return this.mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public List<JoinProjectDate> getJoinProjectDates() {
		return this.joinProjectDates;
	}

	public void setJoinProjectDates(List<JoinProjectDate> joinProjectDates) {
		this.joinProjectDates = joinProjectDates;
	}

	public JoinProjectDate addJoinProjectDate(JoinProjectDate joinProjectDate) {
		getJoinProjectDates().add(joinProjectDate);
		joinProjectDate.setMember(this);

		return joinProjectDate;
	}

	public JoinProjectDate removeJoinProjectDate(JoinProjectDate joinProjectDate) {
		getJoinProjectDates().remove(joinProjectDate);
		joinProjectDate.setMember(null);

		return joinProjectDate;
	}

}