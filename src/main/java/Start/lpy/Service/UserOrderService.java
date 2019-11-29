package Start.lpy.Service;

import Start.lpy.pojo.UserOrder;

import java.util.List;

/**
 * @Author:刘平远
 * @Date：2019/10/28 9:33
 * @verson 1.0
 **/
public interface UserOrderService {
    public int addorders(UserOrder userOrder);

    public List<UserOrder> queryoreder(UserOrder userOrder);
}
