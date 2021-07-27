package com.hnnd.house.service;

import com.hnnd.house.dao.NewHouseMapper;
import com.hnnd.house.entity.NewHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NewHouseServiceImpl implements NewHouseService {

    @Autowired
    private NewHouseMapper newHouseMapper;

    @Override
    public List<NewHouse> selectByCity(String city) {
        return newHouseMapper.selectByCity(city);
    }

    @Override
    public List<NewHouse> selectByFRegion(String firstRegion) {
        return newHouseMapper.selectByFRegion(firstRegion);
    }

    @Override
    public List<NewHouse> selectByDistrict(String distrName) {
        return newHouseMapper.selectByDistrict(distrName);
    }

    @Override
    public void add(NewHouse newHouse) {
        newHouseMapper.add(newHouse);
    }

    @Override
    public void update(NewHouse newHouse) {
        newHouseMapper.update(newHouse);
    }

    @Override
    public void delete(NewHouse newHouse) {
        newHouseMapper.delete(newHouse);
    }
}
