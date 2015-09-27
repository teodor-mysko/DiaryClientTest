package com.softserve.tc.diaryclient.autosave;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.apache.log4j.Logger;

import com.softserve.tc.diaryclient.entity.Record;
import com.softserve.tc.diaryclient.log.Log;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.XStreamException;

public class XStreamRecordParser implements XMLParser {
    
    // public XStreamRecordParser() {
    // }
    //
    // public XStreamRecordParser(String file) {
    // String fileName = file;
    // }
    
    private static Logger LOG =
            Log.init(XStreamRecordParser.class.toString());
    XStream xs = new XStream();
    
    public String marshalText(Record record) {
        LOG.debug(String.format("Converting to XML %s", record.toString()));
        xs.alias("record", Record.class);
        return xs.toXML(record);
    }
    
    public Record unmarshalText(String record) {
        LOG.debug(String.format("Converting XML to record %s", record));
        xs.alias("record", Record.class);
        return (Record) xs.fromXML(record);
    }
    
    public boolean marshalTextToFile(Record record, String file) {
        
        try {
            LOG.debug(
                    String.format("Converting record to XML file %s ", record));
            FileOutputStream fos = new FileOutputStream(file);
            xs.alias("record", Record.class);
            xs.toXML(record, fos);
            return true;
        } catch (FileNotFoundException error) {
            LOG.error("Chicago.xml Not Found !!!",
                    error);
            return false;
        } catch (XStreamException e) {
            LOG.error("XStreamException !!!", e);
            return false;
        }
    }
    
    public Record unmarshalTextFromFile(String file, Record record) {
        
        try {
            LOG.debug(
                    String.format("Converting XML file to record %s \n", file));
            FileInputStream file1 = new FileInputStream(file);
            xs.fromXML(file1, record);
            return record;
        } catch (FileNotFoundException error) {
            LOG.error("Chicago.xml Not Found !!!",
                    error);
            return null;
        } catch (XStreamException e) {
            LOG.error("XStreamException !!!", e);
            return null;
        }
        
    }
}
