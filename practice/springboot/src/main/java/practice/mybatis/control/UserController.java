package practice.mybatis.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import practice.mybatis.bean.User;
import practice.mybatis.mapper.UserMapper;
/**
 * 
 * @author wcs
 *
 */
@RestController
@RequestMapping("/home")
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/user")
    @ResponseBody
    public String user(){
    	System.out.println("route:[home/user]");
        List<User> user = userMapper.findUserByName("王伟");
        System.out.println(user);
        return user.get(0).getName()+"-----"+user.get(0).getAge();
    }
}
