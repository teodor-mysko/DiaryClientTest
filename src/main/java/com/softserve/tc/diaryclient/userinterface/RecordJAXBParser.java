package com.softserve.tc.diaryclient.userinterface;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;

import com.softserve.tc.diaryclient.entity.Record;
import com.softserve.tc.diaryclient.log.Log;

/**
 * 
 * @author Mykola-
 *
 */
public class RecordJAXBParser {

	private static final String FILE_ADDRESS = "D:\\DiaryClient\\Cherchel.xml";
	private static Logger logger = Log.init(RecordJAXBParser.class.toString());

	public static void marshalText(Record record) throws JAXBException {

		try {
			JAXBContext context = JAXBContext.newInstance(Record.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			OutputStream outStream = new FileOutputStream(FILE_ADDRESS);
			marshaller.marshal(record, outStream);
			logger.info("\nMARSHALING SUCCESS!!!");
		} catch (FileNotFoundException error) {
			logger.error("\"D:\\DiaryClient\\Cherchel.xml\" Not Found !!!", error);
		}
	}

	public static void unMarshalText(Record record) {

		try {
			File file = new File(FILE_ADDRESS);
			JAXBContext context = JAXBContext.newInstance(Record.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Record result = (Record) unmarshaller.unmarshal(file);
			logger.info("\nUN-MARSHALING SUCCESS!!!" + result);
		} catch (JAXBException e) {
			logger.error("JAXBException !!!", e);
		}
	}
}
