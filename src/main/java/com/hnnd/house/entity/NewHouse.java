package com.hnnd.house.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewHouse {

    @Id
    private int Id;

    private String districtName;

    private int averagePrice;

    private String houseType;

    private int minArea;

    private int maxArea;

    private String city;

    private String firstRegion;

    private String secondRegion;

    private int isElevator;

    private int isSubway;

    private String subwayName;

    private String subwayDistance;
}
