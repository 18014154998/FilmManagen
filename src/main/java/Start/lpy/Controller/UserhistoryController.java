package Start.lpy.Controller;

import Start.lpy.Service.UserhistoryService;
import Start.lpy.pojo.Userhistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author:刘平远
 * @Date：2019/10/26 15:32
 * @verson 1.0
 **/
@Controller
@CrossOrigin
@ResponseBody
public class UserhistoryController {

    @Autowired
    UserhistoryService userhistoryService;

    @RequestMapping("/api/addhistory")
    public String name95k(@RequestBody Userhistory userhistory){
        System.out.println(userhistory);
        int i =userhistoryService.adduserhistory(userhistory);
        if (i==1){
            return "ok";
        }
        else {
            return "error";
        }
    }

    @RequestMapping("/api/queryhistory")
    public List<Userhistory> name57899(@RequestBody Userhistory userhistory){
        System.out.println("用户的id为："+userhistory.getUid());
        List<Userhistory> userhistoryList=userhistoryService.queryhistory(userhistory);
        System.out.println(userhistoryList);
        return userhistoryList;

    }

}
