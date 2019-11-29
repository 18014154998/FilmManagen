package Start.lpy.Controller;

import Start.lpy.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:刘平远
 * @Date：2019/10/10 14:11
 * @verson 1.0
 **/
@Controller
@ResponseBody
@CrossOrigin
public class TestController {


@RequestMapping("api/test")
public String name565(@RequestBody User user){
    System.out.println(user.toString());

    return "200";
}

    @RequestMapping("hellospringboot")
    public String nam1(){
        return "hello springboot";
    }


}
