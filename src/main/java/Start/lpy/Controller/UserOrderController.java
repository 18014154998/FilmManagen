package Start.lpy.Controller;

import Start.lpy.Service.UserOrderService;
import Start.lpy.Untils.Iftest;
import Start.lpy.pojo.UserOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author:刘平远
 * @Date：2019/10/28 9:31
 * @verson 1.0
 **/
@CrossOrigin
@ResponseBody
@Controller
public class UserOrderController {

    @Autowired
    UserOrderService userOrderService;

    //添加用户订单 还得用户余额需要扣钱！！！
    @RequestMapping("/api/adduserorder")
    public String name5jfuh(@RequestBody UserOrder userOrder){
        System.out.println(userOrder);
        int i=userOrderService.addorders(userOrder);
        Iftest iftest = new Iftest();
        String str=iftest.name4rfuir(i);
        return str;
    }
    //查询订单包括
    @RequestMapping("/api/queryorder")
    public List<UserOrder> name21r(@RequestBody UserOrder userOrder){
        System.out.println("订单信息："+userOrder);
        List<UserOrder> userOrders=userOrderService.queryoreder(userOrder);

        return userOrders;
    }



}
