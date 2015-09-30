package com.softserve.tc.diaryclient.service;

import org.springframework.stereotype.Repository;

import com.softserve.tc.diary.webservice.*;
import com.softserve.tc.diaryclient.webservice.diary.DiaryServiceConnection;

@Repository("userStatisticService")
public class UserStatisticService {
    
    public UserStatisticService(){
        //
    }
    public int getUserAmountOfRecords(String nickName) {
        DiaryService port = DiaryServiceConnection.getDairyServicePort();
        int numOfRecords = port.getUserAmountOfRecords(nickName);
        return numOfRecords;
    }
}
