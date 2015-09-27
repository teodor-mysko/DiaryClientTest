package com.softserve.tc.diaryclient.autosave;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.softserve.tc.diaryclient.entity.Record;

public class XMLSteamRecordParserTest {
    
    @Test
    public void testMarshalText() {
        
        XMLParser parser = new XStreamRecordParser();
        
        Record record = new Record();
        record.setUser_name("Thomas");
        record.setCreated_time("2015-05-20 12:00:56");
        record.setText(
                "#Hello, I'm Thomas #Shelby. I'm from #Birmingham, #England!");
        record.setSupplement("http:/bigBoss/works/perfectly");
        
        String strResult = parser.marshalText(record);
        
        assertNotNull(strResult);
        
        Record record1 = parser.unmarshalText(strResult);
        
        assertEquals(record.toString(), record1.toString());
    }
    
    @Test
    public void testMarshalTextToFile() {
        
        XMLParser parser = new XStreamRecordParser();
        
        Record record = new Record();
        record.setUser_name("Andriy");
        record.setCreated_time("2015-05-20 12:00:56");
        record.setText(
                "#Hello, I'm Andriy Zhmurkevych. I'm from #Lviv, #Ukraine!");
        record.setSupplement("http:/bigBoss/works/perfectly");
        
        boolean strResult = parser.marshalTextToFile(record, "Chicago.xml");
        
        Record record1 = parser.unmarshalTextFromFile("Chicago.xml");
        
        assertNotNull(strResult);
        
        assertEquals(record.toString(), record1.toString());
        
    }
}
