package Start.lpy.Service;

import Start.lpy.Mapper.UserhistoryMapper;
import Start.lpy.pojo.Userhistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:刘平远
 * @Date：2019/10/26 15:43
 * @verson 1.0
 **/
@Service
public class UserhistoryServiceImpl implements UserhistoryService {

    @Autowired
    UserhistoryMapper userhistoryMapper;

    @Override
    public int adduserhistory(Userhistory userhistory) {
        int i=userhistoryMapper.insertSelective(userhistory);
        return i;
    }

    @Override
    public List<Userhistory> queryhistory(Userhistory userhistory) {
        List<Userhistory> userhistoryList=  userhistoryMapper.selectByUid(userhistory.getUid());
        return userhistoryList;
    }
}
