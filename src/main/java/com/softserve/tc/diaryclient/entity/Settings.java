package com.softserve.tc.diaryclient.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="settings")
public class Settings {
	
	@Id
	private String uuid; 
	
	@NotNull
	@Column(name="nick_name")
	private String nickName;
	
	@Column(name="theme")
	private Theme theme;
	
	@Column(name="number_of_records_to_show")
	private Integer numberOfRecordsToShow;
	
	@Column(name="show_full_name")
	private YesNo showFullName;
	
	@Column(name="show_date_of_birth")
	private YesNo showDateOfBirth;
	
	@Column(name="language")
	private Language language;
	
	@Column(name="time_format")
	private TimeFormat timeFormat;

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

	public Theme getTheme() {
		return theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	public Integer getNumberOfRecordsToShow() {
		return numberOfRecordsToShow;
	}

	public void setNumberOfRecordsToShow(Integer numberOfRecordsToShow) {
		this.numberOfRecordsToShow = numberOfRecordsToShow;
	}

	public YesNo getShowFullName() {
		return showFullName;
	}

	public void setShowFullName(YesNo showFullName) {
		this.showFullName = showFullName;
	}

	public YesNo getShowDateOfBirth() {
		return showDateOfBirth;
	}

	public void setShowDateOfBirth(YesNo showDateOfBirth) {
		this.showDateOfBirth = showDateOfBirth;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public TimeFormat getTimeFormat() {
		return timeFormat;
	}

	public void setTimeFormat(TimeFormat timeFormat) {
		this.timeFormat = timeFormat;
	}

	

}
