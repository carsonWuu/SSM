package practice.mybatis.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import practice.mybatis.bean.Greeting;
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
    //GET http://localhost:8080/home/user/123?name=carson 
    @RequestMapping(value = "/user/{id}",method=RequestMethod.GET)
    @ResponseBody
    public String user(@PathVariable(value="id") String id,@RequestParam(value="name") String name){
    	System.out.println("route:[home/user]");
        List<User> user = userMapper.findUserByName(name);
        System.out.println(user);
        return user.size()==0 ? null :user.toString();
    }
    
  //GET http://localhost:8080/home/user?name=carson 
    @RequestMapping(value = "/user",method=RequestMethod.GET)
    @ResponseBody
    public String user2(@RequestParam(value="name") String name){
    	System.out.println("route:[home/user]");
        List<User> user = userMapper.findUserByName(name);
        System.out.println(user);
        return user.size()==0 ? null :user.toString();
    }
    
    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }
}
