package com.hnnd.house.dao;

import com.hnnd.house.entity.RankList;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RankListMapper {

    //通过城市查询
    List<RankList> selectByCity(String city);

    //通过第一区查询
    List<RankList> selectByFRegion(String firstRegion);

    //通过小区名查询
    List<RankList> selectByDistrict(String distrName);

    void add(RankList rankList);

    void update(RankList rankList);

    void delete(RankList rankList);
}
