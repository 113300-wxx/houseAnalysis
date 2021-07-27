package com.hnnd.house;

import com.hnnd.house.consts.HouseConst;
import com.hnnd.house.entity.User;
import com.hnnd.house.exception.UserLoginException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by jiafa
 * on 2021/7/26 19:36
 */
@Slf4j
public class UserLoginIntercepter implements HandlerInterceptor {

    /**
     * true 表示继续流程，false表示中断
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("preHandle...");
        User TUser = (com.hnnd.house.entity.User) request.getSession().getAttribute(HouseConst.CURRENT_USER);
        if (TUser == null) {
            log.info("user=null");
            throw new UserLoginException();

        }
        return true;
    }
}
