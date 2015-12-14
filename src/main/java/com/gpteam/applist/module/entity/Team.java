package com.gpteam.applist.module.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Team {

	private int id;
	private String teamCode;
	private String teamName;
	private String teamDesc;

	private AuditColumn auditColumn;

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeamCode() {
		return teamCode;
	}

	public void setTeamCode(String teamCode) {
		this.teamCode = teamCode;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamDesc() {
		return teamDesc;
	}

	public void setTeamDesc(String teamDesc) {
		this.teamDesc = teamDesc;
	}

	@Embedded
	public AuditColumn getAuditColumn() {
		return auditColumn;
	}

	public void setAuditColumn(AuditColumn auditColumn) {
		this.auditColumn = auditColumn;
	}
}
