package com.softserve.tc.diaryclient.entity;

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
//@Table(name="session")
public class UserSession {
	
	@Id
    private String uuid;
	
	@NotNull
	@Column(name="nick_name")
	private String nickName;

	@NotNull
	@Column(name="session_number", unique = true)
	private String sessionNumber;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="start_session")
	private Date startSession;
	
	@Column(name="end_session")
	@Temporal(TemporalType.TIMESTAMP)
	private Date endSession;
	
	public UserSession() {
		super();
	}
	
	public UserSession(String nickName, String sessionNumber, Date startSession) {
		super();
		this.uuid = UUID.randomUUID().toString();
		this.nickName = nickName;
		this.sessionNumber = sessionNumber;
		this.startSession = startSession;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
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

	@Override
	public String toString() {
		return "UserSession [uuid=" + uuid + ", nickName=" + nickName + ", sessionNumber=" + sessionNumber
				+ ", startSession=" + startSession + ", endSession=" + endSession + "]\n";
	}

}
