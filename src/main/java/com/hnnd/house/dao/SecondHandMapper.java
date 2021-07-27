package com.hnnd.house.dao;

import com.hnnd.house.entity.SecondHand;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SecondHandMapper {

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
