package Start.lpy.Service;

import Start.lpy.Mapper.ReviewMapper;
import Start.lpy.pojo.UserFilmReview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author:刘平远
 * @Date：2019/10/24 16:12
 * @verson 1.0
 **/
@Service
public class FilmReviewServiceImpl implements FilmReviewService {

    @Autowired
    ReviewMapper reviewMapper;

    @Override
    public List<UserFilmReview> findallreview(String queryname) {
        List<UserFilmReview> list= reviewMapper.selectInfobyname(queryname);
        return list;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int deletereview(UserFilmReview userFilmReview) {
        // 1 删除关联表里的关联信息
        int j=reviewMapper.deleteByReleationPrimaryKey(userFilmReview.getUfrid());
        //删除影评  2即删除影评表里面影评信息，
        int i = reviewMapper.deleteByPrimaryKey(userFilmReview.getRid());
        return i;
    }
    @Transactional(rollbackFor = Exception.class)
    @Override
    public int addnewreview(UserFilmReview userFilmReview) {
        int i=reviewMapper.insert(userFilmReview.getReview());
        //获取刚刚插入的主键
        int key=reviewMapper.getKeyvalue();
        System.out.println("影评的主键为"+key);
        int userid=userFilmReview.getUser().getUid();
        String filmid=userFilmReview.getFilm().getFid();
        userFilmReview.setFid(filmid);
        userFilmReview.setUid(userid);
        userFilmReview.setRid(key);

        int j=reviewMapper.inserttorelation(userFilmReview);
        return j;
    }

    @Override
    public List<UserFilmReview> selectreviewbyfid(UserFilmReview userFilmReview) {
        List<UserFilmReview> list=reviewMapper.selectreviewbyfid(userFilmReview);
        return list;

    }
}
