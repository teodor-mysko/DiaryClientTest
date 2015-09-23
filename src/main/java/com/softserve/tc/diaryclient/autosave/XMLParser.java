package com.softserve.tc.diaryclient.autosave;

import com.softserve.tc.diaryclient.entity.Record;

public interface XMLParser {
	
	public void marshalText(Record record);
	
	public String unMarshalText(Record record);
}
