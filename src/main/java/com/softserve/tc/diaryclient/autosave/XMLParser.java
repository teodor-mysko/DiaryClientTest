package com.softserve.tc.diaryclient.autosave;

import com.softserve.tc.diaryclient.entity.Record;

public interface XMLParser {
    
    String marshalText(Record record);
    
    Record unMarshalText(String record);
}
