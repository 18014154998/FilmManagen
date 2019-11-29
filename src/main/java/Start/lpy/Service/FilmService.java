package Start.lpy.Service;

import Start.lpy.pojo.Film;

import java.util.List;

/**
 * @Author:刘平远
 * @Date：2019/10/18 10:53
 * @verson 1.0
 **/
public interface FilmService {
    //获取电影信息首页展示的
    public List<Film> getFilmInfo();

    public List<Film> gethotFilmInfo();

    public List<Film> getFilmInfobynameoractors(Film film);

    public int addClickedCountsByid(Film film);
    //查询根据电影名
    public List<Film> queryfilmsbyfilmname(Film film);
    //添加新的电影
    int addnewfilm(Film film);

    public List<Film> getFilmInfocharge();

    public int updatefilminfo(Film film);
}
