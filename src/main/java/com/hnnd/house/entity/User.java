package com.hnnd.house.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by jiafa
 * on 2021/7/26 19:22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;

    private String username;

    private String password;
}
