package cn.selforder.demo.Service;

import cn.selforder.demo.Dao.FoodMapper;
import cn.selforder.demo.Dao.FoodRepository;
import cn.selforder.demo.order.Charge;
import cn.selforder.demo.order.Food;
import cn.selforder.demo.order.tea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    @Autowired(required = false)
    FoodMapper foodMapper;
    @Autowired(required = false)
    FoodRepository foodRepository;


    public List<Food> selectall(){
        return foodMapper.init();
//        return asd.sl();
    }

    public void addmilk(tea tea){
        foodRepository.save(tea);
    }

    public List<String> selectallattribute(){
        return foodMapper.selectallattribute();
    }

    public List<Food> selectmilkbyattribute(String attribute){

        if(attribute.equals("1")){
            return foodMapper.selectmilkByDis("1");
        }
        return foodMapper.selectmilkByattribute(attribute);
    }


    public void deletebyteaid(String teaid){
        foodRepository.deleteByteaid(teaid);
    }
}
