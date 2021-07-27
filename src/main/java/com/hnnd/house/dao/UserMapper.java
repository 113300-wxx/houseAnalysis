package com.hnnd.house.dao;

import com.hnnd.house.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by jiafa
 * on 2021/7/26 19:23
 */
@Mapper
public interface UserMapper {
    User selectByUsername(String username);
}
