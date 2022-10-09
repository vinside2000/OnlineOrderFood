package cn.selforder.demo.api;


import cn.selforder.demo.model.response.ResponseResult;
import cn.selforder.demo.order.Users;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("用户接口")
public interface UserApi {

    @ApiOperation("用户注册, 传入用户信息，并往数据库中添加，无返回值")
    public ResponseResult register(Users users);

    @ApiOperation("查找个人信息  ，传入手机号，返回用户的个人信息")
    public Users findUserByPhone(String phone);

}
