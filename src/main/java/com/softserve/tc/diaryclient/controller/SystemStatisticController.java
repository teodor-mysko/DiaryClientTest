package com.softserve.tc.diaryclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.softserve.tc.diaryclient.dao.SystemStatisticDAO;
import com.softserve.tc.diaryclient.entity.SystemStatistic;
import com.softserve.tc.diaryclient.entity.UserStatistic;

@Controller
public class SystemStatisticController {
    @Autowired
    SystemStatisticDAO systemStatDAO;
    
    @RequestMapping(value = "/systemStatistic")
    public String systemStatistic(Model model) {
        List<SystemStatistic> systemStatisticList = systemStatDAO.getAll();
        model.addAttribute("systemStatisticList", systemStatisticList);
        
        return "SystemStatistic";
    }
}