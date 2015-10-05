package com.softserve.tc.diaryclient.controller;

import java.sql.Timestamp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.softserve.tc.diary.webservice.DiaryService;
import com.softserve.tc.diaryclient.webservice.diary.DiaryServiceConnection;

@Controller
public class AddRecordConteroller {

    @RequestMapping(value = "/addRecord", method = RequestMethod.POST)
    public String addRec(@RequestParam("title") String title, @RequestParam("text") String text,
            @RequestParam("status") String status, @RequestParam("nick") String nick) {
        System.out.println(title);
        System.out.println(text);
        System.out.println(status);
        System.out.println(nick);
        DiaryService port = DiaryServiceConnection.getDairyServicePort();
        boolean result = port.addRecord(nick, title, text, status);
        return "redirect:/publicRecords";
    }
    
    @RequestMapping(value = "/addRecord", method = RequestMethod.GET)
    public String addRec1() {
        
        return "addRecord";
    }
    
}
