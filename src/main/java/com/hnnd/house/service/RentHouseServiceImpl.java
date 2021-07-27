package com.hnnd.house.service;

import com.hnnd.house.dao.RentHouseMapper;
import com.hnnd.house.entity.RentHouse;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RentHouseServiceImpl implements RentHouseService{

    private RentHouseMapper rentHouseMapper;

    @Override
    public List<RentHouse> selectByCity(String city) {
        return rentHouseMapper.selectByCity(city);
    }

    @Override
    public List<RentHouse> selectByFRegion(String firstRegion) {
        return rentHouseMapper.selectByFRegion(firstRegion);
    }

    @Override
    public List<RentHouse> selectByDistrict(String distrName) {
        return rentHouseMapper.selectByDistrict(distrName);
    }

    @Override
    public void add(RentHouse rentHouse) {
        rentHouseMapper.add(rentHouse);
    }

    @Override
    public void update(RentHouse rentHouse) {
        rentHouseMapper.update(rentHouse);
    }

    @Override
    public void delete(RentHouse rentHouse) {
        rentHouseMapper.delete(rentHouse);
    }
}
