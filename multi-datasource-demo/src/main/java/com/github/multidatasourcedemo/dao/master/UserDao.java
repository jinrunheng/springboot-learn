package com.github.multidatasourcedemo.dao.master;

import com.github.multidatasourcedemo.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    User getUserById(Integer id);
}
