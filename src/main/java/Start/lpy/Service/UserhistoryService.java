package Start.lpy.Service;

import Start.lpy.pojo.Userhistory;

import java.util.List;

/**
 * @Author:刘平远
 * @Date：2019/10/26 15:43
 * @verson 1.0
 **/
public interface UserhistoryService {
     int adduserhistory(Userhistory userhistory);

    List<Userhistory> queryhistory(Userhistory userhistory);
}
