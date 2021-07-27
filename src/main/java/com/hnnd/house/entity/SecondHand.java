package com.hnnd.house.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecondHand {

    @Id
    private int Id;

    private String name;

    private int price;

    private int averagePrice;

    private String houseType;

    private double area;

    private String city;

    private String firstRegion;

    private  String secondRegion;

    private String districtName;

    private int isElevator;

    private int isSubway;

    private int subwayDistance;

    private String subwayName;

    private String buildYear;


}
