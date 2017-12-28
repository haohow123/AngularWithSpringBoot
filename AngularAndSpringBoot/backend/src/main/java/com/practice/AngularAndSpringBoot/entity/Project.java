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
@NamedQuery(name="Project.findAll", query="SELECT p FROM Project p")
public class Project implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PROJECT_END_DATE")
	private Date projectEndDate;

	@Column(name="PROJECT_ID")
	private int projectId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PROJECT_NAME")
	private Date projectName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PROJECT_START_DATE")
	private Date projectStartDate;

	@Column(name="RICH_PAPA")
	private String richPapa;

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

	public Date getProjectEndDate() {
		return this.projectEndDate;
	}

	public void setProjectEndDate(Date projectEndDate) {
		this.projectEndDate = projectEndDate;
	}

	public int getProjectId() {
		return this.projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public Date getProjectName() {
		return this.projectName;
	}

	public void setProjectName(Date projectName) {
		this.projectName = projectName;
	}

	public Date getProjectStartDate() {
		return this.projectStartDate;
	}

	public void setProjectStartDate(Date projectStartDate) {
		this.projectStartDate = projectStartDate;
	}

	public String getRichPapa() {
		return this.richPapa;
	}

	public void setRichPapa(String richPapa) {
		this.richPapa = richPapa;
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