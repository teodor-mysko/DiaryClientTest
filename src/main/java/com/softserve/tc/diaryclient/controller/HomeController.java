package com.softserve.tc.diaryclient.controller;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import com.softserve.tc.diary.entity.Record;
import com.softserve.tc.diary.webservice.DiaryService;
import com.softserve.tc.diaryclient.webservice.diary.DiaryServiceConnection;

@Controller
public class HomeController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "home";
	}

	@RequestMapping(value = "/getRecordsByDay", method = RequestMethod.GET)
	public @ResponseBody String getRecordsByDay(@RequestParam("selected") String date, HttpServletRequest request) {

		String userNickName = request.getUserPrincipal().getName();
		DiaryService port = DiaryServiceConnection.getDairyServicePort();
		List<Record> recordsList = port.getAllRecordsByDate(userNickName, date + " 00:00:00");

		if (recordsList.size() == 0) {
			return new Gson().toJson("< no notes >");
		}

		return new Gson().toJson(recordsList.toString());
	}
}