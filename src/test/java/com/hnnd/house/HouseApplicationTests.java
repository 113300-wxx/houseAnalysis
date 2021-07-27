package com.hnnd.house;

import com.hnnd.house.dao.NewHouseMapper;
import com.hnnd.house.dao.RankListMapper;
import com.hnnd.house.dao.RentHouseMapper;
import com.hnnd.house.dao.SecondHandMapper;
import com.hnnd.house.entity.NewHouse;
import com.hnnd.house.entity.RankList;
import com.hnnd.house.entity.RentHouse;
import com.hnnd.house.entity.SecondHand;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class HouseApplicationTests {

    @Autowired
    private SecondHandMapper secondHandMapper;

    @Autowired
    private RentHouseMapper rentHouseMapper;

    @Autowired
    private NewHouseMapper newHouseMapper;

    @Autowired
    private RankListMapper rankListMapper;

    @Test
    void SecondHandTest() {
        List<SecondHand> secondHandList = secondHandMapper.selectByCity("广州");
        int i = 0;
//        for(SecondHand sh : secondHandList){
//            if(i>10)
//                break;
//            i++;
//            System.out.println(sh);
//        List<SecondHand> secondHandList = secondHandMapper.selectByFRegion("天河");

//          List<SecondHand> secondHandList = secondHandMapper.selectByDistrict("万泰花园");
        SecondHand secondHand = new SecondHand();
        secondHand.setArea(100.0);
        secondHand.setAveragePrice(11119);
        secondHand.setPrice(200);
        secondHand.setName("xxxxx");
        secondHand.setCity("北京");
        secondHand.setHouseType("3室1厅");
        secondHand.setBuildYear("2010");
        secondHand.setDistrictName("xxx");
        secondHand.setIsElevator(1);
        secondHand.setIsSubway(2);
        secondHand.setId(1242);
//        secondHandMapper.add(secondHand);
        secondHandMapper.update(secondHand);
//        }
    }

    @Test
    void RentHouseTest(){
        List<RentHouse> rentHouses = rentHouseMapper.selectByCity("上海");
//        List<RentHouse> rentHouses = rentHouseMapper.selectByFRegion("徐汇");
//        List<RentHouse> rentHouses = rentHouseMapper.selectByDistrict("时代南湾");
        RentHouse rentHouse = new RentHouse();
        rentHouse.setArea(50.0);
        rentHouse.setCity("广州");
        rentHouse.setName("xxxxx");
        rentHouse.setPrice(1001);
        rentHouse.setHouseType("2室1厅");
        rentHouse.setId(4001);
//        rentHouseMapper.add(rentHouse);
//        rentHouseMapper.delete(rentHouse);
//        rentHouseMapper.update(rentHouse);
    }

    @Test
    void NewHouseMapper(){
//        List<NewHouse> newHouses = newHouseMapper.selectByCity("深圳");
//        List<NewHouse> newHouses = newHouseMapper.selectByFRegion("南山");
//        List<NewHouse> newHouses = newHouseMapper.selectByDistrict("灵川碧桂园");
    NewHouse n = new NewHouse();
    n.setDistrictName("ccc");
    n.setCity("ccc");
    n.setMaxArea(100);
    n.setMinArea(80);
    n.setHouseType("3室1厅");
    n.setAveragePrice(1000);
    n.setId(8825);
//    newHouseMapper.update(n);
    }

    @Test
    void RankListMapperTest(){
//        List<RankList> rankList = rankListMapper.selectByCity("广州");
//        List<RankList> rankList = rankListMapper.selectByFRegion("天河");
//        List<RankList> rankList = rankListMapper.selectByDistrict("时代珑星");
        RankList rankList = new RankList();
        rankList.setCity("广州");
        rankList.setMaxArea("100");
        rankList.setMinArea("85");
        rankList.setPrice("10000");
        rankList.setName("xxxx");
        rankList.setHouseType("2时1厅");
        rankList.setId(765);
//        rankListMapper.add(rankList);
        rankListMapper.update(rankList);
    }

}
