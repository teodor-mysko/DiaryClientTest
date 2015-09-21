package com.softserve.tc.diaryclient.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
	
	@Enumerated(EnumType.STRING)
	@Column(name="theme")
	private Theme theme;
	
	@Column(name="number_of_records_to_show")
	private Integer numberOfRecordsToShow;
	
	@Enumerated(EnumType.STRING)
	@Column(name="show_full_name")
	private YesNo showFullName;
	
	@Enumerated(EnumType.STRING)
	@Column(name="show_date_of_birth")
	private YesNo showDateOfBirth;
	
	@Enumerated(EnumType.STRING)
	@Column(name="language")
	private Language language;
	
	@Column(name="time_format")
	private TimeFormat timeFormat;
	
	public Settings() {
		super();
	}
	
	public Settings(String uuid, String nickName, Theme theme, Integer numberOfRecordsToShow, YesNo showFullName,
			YesNo showDateOfBirth, Language language, TimeFormat timeFormat) {
		super();
		this.uuid = uuid;
		this.nickName = nickName;
		this.theme = theme;
		this.numberOfRecordsToShow = numberOfRecordsToShow;
		this.showFullName = showFullName;
		this.showDateOfBirth = showDateOfBirth;
		this.language = language;
		this.timeFormat = timeFormat;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Settings [uuid=" + uuid + ", nickName=" + nickName + ", theme=" + theme + ", numberOfRecordsToShow="
				+ numberOfRecordsToShow + ", showFullName=" + showFullName + ", showDateOfBirth=" + showDateOfBirth
				+ ", language=" + language + ", timeFormat=" + timeFormat + "]";
	}

}
