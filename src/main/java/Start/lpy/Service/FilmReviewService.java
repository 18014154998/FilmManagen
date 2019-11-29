package Start.lpy.Service;

import Start.lpy.pojo.UserFilmReview;

import java.util.List;

/**
 * @Author:刘平远
 * @Date：2019/10/24 16:11
 * @verson 1.0
 **/
public interface FilmReviewService {

    public List<UserFilmReview> findallreview(String queryname);

    public int deletereview(UserFilmReview userFilmReview);

    public  int addnewreview(UserFilmReview userFilmReview);

    public List<UserFilmReview> selectreviewbyfid(UserFilmReview userFilmReview);
}
