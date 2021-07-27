package com.hnnd.house.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RentHouse {
    @Id
    private int Id;

    private String name;

    private int price;

    private String houseType;

    private double area;

    private String city;

    private String firstRegion;

    private String secondRegion;

    private String districtName;

    private int isElevator;

    private int isSubway;

    private int isKitchen;

    private String subwayName;

    private String subwayDistance;

}
