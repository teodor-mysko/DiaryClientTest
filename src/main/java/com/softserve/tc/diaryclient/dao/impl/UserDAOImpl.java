package com.softserve.tc.diaryclient.dao.impl;

import com.softserve.tc.diary.webservice.DiaryService;
import com.softserve.tc.diaryclient.entity.User;
import com.softserve.tc.diaryclient.webservice.diary.DiaryServiceConnection;

public class UserDAOImpl {

    public static User findByUserName(String username) {
        DiaryService port = DiaryServiceConnection.getDairyServicePort();
        com.softserve.tc.diary.entity.User user = port.getUserByNickName(username);
        return new User(user.getNick_name(),user.getPassword(),user.getRole());
    }
}
