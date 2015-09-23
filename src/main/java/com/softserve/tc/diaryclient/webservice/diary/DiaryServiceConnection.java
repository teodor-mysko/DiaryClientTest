package com.softserve.tc.diaryclient.webservice.diary;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.softserve.tc.diary.webservice.DiaryService;

public class DiaryServiceConnection {

	static DiaryService diaryService;

	public static DiaryService getDairyServicePort(){
		QName qname = new QName("http://webservice.diary.tc.softserve.com/", "DiaryServiceImplService");
		URL wsdlUrl;
		try {
			System.out.println("Say something...");
			wsdlUrl = new URL("http://localhost:8080/Diary/Ws?wsdl");
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
