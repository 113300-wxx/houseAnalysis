package com.hnnd.house.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by jiafa
 * on 2021/7/26 19:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginForm {
    private String username;

    private String password;
}
