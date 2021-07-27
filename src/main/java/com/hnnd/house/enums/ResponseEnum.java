package com.hnnd.house.enums;

import lombok.Getter;

/**
 * Created by jiafa
 * on 2021/7/26 19:27
 */
@Getter
public enum ResponseEnum {
    ERROR(-1, "服务端错误"),

    SUCCESS(0, "成功"),

    NEED_LOGIN(10, "用户未登录, 请先登录"),

    USERNAME_OR_PASSWORD_ERROR(11, "用户名或密码错误"),
    ;

    Integer code;

    String desc;

    ResponseEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
