package com.softserve.tc.diaryclient.autosave;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

import com.softserve.tc.diaryclient.autosave.RecordJAXBParser;
import com.softserve.tc.diaryclient.entity.Record;

/**
 * 
 * @author Mykola-
 *         
 */
public class RecordJAXBParserTest {
    String line;
    StringBuilder sb = new StringBuilder();
    BufferedReader br;
    
    @Test
    public void testMarshalText() {
        RecordJAXBParser parser = new RecordJAXBParser();
        Record record = new Record();
        record.setUser_name("Thomas");
        record.setCreated_time("2015-05-20 12:00:56");
        record.setText(
                "#Hello, I'm Thomas #Shelby. I'm from #Birmingham, #England!");
        record.setSupplement("http:/bigBoss/works/perfectly");
        // UserSession user = new UserSession();
        // user.setNickName("Niikkkooo");
        // System.out.println(user);
        
        parser.marshalText(record);
        
        /**
         * read from xml file to get its contents and than take it to assert
         */
        try {
            br = new BufferedReader(
                    new FileReader(new File("D:\\DiaryClient\\Chicago.xml")));
                    
            while ((line = br.readLine()) != null) {
                sb.append(line.trim());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        String output =
                "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><RECORD><CREATED_TIME>2015-05-20 12:00:56</CREATED_TIME><SUPPLEMENT_URL>http:/bigBoss/works/perfectly</SUPPLEMENT_URL><TEXT>#Hello, I'm Thomas #Shelby. I'm from #Birmingham, #England!</TEXT><USER_NAME>Thomas</USER_NAME></RECORD>";
        assertEquals(output, sb.toString());
        assertTrue(sb.toString().contains("<USER_NAME>Thomas</USER_NAME>"));
        assertNotNull(sb);
    }
    
    @Test
    public void unMarshalText() {
        RecordJAXBParser parser = new RecordJAXBParser();
        Record unmarshaledRecord = parser.unMarshalText(null);
        
        String expectedOutput =
                "Record [id_rec=null, user_name=Thomas, created_time=2015-05-20 12:00:56, text=#Hello, I'm Thomas #Shelby. I'm from #Birmingham, #England!, supplement=http:/bigBoss/works/perfectly]";
        assertEquals(expectedOutput, unmarshaledRecord.toString());
        assertTrue(unmarshaledRecord.toString().contains("user_name=Thomas"));
        assertNotNull(unmarshaledRecord);
    }
}
