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
//@Table(name="user_statistic")
public class UserStatistic {

	@Id
	private String uuid; 

	@NotNull
	@Column(name="nick_name")
	private String nickName;
	
	@Column(name="number_of_records")
	private Integer numberOfRecords;
	
	@Column(name="number_of_logins")
	private Integer numberOfLogins;
	
	@Column(name="last_records")
	private String lastRecords;
	
	@Column(name="last_login")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastLogin;
	
	public UserStatistic() {
		super();
	}
	
	public UserStatistic(String nickName, Integer numberOfRecords, Integer numberOfLogins,
			String lastRecords, Date lastLogin) {
		super();
		this.uuid = UUID.randomUUID().toString();
		this.nickName = nickName;
		this.numberOfRecords = numberOfRecords;
		this.numberOfLogins = numberOfLogins;
		this.lastRecords = lastRecords;
		this.lastLogin = lastLogin;
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

	public Integer getNumberOfRecords() {
		return numberOfRecords;
	}

	public void setNumberOfRecords(Integer numberOfRecords) {
		this.numberOfRecords = numberOfRecords;
	}

	public Integer getNumberOfLogins() {
		return numberOfLogins;
	}

	public void setNumberOfLogins(Integer numberOfLogins) {
		this.numberOfLogins = numberOfLogins;
	}

	public String getLastRecords() {
		return lastRecords;
	}

	public void setLastRecords(String lastRecords) {
		this.lastRecords = lastRecords;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	
}
