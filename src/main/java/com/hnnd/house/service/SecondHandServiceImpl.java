package com.hnnd.house.service;

import com.hnnd.house.dao.SecondHandMapper;
import com.hnnd.house.entity.SecondHand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SecondHandServiceImpl implements  SecondHandService{

    @Autowired
    private SecondHandMapper secondHandMapper;

    @Override
    public List<SecondHand> selectByCity(String city) {
        return secondHandMapper.selectByCity(city);
    }

    @Override
    public List<SecondHand> selectByFRegion(String firstRegion) {
        return secondHandMapper.selectByFRegion(firstRegion);
    }

    @Override
    public List<SecondHand> selectByDistrict(String distrName) {
        return secondHandMapper.selectByDistrict(distrName);
    }

    @Override
    public void add(SecondHand secondHand) {
        secondHandMapper.add(secondHand);
    }

    @Override
    public void update(SecondHand secondHand) {
        secondHandMapper.update(secondHand);
    }

    @Override
    public void delete(SecondHand secondHand) {
        secondHandMapper.delete(secondHand);
    }
}
