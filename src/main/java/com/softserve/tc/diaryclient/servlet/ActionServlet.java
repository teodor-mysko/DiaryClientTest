package com.softserve.tc.diaryclient.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.*;

import com.softserve.tc.diary.entity.Record;
import com.softserve.tc.diary.webservice.DiaryService;
import com.softserve.tc.diaryclient.webservice.diary.DiaryServiceConnection;

public class ActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ActionServlet() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String date=null;
		date = request.getParameter("selected");
		String userNickName = request.getUserPrincipal().getName();
		
		System.out.println(date + "!!!!!!!!!!!!!!!!!!!!!date");
		System.out.println(userNickName + "!!!!!!!!!!!!!!!!!!!!!NickName");
		DiaryService port = DiaryServiceConnection.getDairyServicePort();
		
		List<Record> recordsList = port.getAllRecordsByDate(userNickName, "2015-02-23 00:00:00");

		System.out.println(recordsList.toString());

	    response.getWriter().write(recordsList.toString());
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}