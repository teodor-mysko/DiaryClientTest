package com.softserve.tc.diaryclient.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
// @Table(name="system_statistic)
public class SystemStatistic {
    
    @Column(name = "general_number_of_users_per_month")
    private Integer genNumOfUsersPerMonth;
    
    @Column(name = "general_number_of_records_per_month")
    private Integer genNumOfRecordsPerMonth;
    
    @Column(name = "the_longest_time_online")
    private Integer theLongestTimeOnline;
    
    @Column(name = "the_biggest_record")
    private String theBiggestRecord;
    
    @Column(name = "most_popular_record") // most_interesting_record
    private String mostPopRecord;
    
    @Column(name = "number_of_new_users_per_month")
    private Integer numOfNewUsersPerMonth;
    
    @Column(name = "most_active_user_per_month")
    private String mostActiveUserPerMonth;
    
    @Column(name = "most_popular_user_per_month")
    private String mostPpopularUserPerMonth;
    
    public SystemStatistic() {
        super();
    }
    
    public SystemStatistic(Integer genNumOfUsersPerMonth,
            Integer genNumOfRecordsPerMonth, Integer theLongestTimeOnline,
            String theBiggestRecord, String mostPopRecord,
            Integer numOfNewUsersPerMonth,
            String mostActiveUserPerMonth, String mostPpopularUserPerMonth) {
        super();
        this.genNumOfUsersPerMonth = genNumOfUsersPerMonth;
        this.genNumOfRecordsPerMonth = genNumOfRecordsPerMonth;
        this.theLongestTimeOnline = theLongestTimeOnline;
        this.theBiggestRecord = theBiggestRecord;
        this.mostPopRecord = mostPopRecord;
        this.numOfNewUsersPerMonth = numOfNewUsersPerMonth;
        this.mostActiveUserPerMonth = mostActiveUserPerMonth;
        this.mostPpopularUserPerMonth = mostPpopularUserPerMonth;
    }
    
    public Integer getGenNumOfUsersPerMonth() {
        return genNumOfUsersPerMonth;
    }
    
    public void setGenNumOfUsersPerMonth(Integer genNumOfUsersPerMonth) {
        this.genNumOfUsersPerMonth = genNumOfUsersPerMonth;
    }
    
    public Integer getGenNumOfRecordsPerMonth() {
        return genNumOfRecordsPerMonth;
    }
    
    public void setGenNumOfRecordsPerMonth(Integer genNumOfRecordsPerMonth) {
        this.genNumOfRecordsPerMonth = genNumOfRecordsPerMonth;
    }
    
    public Integer getTheLongestTimeOnline() {
        return theLongestTimeOnline;
    }
    
    public void setTheLongestTimeOnline(Integer theLongestTimeOnline) {
        this.theLongestTimeOnline = theLongestTimeOnline;
    }
    
    public String getTheBiggestRecord() {
        return theBiggestRecord;
    }
    
    public void setTheBiggestRecord(String theBiggestRecord) {
        this.theBiggestRecord = theBiggestRecord;
    }
    
    public String getMostPopRecord() {
        return mostPopRecord;
    }
    
    public void setMostPopRecord(String mostPopRecord) {
        this.mostPopRecord = mostPopRecord;
    }
    
    public Integer getNumOfNewUsersPerMonth() {
        return numOfNewUsersPerMonth;
    }
    
    public void setNumOfNewUsersPerMonth(Integer numOfNewUsersPerMonth) {
        this.numOfNewUsersPerMonth = numOfNewUsersPerMonth;
    }
    
    public String getMostActiveUserPerMonth() {
        return mostActiveUserPerMonth;
    }
    
    public void setMostActiveUserPerMonth(String mostActiveUserPerMonth) {
        this.mostActiveUserPerMonth = mostActiveUserPerMonth;
    }
    
    public String getMostPpopularUserPerMonth() {
        return mostPpopularUserPerMonth;
    }
    
    public void setMostPpopularUserPerMonth(String mostPpopularUserPerMonth) {
        this.mostPpopularUserPerMonth = mostPpopularUserPerMonth;
    }
    
    @Override
    public String toString() {
        return "SystemStatistic [genNumOfUsersPerMonth=" + genNumOfUsersPerMonth
                + ", genNumOfRecordsPerMonth=" + genNumOfRecordsPerMonth
                + ", theLongestTimeOnline=" + theLongestTimeOnline
                + ", theBiggestRecord=" + theBiggestRecord + ", mostPopRecord="
                + mostPopRecord + ", numOfNewUsersPerMonth="
                + numOfNewUsersPerMonth + ", mostActiveUserPerMonth="
                + mostActiveUserPerMonth + ", mostPpopularUserPerMonth="
                + mostPpopularUserPerMonth + "]\n";
    }
    
}
