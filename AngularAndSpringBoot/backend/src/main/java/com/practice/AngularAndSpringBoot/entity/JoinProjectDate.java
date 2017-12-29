package com.practice.AngularAndSpringBoot.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the JOIN_PROJECT_DATE database table.
 * 
 */
@Entity
@Table(name="JOIN_PROJECT_DATE")
@NamedQuery(name="JoinProjectDate.findAll", query="SELECT j FROM JoinProjectDate j")
public class JoinProjectDate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="JOIN_DATE_DTM")
	private Date joinDateDtm;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LEAVE_DATA_DTM")
	private Date leaveDataDtm;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="START_DATE")
	private Date startDate;

	//bi-directional many-to-one association to Member
	@ManyToOne
	@JoinColumn(name="MEMBER_ID")
	private Member member;

	//bi-directional many-to-one association to Project
	@ManyToOne
	@JoinColumn(name="PROJECT_ID")
	private Project project;

	//bi-directional many-to-one association to WorkingHour
	@OneToMany(mappedBy="joinProjectDate")
	private List<WorkingHour> workingHours;

	public JoinProjectDate() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getJoinDateDtm() {
		return this.joinDateDtm;
	}

	public void setJoinDateDtm(Date joinDateDtm) {
		this.joinDateDtm = joinDateDtm;
	}

	public Date getLeaveDataDtm() {
		return this.leaveDataDtm;
	}

	public void setLeaveDataDtm(Date leaveDataDtm) {
		this.leaveDataDtm = leaveDataDtm;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public List<WorkingHour> getWorkingHours() {
		return this.workingHours;
	}

	public void setWorkingHours(List<WorkingHour> workingHours) {
		this.workingHours = workingHours;
	}

	public WorkingHour addWorkingHour(WorkingHour workingHour) {
		getWorkingHours().add(workingHour);
		workingHour.setJoinProjectDate(this);

		return workingHour;
	}

	public WorkingHour removeWorkingHour(WorkingHour workingHour) {
		getWorkingHours().remove(workingHour);
		workingHour.setJoinProjectDate(null);

		return workingHour;
	}

}