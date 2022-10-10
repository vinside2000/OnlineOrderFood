package cn.selforder.demo.api;


import cn.selforder.demo.order.Charge;
import cn.selforder.demo.order.Food;
import cn.selforder.demo.order.tea;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

@Api(value = "对奶茶的管理" ,description = "---")
public interface FoodApi {

    @ApiOperation("查询")
    public List<Food> init();

    @ApiOperation("查询所有种类的名称")
    public List<String> selectallattribute();

    @ApiOperation("根据奶茶类型查询所有奶茶")
    public List<Food> selectmilkbyattribute(String attribute);

}
