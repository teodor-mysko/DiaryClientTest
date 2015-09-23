package com.softserve.tc.diaryclient;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;

import com.softserve.tc.diaryclient.entity.Record;
import com.softserve.tc.diaryclient.entity.UserSession;

/**
 * 
 * @author Mykola-
 *
 */
public class RecordJAXBParserTest {

	@Test
	public void marshalText() throws JAXBException {
		Record record = new Record();
		record.setUser_name("Thomas");
		record.setCreated_time("2015-05-20 12:00:56");
		record.setText("#Hello, I'm Thomas #Shelby. I'm from #Birmingham, #England!");
		record.setSupplement("http:/bigBoss/works/perfectly");
		
		UserSession user = new UserSession();
		user.setNickName("Niikkkooo");

		try {
			JAXBContext context = JAXBContext.newInstance(Record.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			StringWriter str = new StringWriter();
			marshaller.marshal(record, str);
			System.out.println(str.toString());
			try {
				File out = new File("D:\\DiaryClient\\Mishel.xml");
				OutputStream outStream = new FileOutputStream(out);
				marshaller.marshal(record, outStream);
				System.out.println("\nMARSHAL SUCCESS!!!");
			} catch (FileNotFoundException error) {
				error.printStackTrace();
			}

//			String output = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><RECORD><CREATED_TIME>2015-05-20 12:00:56</CREATED_TIME><SUPPLEMENT_URL>http:/bigBoss/works/perfectly</SUPPLEMENT_URL><TEXT>#Hello, I'm Thomas #Shelby. I'm from #Birmingham, #England!</TEXT><USER_NAME>Thomas</USER_NAME></RECORD>";
//			assertEquals(output, str.toString());
			assertTrue(str.toString().contains("<USER_NAME>Thomas</USER_NAME>"));
			assertNotNull(str);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
//	@Test
//	public void unMarshalText() {
//
//		try {
//			File file = new File( "Marshal.xml" );
//			JAXBContext context = JAXBContext.newInstance(Record.class);
//			Unmarshaller unmarshaller = context.createUnmarshaller();
//			Record result = (Record) unmarshaller.unmarshal(file);
////			System.out.println(result.toString());
//
//			System.out.println("UNMARSHALLED FILES:");
//			System.out.println("Ім'я користувача: " + result.getUser_name());
//			System.out.println("Час створення: " + result.getCreated_time());
//			System.out.println("Запис: " + result.getText());
//			System.out.println("Додаток: " + result.getSupplement());
//
//			String output = "Record [id_rec=null, user_name=Thomas, created_time=2015-05-20 12:00:56, text=#Hello, I'm Thomas #Shelby. I'm from #Birmingham, #England!, supplement=http:/bigBoss/works/perfectly]";
//			assertEquals(output, result.toString());
//			assertTrue(result.toString().contains("user_name=Thomas"));
//			assertNotNull(result);
//		} catch (JAXBException e) {
//			e.printStackTrace();
//		}
//		}
}
