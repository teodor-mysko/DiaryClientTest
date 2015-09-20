package com.softserve.tc.diaryclient.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="session")
public class Session {
	
	@Id
    private String uuid;

	@NotNull
	@Column(name="session_number")
	private String sessionNumber;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="start_session")
	private Date startSession;
	
	@Column(name="end_session")
	@Temporal(TemporalType.TIMESTAMP)
	private Date endSession;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getSessionNumber() {
		return sessionNumber;
	}

	public void setSessionNumber(String sessionNumber) {
		this.sessionNumber = sessionNumber;
	}

	public Date getStartSession() {
		return startSession;
	}

	public void setStartSession(Date startSession) {
		this.startSession = startSession;
	}

	public Date getEndSession() {
		return endSession;
	}

	public void setEndSession(Date endSession) {
		this.endSession = endSession;
	}

}
