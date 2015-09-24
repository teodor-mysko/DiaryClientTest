package com.softserve.tc.diaryclient.autosave;

import org.apache.log4j.Logger;

import com.softserve.tc.diaryclient.entity.Record;
import com.softserve.tc.diaryclient.log.Log;
import com.thoughtworks.xstream.XStream;

public class XStreamRecordParser implements XMLParser {
    
    private static Logger LOG =
            Log.init(XStreamRecordParser.class.toString());
    XStream xs = new XStream();
    
    public String marshalText(Record record) {
        LOG.debug(String.format("Converting to XML %s", record.toString()));
        xs.alias("record", Record.class);
        return xs.toXML(record);
    }
    
    public Record unMarshalText(String record) {
        LOG.debug(String.format("Converting XML to record %s", record));
        xs.alias("record", Record.class);
        return (Record) xs.fromXML(record);
    }
}
