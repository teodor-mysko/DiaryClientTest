package com.softserve.tc.diaryclient.dao.impl;

import org.springframework.stereotype.Repository;

import com.softserve.tc.diaryclient.dao.SystemStatisticDAO;
import com.softserve.tc.diaryclient.entity.SystemStatistic;

@Repository("systemStatisticDAO")
public class SystemStatisticDAOImpl extends BaseDAOImpl<SystemStatistic>
        implements SystemStatisticDAO {
        
    public SystemStatisticDAOImpl() {
        super(SystemStatistic.class);
    }
}
