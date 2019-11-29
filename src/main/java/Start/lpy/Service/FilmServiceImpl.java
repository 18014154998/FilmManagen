package Start.lpy.Service;

import Start.lpy.Mapper.FilmMapper;
import Start.lpy.pojo.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author:刘平远
 * @Date：2019/10/18 10:54
 * @verson 1.0
 **/
@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    FilmMapper filmMapper;

    @Override
    public List<Film> getFilmInfo() {
        List<Film> filmList =filmMapper.selectAllfilm();
        return filmList;
    }

    @Override
    public List<Film> gethotFilmInfo() {
        List<Film> filmList =filmMapper.selecthotfilm();
        return filmList;
    }

    @Override
    public List<Film> getFilmInfobynameoractors(Film film) {
        List<Film>  films=filmMapper.selectByNameorActors(film);
        return films;
    }

    @Override
    public int addClickedCountsByid(Film film) {
        int i=filmMapper.updateByPrimaryKey(film);
        return i;
    }
    //查询根据电影名
    @Override
    public List<Film> queryfilmsbyfilmname(Film film) {
        List<Film>  films=filmMapper.selectfilminfoByName(film);
        return films;
    }
    @Transactional(rollbackFor = Exception.class)
    @Override
    public int addnewfilm(Film film) {
        int i=filmMapper.insertfilmtypebind(film);
        int j=filmMapper.insertSelective(film);
        if (i==j){
            return i;
        }else {
            return 0;
        }
    }
    @Override
    public List<Film> getFilmInfocharge() {
        List<Film> filmList =filmMapper.selectAllfilmCharge();
        return filmList;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int updatefilminfo(Film film) {
        //先判断 先修改类型，
        if (null==film.getFilmtype().getFtid()){
            if ("".equals(film.getFilmPicture())||null==film.getFilmPicture()){
                //只是修改了价格
                int k=filmMapper.updatepricebykey(film);
                return  k;
            }else {
                int i=filmMapper.updatefilmbykey(film);
                return  i;
            }
        }else {
            if ("".equals(film.getFilmPicture())||null==film.getFilmPicture()){
                int k=filmMapper.updatefilmtypebyfid(film);
                //只是修改了价格
                int i=filmMapper.updatepricebykey(film);
                return  i;
            }else {
                int k=filmMapper.updatefilmtypebyfid(film);
                int i=filmMapper.updatefilmbykey(film);
                return  i;
            }
        }
    }
}
