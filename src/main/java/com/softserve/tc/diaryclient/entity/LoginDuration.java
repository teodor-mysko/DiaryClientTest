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
//@Table(name="login_duration")
public class LoginDuration {
	
	@Id
	private String uuid; 

	@NotNull
	@Column(name="nick_name")
	private String nickName;
	
	@Column(name="login_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date loginDate;
	
	@Column(name="duration")
	private Double duration;
	
	public LoginDuration() {
		super();
	}
	
	public LoginDuration(String nickName, Date loginDate, Double duration) {
		super();
		this.uuid = UUID.randomUUID().toString();
		this.nickName = nickName;
		this.loginDate = loginDate;
		this.duration = duration;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LoginDuration [uuid=" + uuid + ", nickName=" + nickName + ", loginDate=" + loginDate + ", duration="
				+ duration + "]";
	}

}
