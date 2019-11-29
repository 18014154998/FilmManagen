package Start.lpy.Service;

import Start.lpy.Mapper.FilmtypeMapper;
import Start.lpy.pojo.Filmtype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:刘平远
 * @Date：2019/10/22 22:18
 * @verson 1.0
 **/
@Service
public class FilmTypeServiceImpl implements FilmTypeService {

    @Autowired
    FilmtypeMapper filmtypeMapper;

    @Override
    public List<Filmtype> findalltypename() {
        List<Filmtype> filmtypeList= filmtypeMapper.selectallname();
        return filmtypeList;
    }

    @Override
    public int addnewfilmtype(Filmtype filmtype) {
        int i =filmtypeMapper.insertSelective(filmtype);
        return i;
    }

    @Override
    public Integer countfilmsintype(Filmtype filmtype) {
        Integer i = filmtypeMapper.countfilmsintypes(filmtype);
        return i;
    }

    @Override
    public int deletetypebyftid(Filmtype filmtype) {
        int i =filmtypeMapper.deleteByPrimaryKey(filmtype.getFtid());
        return i;
    }

    @Override
    public List<Filmtype> findtypenamebyname(Filmtype filmtype) {
        List<Filmtype> filmtype1 = filmtypeMapper.selectByname(filmtype);

        return filmtype1;
    }

    @Override
    public int editorfilmtype(Filmtype filmtype) {
        int i=filmtypeMapper.updateByPrimaryKey(filmtype);
        return i;
    }

    @Override
    public int getcounts(Integer ftid) {
        int account=filmtypeMapper.getfilms(ftid);
        return account;
    }
}
