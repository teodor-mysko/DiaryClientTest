package com.softserve.tc.diaryclient.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Mykola-
 *        
 */
@XmlRootElement( name = "RECORD" )
public class Record {
    
    private String id_rec;
    private String user_name;
//    private Timestamp created_time;
    private String created_time;
    private String text;
    private String supplement;
    
    public Record( ){
    }
    
    public Record(String id_rec, String user_name, String created_time,
            String text, String supplement) {
        this.id_rec = id_rec;
        this.user_name = user_name;
        this.created_time = created_time;
        this.text = text;
        this.supplement = supplement;
    }
    
//    public String getId_rec() {
//        return id_rec;
//    }
//    
//    public void setId_rec(String id_rec) {
//        this.id_rec = id_rec;
//    }
    
    @XmlElement( name = "USER_NAME", required = true)
    public String getUser_name() {
        return user_name;
    }
    
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    @XmlElement( name = "CREATED_TIME" )    
    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }
    
    @XmlElement( name = "TEXT", required = true)
    public String getText() {
        return text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    
    @XmlElement( name = "SUPPLEMENT_URL" )
    public String getSupplement() {
        return supplement;
    }
    
    public void setSupplement(String supplement) {
        this.supplement = supplement;
    }
    
    @Override
    public String toString() {
        return "Record [id_rec=" + id_rec + ", user_name=" + user_name
                + ", created_time=" + created_time + ", text="
                + text + ", supplement=" + supplement + "]";
    }
    
}
