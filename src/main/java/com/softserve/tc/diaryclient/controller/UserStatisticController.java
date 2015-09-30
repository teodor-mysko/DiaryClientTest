package com.softserve.tc.diaryclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.Gson;
import com.softserve.tc.diary.webservice.*;
import com.softserve.tc.diaryclient.dao.UserStatisticDAO;
import com.softserve.tc.diaryclient.entity.UserStatistic;
import com.softserve.tc.diaryclient.service.UserStatisticService;
import com.softserve.tc.diaryclient.webservice.diary.DiaryServiceConnection;

@Controller
public class UserStatisticController {
    @Autowired
    UserStatisticDAO userStatDAO;
    @Autowired
    UserStatisticService userStatisticService ;
    
    @RequestMapping(value = "/usersList")
    public String users(Model model) {
        List<UserStatistic> usersList = userStatDAO.getAll();
        String json = new Gson().toJson(usersList);
        model.addAttribute("usersList", json);
        return "users-statistic";
    }
    
    @RequestMapping(value = "/usersProfile")
    public String userProfile(@RequestParam(value = "nickName") String nickName,
            Model model) {
        UserStatistic us = userStatDAO.findByNickName(nickName);
        model.addAttribute("user", us);
        
        return "users-profile";
    }
    
}

