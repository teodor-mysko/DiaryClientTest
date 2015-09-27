package com.softserve.tc.diaryclient.autosave;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

import com.softserve.tc.diaryclient.autosave.RecordJAXBParser;
import com.softserve.tc.diaryclient.entity.Record;

/**
 * 
 * @author Mykola-Andriy
 *         
 */
public class RecordJAXBParserTest {
    
    @Test
    public void testMarshalText() {
        
        RecordJAXBParser parser = new RecordJAXBParser();
        
        Record record = new Record();
        record.setUser_name("Thomas");
        record.setCreated_time("2015-05-20 12:00:56");
        record.setText(
                "#Hello, I'm Thomas #Shelby. I'm from #Birmingham, #England!");
        record.setSupplement("http:/bigBoss/works/perfectly");
        
        String str = parser.marshalText(record);
        assertNotNull(str);
        
        Record record1 = parser.unmarshalText(str);
        
        assertEquals(record.toString(), record1.toString());
    }
    
    @Test
    public void testMarshalTextToFile() {
        
        RecordJAXBParser parser = new RecordJAXBParser();
        
        Record record = new Record();
        record.setUser_name("Thomas");
        record.setCreated_time("2015-05-20 12:00:56");
        record.setText(
                "#Hello, I'm Thomas #Shelby. I'm from #Birmingham, #England!");
        record.setSupplement("http:/bigBoss/works/perfectly");
        
        boolean res = parser.marshalTextToFile(record, "Chicago.xml");
        
        assertNotNull(res);
        
        Record record1 =
                parser.unmarshalTextFromFile("Chicago.xml");
                
        assertNotNull(record1);
        
        assertEquals(record.toString(), record1.toString());
    }
}
