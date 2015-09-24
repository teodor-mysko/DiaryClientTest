package com.softserve.tc.diaryclient.autosave;

import org.apache.log4j.Logger;

import com.softserve.tc.diaryclient.entity.Record;
import com.softserve.tc.diaryclient.log.Log;

public class XSteamRecordParser implements XMLParser {
    
    private static Logger LOG =
            Log.init(XSteamRecordParser.class.toString());
            
    public String marshalText(Record record) {
        
        return null;
    }
    
    public Record unMarshalText(String record) {
        
        return null;
    }
}
