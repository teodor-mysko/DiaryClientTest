package com.softserve.tc.diaryclient.entity;

import java.security.Timestamp;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="session")
public class UserSession {
	
	@Id
    private String uuid;

	@NotNull
	@Column(name="session_number")
	private String sessionNumber;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="start_session")
	private Timestamp startSession;
	
	@Column(name="end_session")
	@Temporal(TemporalType.TIMESTAMP)
	private Timestamp endSession;
	
	public UserSession() {
		super();
	}
	
	public UserSession(String sessionNumber, Timestamp startSession, Timestamp endSession) {
		super();
		this.uuid = UUID.randomUUID().toString();
		this.sessionNumber = sessionNumber;
		this.startSession = startSession;
		this.endSession = endSession;
	}

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

	public Timestamp getStartSession() {
		return startSession;
	}

	public void setStartSession(Timestamp startSession) {
		this.startSession = startSession;
	}

	public Timestamp getEndSession() {
		return endSession;
	}

	public void setEndSession(Timestamp endSession) {
		this.endSession = endSession;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Session [uuid=" + uuid + ", sessionNumber=" + sessionNumber + ", startSession=" + startSession
				+ ", endSession=" + endSession + "]";
	}

}
