package Start.lpy.Mapper;

import Start.lpy.pojo.Film;
import Start.lpy.pojo.FilmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmMapper {
    int countByExample(FilmExample example);

    int deleteByExample(FilmExample example);

    int deleteByPrimaryKey(String fid);

    int insert(Film record);

    int insertSelective(Film record);

    List<Film> selectByExample(FilmExample example);

    Film selectByPrimaryKey(String fid);

    int updateByExampleSelective(@Param("record") Film record, @Param("example") FilmExample example);

    int updateByExample(@Param("record") Film record, @Param("example") FilmExample example);

    int updateByPrimaryKeySelective(Film record);

    int updateByPrimaryKey(Film record);

    List<Film> selectAllfilm();

    List<Film> selecthotfilm();

    List<Film> selectByNameorActors(Film film);

    List<Film> selectfilminfoByName(Film film);

    int insertfilmtypebind(Film film);

    List<Film> selectAllfilmCharge();

    int updatepricebykey(Film film);

    int updatefilmbykey(Film film);

    int updatefilmtypebyfid(Film film);
}