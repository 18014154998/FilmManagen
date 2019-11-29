package Start.lpy.Service;

import Start.lpy.Mapper.OrderMapper;
import Start.lpy.Mapper.UserMapper;
import Start.lpy.Mapper.UserOrderMapper;
import Start.lpy.pojo.Order;
import Start.lpy.pojo.UserOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author:刘平远
 * @Date：2019/10/28 9:33
 * @verson 1.0
 **/
@Service
public class UserOrderServiceImpl implements  UserOrderService {

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    UserOrderMapper userOrderMapper;
    @Autowired
    UserMapper userMapper;


    @Transactional(rollbackFor = Exception.class)
    @Override
    public int addorders(UserOrder userOrder) {
        //先插入订单表
        //int i=orderMapper.insertonlyPrice(userOrder.getOrderPrice());
        int i=orderMapper.insertonlyPrice1(userOrder.getOrderPrice());
        //在获取插入的主键
        int keyvalue=orderMapper.getkeyvalue();
        int j=0;
        int k=0;
        if (i==1&&keyvalue!=0){
            //在将主键插入用户订单关系表
            userOrder.setOid(keyvalue);
            j=userOrderMapper.insertSelective(userOrder);
            System.out.println(userOrder);
            //用户扣除购买电影的钱
            k=userMapper.updateuserSurplus(userOrder.getUid(),userOrder.getOrderPrice());
        }
        return k;
    }

    @Override
    public List<UserOrder> queryoreder(UserOrder userOrder) {
        List<UserOrder> userOrders= userOrderMapper.selectbyuid(userOrder);

        return userOrders;
    }
}
