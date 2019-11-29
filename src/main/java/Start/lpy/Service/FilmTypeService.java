package Start.lpy.Service;

import Start.lpy.pojo.Filmtype;

import java.util.List;

/**
 * @Author:刘平远
 * @Date：2019/10/22 22:18
 * @verson 1.0
 **/
public interface FilmTypeService {

    public List<Filmtype> findalltypename();

    public int addnewfilmtype(Filmtype filmtype);
    //计算该类型下有多少的电影
    public Integer countfilmsintype(Filmtype filmtype);
    //删除
    int deletetypebyftid(Filmtype filmtype);
    //判断重名
    public List<Filmtype> findtypenamebyname(Filmtype filmtype);

    public int editorfilmtype(Filmtype filmtype);

    public int getcounts(Integer ftid);
}
