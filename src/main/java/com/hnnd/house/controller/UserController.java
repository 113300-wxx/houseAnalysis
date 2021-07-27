package com.hnnd.house.controller;

import com.hnnd.house.consts.HouseConst;
import com.hnnd.house.entity.User;
import com.hnnd.house.form.UserLoginForm;
import com.hnnd.house.service.IUserService;
import com.hnnd.house.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by jiafa
 * on 2021/7/26 19:24
 */
@RestController
@Slf4j
public class UserController {
    @Autowired
    private IUserService userService;
    
    @PostMapping("/user/login")
    public ResponseVo<User> login(@RequestBody UserLoginForm userLoginForm,
                                     HttpSession session) {
        System.out.println(userLoginForm.getUsername() + ":" + userLoginForm.getPassword());
        ResponseVo<User> userResponseVo = userService.login(userLoginForm.getUsername(), userLoginForm.getPassword());

        //设置Session
        session.setAttribute(HouseConst.CURRENT_USER, userResponseVo.getData());
        log.info("/login sessionId={}", session.getId());

        return userResponseVo;
    }
}
