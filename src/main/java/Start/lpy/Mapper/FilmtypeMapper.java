package Start.lpy.Mapper;

import Start.lpy.pojo.Filmtype;
import Start.lpy.pojo.FilmtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmtypeMapper {
    int countByExample(FilmtypeExample example);

    int deleteByExample(FilmtypeExample example);

    int deleteByPrimaryKey(Integer ftid);

    int insert(Filmtype record);

    int insertSelective(Filmtype record);

    List<Filmtype> selectByExample(FilmtypeExample example);

    Filmtype selectByPrimaryKey(Integer ftid);

    int updateByExampleSelective(@Param("record") Filmtype record, @Param("example") FilmtypeExample example);

    int updateByExample(@Param("record") Filmtype record, @Param("example") FilmtypeExample example);

    int updateByPrimaryKeySelective(Filmtype record);

    int updateByPrimaryKey(Filmtype record);

    List<Filmtype> selectallname();

    Integer countfilmsintypes(Filmtype filmtype);

    List<Filmtype> selectByname(Filmtype filmtype);

    int getfilms(Integer ftid);
}