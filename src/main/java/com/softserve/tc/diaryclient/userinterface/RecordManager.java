package com.softserve.tc.diaryclient.userinterface;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.softserve.tc.diaryclient.entity.Record;

/**
 * 
 * @author Mykola-
 *
 */
public class RecordManager {

	public static void marshalText(Record record) {

		try {
			JAXBContext context = JAXBContext.newInstance(Record.class);
			Marshaller marshaller = context.createMarshaller();
			StringWriter str = new StringWriter();
			marshaller.marshal(record, str);
			System.out.println(str.toString());
			try {
				File out = new File("Marshal.xml");
				OutputStream outStream = new FileOutputStream(out);
				marshaller.marshal(record, outStream);
				System.out.println("\nMARSHAL SUCCESS!!!");
			} catch (FileNotFoundException error) {
				error.printStackTrace();
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public static void unMarshalText(Record record) {

		try {
			File file = new File( "Marshal.xml" );
			JAXBContext context = JAXBContext.newInstance(Record.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Record result = (Record) unmarshaller.unmarshal(file);
//			System.out.println(result);

			System.out.println("Ім'я користувача: " + result.getUser_name());
			System.out.println("Час створення: " + result.getCreated_time());
			System.out.println("Запис: " + result.getText());
			System.out.println("Додаток: " + result.getSupplement());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
