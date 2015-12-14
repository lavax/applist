package com.gpteam.applist.module.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	private int id;
	private String userName;
	private String userPassword;
	private String userDesc;

	private AuditColumn auditColumn;

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserDesc() {
		return userDesc;
	}

	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}

	@Embedded
	public AuditColumn getAuditColumn() {
		return auditColumn;
	}

	public void setAuditColumn(AuditColumn auditColumn) {
		this.auditColumn = auditColumn;
	}
}
