package Start.lpy.Mapper;

import Start.lpy.pojo.Review;
import Start.lpy.pojo.ReviewExample;
import java.util.List;

import Start.lpy.pojo.UserFilmReview;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewMapper {
    int countByExample(ReviewExample example);

    int deleteByExample(ReviewExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(Review record);

    int insertSelective(Review record);

    List<Review> selectByExample(ReviewExample example);

    Review selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") Review record, @Param("example") ReviewExample example);

    int updateByExample(@Param("record") Review record, @Param("example") ReviewExample example);

    int updateByPrimaryKeySelective(Review record);

    int updateByPrimaryKey(Review record);

    List<UserFilmReview> selectInfobyname(String queryname);

    int deleteByReleationPrimaryKey(Integer ufrid);

    int getKeyvalue();

    int inserttorelation(UserFilmReview userFilmReview);

    List<UserFilmReview> selectreviewbyfid(UserFilmReview userFilmReview);

}