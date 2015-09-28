package com.softserve.tc.diaryclient.autosave;

import com.softserve.tc.diaryclient.entity.Record;

public interface XMLParser {
    
    String marshalText(Record record);
    
    Record unmarshalText(String record);
    
    boolean marshalTextToFile(Record record, String file);
    
    Record unmarshalTextFromFile(String file);
}
