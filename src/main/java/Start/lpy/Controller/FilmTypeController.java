package Start.lpy.Controller;

import Start.lpy.Service.FilmTypeService;
import Start.lpy.pojo.Film;
import Start.lpy.pojo.Filmtype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author:刘平远
 * @Date：2019/10/22 22:16
 * @verson 1.0
 **/
@Controller
@ResponseBody
@CrossOrigin
public class FilmTypeController {
    @Autowired
    FilmTypeService filmTypeService;

    //查找所有的电影类型信息
    @RequestMapping("/api/getfilmTypename")
    public List<Filmtype> name12(){
        List<Filmtype> filmtypeList=filmTypeService.findalltypename();
        return filmtypeList;
    }
    //添加新的电影类型
    @RequestMapping("/api/addnewfilmtype")
    public String name652as(@RequestBody Filmtype filmtype){
        System.out.println(filmtype);
        int i = filmTypeService.addnewfilmtype(filmtype);
        if (i==1){
            return "ok";
        }else {
            return "error";
        }
    }
    //删除电影类型
    @RequestMapping("/api/deletefilmtype")
    public String name56dsj(@RequestBody Filmtype filmtype){
        System.out.println(filmtype);
        //现根据类型id查询出该类型下是否还有电影，有不可以删除，没有可以删除
       // Integer sum=filmTypeService.countfilmsintype(filmtype);
        int count=filmTypeService.getcounts(filmtype.getFtid());
        System.out.println("类型下的影片数量为"+count);
        if (  count>0){
            return "error1";
        }else {
            int i =filmTypeService.deletetypebyftid(filmtype);
            if (i==1){
                return "ok";
            }
            else {
                return "error";
            }
        }
    }
    //修改电影类型
    @RequestMapping("/api/editfilmtype")
    public String name5dsa(@RequestBody Filmtype filmtype){
        System.out.println(filmtype);
        //先判断是否重名
        List<Filmtype> f1=filmTypeService.findtypenamebyname(filmtype);
        if (f1.size()<=1){
            int i=filmTypeService.editorfilmtype(filmtype);
            if (i==1){
                return "ok";
            }else {
                return "error";
            }
        }else {
            return "类型名称重复！无法添加";
        }

    }

}
