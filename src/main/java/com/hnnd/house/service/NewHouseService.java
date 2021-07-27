package com.hnnd.house.service;

import com.hnnd.house.entity.NewHouse;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface NewHouseService {

    //通过城市查询
    List<NewHouse> selectByCity(String city);

    //通过第一区查询
    List<NewHouse> selectByFRegion(String firstRegion);

    //通过小区名查询
    List<NewHouse> selectByDistrict(String distrName);

    void add(NewHouse newHouse);

    void update(NewHouse newHouse);

    void delete(NewHouse newHouse);
}
