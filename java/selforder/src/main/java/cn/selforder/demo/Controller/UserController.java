package cn.selforder.demo.Controller;

import cn.selforder.demo.Service.UserService;
import cn.selforder.demo.api.UserApi;
import cn.selforder.demo.model.response.ResponseResult;
import cn.selforder.demo.order.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController implements UserApi {

    @Autowired(required = false)
    UserService userService;

    @Override
    @PostMapping("/register")
    public ResponseResult register(@RequestBody Users users){
         return userService.register(users);
    }

    @Override
    @GetMapping("/finduser/{phone}")
    public Users findUserByPhone(@PathVariable("phone") String phone) {
            return userService.findUserByPhone(phone);
    }
}
