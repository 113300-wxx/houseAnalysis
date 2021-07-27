package com.hnnd.house.service;

import com.hnnd.house.dao.RankListMapper;
import com.hnnd.house.entity.RankList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RankListServiceImpl implements  RankListService{

    @Autowired
    private RankListMapper rankListMapper;

    @Override
    public List<RankList> selectByCity(String city) {
        return rankListMapper.selectByCity(city);
    }

    @Override
    public List<RankList> selectByFRegion(String firstRegion) {
        return rankListMapper.selectByFRegion(firstRegion);
    }

    @Override
    public List<RankList> selectByDistrict(String distrName) {
        return rankListMapper.selectByDistrict(distrName);
    }

    @Override
    public void add(RankList rankList) {
        rankListMapper.add(rankList);
    }

    @Override
    public void update(RankList rankList) {
        rankListMapper.update(rankList);
    }

    @Override
    public void delete(RankList rankList) {
        rankListMapper.delete(rankList);
    }
}
