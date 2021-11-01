package com.github.multidatasourcedemo.service;

import com.github.multidatasourcedemo.dao.slave.CityDao;
import com.github.multidatasourcedemo.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @Autowired
    private CityDao cityDao;

    public City getCityById(Integer id) {
        return cityDao.getCityById(id);
    }
}
