package com.hnnd.house.service;

import com.hnnd.house.entity.RentHouse;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentHouseService {
    //通过城市查询
    List<RentHouse> selectByCity(String city);

    //通过第一区查询
    List<RentHouse> selectByFRegion(String firstRegion);

    //通过小区名查询
    List<RentHouse> selectByDistrict(String distrName);

    void add(RentHouse rentHouse);

    void update(RentHouse rentHouse);

    void delete(RentHouse rentHouse);
}
