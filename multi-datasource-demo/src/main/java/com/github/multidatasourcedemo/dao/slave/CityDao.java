package com.github.multidatasourcedemo.dao.slave;

import com.github.multidatasourcedemo.domain.City;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CityDao {
    City getCityById(Integer id);
}
