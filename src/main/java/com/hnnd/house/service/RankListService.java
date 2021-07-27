package com.hnnd.house.service;

import com.hnnd.house.entity.RankList;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RankListService {
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
