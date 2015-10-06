package com.softserve.tc.diaryclient.controller;

import java.sql.Timestamp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.softserve.tc.diary.entity.Record;
import com.softserve.tc.diary.entity.User;
import com.softserve.tc.diary.webservice.DiaryService;
import com.softserve.tc.diaryclient.webservice.diary.DiaryServiceConnection;

@Controller
public class AddRecordConteroller {

	@RequestMapping(value = "/addRecord", method = RequestMethod.POST)
	public String addRecordPost(@RequestParam("title") String title, @RequestParam("text") String text,
			@RequestParam("status") String status, @RequestParam("nick") String nick, Model model) {
		DiaryService port = DiaryServiceConnection.getDairyServicePort();
		Record record = port.addRecord(nick, title, text, status);
		model.addAttribute("record", record);
		return "recordsDescription";
	}
	
	@RequestMapping(value = "/addRecord", method = RequestMethod.GET)
	public String addRecordGet() {

		return "addRecord";
	}
	
}
