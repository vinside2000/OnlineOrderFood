package cn.selforder.demo.Controller;

import cn.selforder.demo.Service.FoodService;
import cn.selforder.demo.api.FoodApi;
import cn.selforder.demo.order.Charge;
import cn.selforder.demo.order.Food;
import cn.selforder.demo.order.tea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
@CrossOrigin
public class FoodController implements FoodApi {

    @Autowired
    FoodService foodService;

    @Override
    @GetMapping("/selectall")
    public List<Food> init(){
        return foodService.selectall();
    }

    @Override
    @GetMapping("/selectallattribute")
    public List<String> selectallattribute(){
        return foodService.selectallattribute();
    }

    @Override
    @GetMapping("/selectmilkbyattribute/{attribute}")
    public List<Food> selectmilkbyattribute(@PathVariable("attribute") String attribute){
        return foodService.selectmilkbyattribute(attribute);
    }


}
