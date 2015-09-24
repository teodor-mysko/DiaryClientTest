package com.softserve.tc.diaryclient.webservice.diary;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.softserve.tc.diary.webservice.DiaryService;

public class DiaryServiceConnection {

	static DiaryService diaryService;
	public static final String NAME_SPACE_URI = "http://webservice.diary.tc.softserve.com/";
	public static final String LOCAL_PART = "DiaryServiceImplService";
	public static final String WSDL = "http://localhost:8080/Diary/DiaryService?wsdl";
	
	private DiaryServiceConnection() {
	}

	public static DiaryService getDairyServicePort(){
		
		QName qname = new QName(NAME_SPACE_URI, LOCAL_PART);
		
		try {
			URL wsdlUrl = new URL(WSDL);
			Service service = Service.create(wsdlUrl, qname);
			DiaryService port = service.getPort(DiaryService.class);
			System.out.println(port.sayHello("Java-159.1"));
			return port;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return diaryService;
	}
}
