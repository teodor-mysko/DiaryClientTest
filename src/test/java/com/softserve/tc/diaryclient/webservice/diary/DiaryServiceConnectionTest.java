package com.softserve.tc.diaryclient.webservice.diary;

import static org.junit.Assert.*;
import org.junit.Test;

import com.softserve.tc.diary.webservice.DiaryService;

public class DiaryServiceConnectionTest {
	
	@Test
	public void testgetDairyServicePort(){
		 DiaryService port = DiaryServiceConnection.getDairyServicePort();
		 String actual = port.sayHello("Anna");
		 String expected = "Hello from WebService to Anna!";
		 assertEquals(expected, actual);
		 
		 actual = port.sayHello("Lv-159.1Java");
		 expected = "Hello from WebService to Anna!";
		 assertEquals(expected, actual);
	}
}
