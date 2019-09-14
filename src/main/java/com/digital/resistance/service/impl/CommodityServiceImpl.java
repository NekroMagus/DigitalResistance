package com.digital.resistance.service.impl;

import com.digital.resistance.dao.CommodityDao;
import com.digital.resistance.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityDao commodityDao;

}
