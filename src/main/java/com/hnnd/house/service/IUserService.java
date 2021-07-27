package com.hnnd.house.service;

import com.hnnd.house.entity.User;
import com.hnnd.house.vo.ResponseVo;
import org.springframework.stereotype.Repository;

/**
 * Created by jiafa
 * on 2021/7/26 19:24
 */
@Repository
public interface IUserService {
    /**
     * 登录
     */
    ResponseVo<User> login(String username, String password);
}
