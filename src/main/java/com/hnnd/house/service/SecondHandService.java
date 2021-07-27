package com.hnnd.house.service;

import com.hnnd.house.entity.SecondHand;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecondHandService {
    //通过城市查询
    List<SecondHand> selectByCity(String city);

    //通过第一区查询
    List<SecondHand> selectByFRegion(String firstRegion);

    //通过小区名查询
    List<SecondHand> selectByDistrict(String distrName);

    void add(SecondHand secondHand);

    void update(SecondHand secondHand);

    void delete(SecondHand secondHand);

}
