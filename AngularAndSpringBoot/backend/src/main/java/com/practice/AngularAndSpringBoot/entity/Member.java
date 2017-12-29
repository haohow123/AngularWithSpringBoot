package com.practice.AngularAndSpringBoot.entity;

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
@NamedQuery(name="Member.findAll", query="SELECT m FROM Member m")
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="CN_NAME", length=200)
	private String cnName;

	@Column(name="EN_NAME", length=200)
	private String enName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ENTRY_DATE_DTM")
	private Date entryDateDtm;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LEAVE_DATE_DTM")
	private Date leaveDateDtm;

	@Column(length=10)
	private String mobile;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATE_DATE_DTM")
	private Date updateDateDtm;

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

	public Date getEntryDateDtm() {
		return this.entryDateDtm;
	}

	public void setEntryDateDtm(Date entryDateDtm) {
		this.entryDateDtm = entryDateDtm;
	}

	public Date getLeaveDateDtm() {
		return this.leaveDateDtm;
	}

	public void setLeaveDateDtm(Date leaveDateDtm) {
		this.leaveDateDtm = leaveDateDtm;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getUpdateDateDtm() {
		return this.updateDateDtm;
	}

	public void setUpdateDateDtm(Date updateDateDtm) {
		this.updateDateDtm = updateDateDtm;
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