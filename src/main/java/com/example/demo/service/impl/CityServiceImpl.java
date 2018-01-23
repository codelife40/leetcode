package com.example.demo.service.impl;

import com.example.demo.dao.CityDao;
import com.example.demo.service.CityService;
import com.example.demo.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by longmu on 13/01/2018.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public City findByName(String cityName) {
        return cityDao.findByName(cityName);
    }
}
