package Start.lpy.Mapper;

import Start.lpy.pojo.UserFilmReview;
import Start.lpy.pojo.UserFilmReviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFilmReviewMapper {
    int countByExample(UserFilmReviewExample example);

    int deleteByExample(UserFilmReviewExample example);

    int deleteByPrimaryKey(Integer ufrid);

    int insert(UserFilmReview record);

    int insertSelective(UserFilmReview record);

    List<UserFilmReview> selectByExample(UserFilmReviewExample example);

    UserFilmReview selectByPrimaryKey(Integer ufrid);

    int updateByExampleSelective(@Param("record") UserFilmReview record, @Param("example") UserFilmReviewExample example);

    int updateByExample(@Param("record") UserFilmReview record, @Param("example") UserFilmReviewExample example);

    int updateByPrimaryKeySelective(UserFilmReview record);

    int updateByPrimaryKey(UserFilmReview record);
}