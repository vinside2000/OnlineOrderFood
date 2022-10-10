package cn.selforder.demo.Dao;

import cn.selforder.demo.order.Charge;
import cn.selforder.demo.order.Food;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoodMapper {

    public List<Food> init();

    public void addmilk(Food food);


    public List<String> selectallattribute();

    List<Food> selectmilkByattribute(String attribute);

    List<Food> selectmilkByDis(String Discount);
}
