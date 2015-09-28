package com.softserve.tc.diaryclient.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.tagext.Tag;

import org.hibernate.boot.model.source.spi.SubclassEntitySource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.softserve.tc.diary.dao.implementation.RecordDAOImpl;
import com.softserve.tc.diary.dao.implementation.TagDAOImpl;
import com.softserve.tc.diary.entity.Record;
import com.softserve.tc.diary.webservice.DiaryService;
import com.softserve.tc.diaryclient.dao.UserStatisticDAO;
import com.softserve.tc.diaryclient.entity.UserStatistic;
import com.softserve.tc.diaryclient.webservice.diary.DiaryServiceConnection;

@Controller
public class PublicRecordController {

	@RequestMapping(value = "/publicRecords")
	public String records(ModelMap model) {
		DiaryService port = DiaryServiceConnection.getDairyServicePort();
		 List<Record> list1 = port.getAllPublicRecords();
//		RecordDAOImpl dao = new RecordDAOImpl();
//		List<Record> list1 = dao.getAllPublicRecords();
		 List<String> list = new ArrayList<String>();
		 for (Record r:list1) {
			 list.add(r.toString());
		 }
		 
		
		model.addAttribute("recordsList", list);
		return "publicRecords";
	}
	
	public static void main(String[] args) {
		DiaryService port = DiaryServiceConnection.getDairyServicePort();
		 List<Record> list1 = port.getAllPublicRecords();
		for (Record r: list1) {
			System.out.println(r);
		}
	}

}
