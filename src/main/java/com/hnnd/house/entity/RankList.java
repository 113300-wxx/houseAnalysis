package com.hnnd.house.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RankList {

    @Id
    private int Id;

    private String name;

    //每平米价格 / 总价，每平米价格那一列有3、4位数字的是总价
    private String price;

    private String houseType;

    private String minArea;

    private String maxArea;

    private String city;

    private String firstRegion;


}
