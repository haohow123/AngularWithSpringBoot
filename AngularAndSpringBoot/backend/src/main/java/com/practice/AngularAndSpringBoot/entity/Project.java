package com.practice.AngularAndSpringBoot.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the PROJECT database table.
 * 
 */
@Entity
@Table(name="PROJECT")
@NamedQuery(name="Project.findAll", query="SELECT p FROM Project p")
public class Project implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="PROJECT_COMPANY", length=200)
	private String projectCompany;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PROJECT_END_DATE_DTM")
	private Date projectEndDateDtm;

	@Column(name="PROJECT_ID")
	private int projectId;

	@Column(name="PROJECT_NAME", length=200)
	private String projectName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PROJECT_START_DATE_DTM")
	private Date projectStartDateDtm;

	//bi-directional many-to-one association to JoinProjectDate
	@OneToMany(mappedBy="project")
	private List<JoinProjectDate> joinProjectDates;

	public Project() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProjectCompany() {
		return this.projectCompany;
	}

	public void setProjectCompany(String projectCompany) {
		this.projectCompany = projectCompany;
	}

	public Date getProjectEndDateDtm() {
		return this.projectEndDateDtm;
	}

	public void setProjectEndDateDtm(Date projectEndDateDtm) {
		this.projectEndDateDtm = projectEndDateDtm;
	}

	public int getProjectId() {
		return this.projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Date getProjectStartDateDtm() {
		return this.projectStartDateDtm;
	}

	public void setProjectStartDateDtm(Date projectStartDateDtm) {
		this.projectStartDateDtm = projectStartDateDtm;
	}

	public List<JoinProjectDate> getJoinProjectDates() {
		return this.joinProjectDates;
	}

	public void setJoinProjectDates(List<JoinProjectDate> joinProjectDates) {
		this.joinProjectDates = joinProjectDates;
	}

	public JoinProjectDate addJoinProjectDate(JoinProjectDate joinProjectDate) {
		getJoinProjectDates().add(joinProjectDate);
		joinProjectDate.setProject(this);

		return joinProjectDate;
	}

	public JoinProjectDate removeJoinProjectDate(JoinProjectDate joinProjectDate) {
		getJoinProjectDates().remove(joinProjectDate);
		joinProjectDate.setProject(null);

		return joinProjectDate;
	}

}