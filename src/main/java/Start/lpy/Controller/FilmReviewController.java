package Start.lpy.Controller;

import Start.lpy.Service.FilmReviewService;
import Start.lpy.Service.FilmService;
import Start.lpy.pojo.Review;
import Start.lpy.pojo.UserFilmReview;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author:刘平远
 * @Date：2019/10/24 15:00
 * @verson 1.0
 **/
@CrossOrigin
@ResponseBody
@Controller
public class FilmReviewController {

    @Autowired
    FilmReviewService filmReviewService;
    //根据条件查询影评
    @RequestMapping("/api/getreviewinfo")
    public List<UserFilmReview> name54uyhas(@RequestBody String queryname){
        System.out.println("queryname:   "+queryname );
        String newq=queryname.substring(queryname.indexOf(":")+2,queryname.indexOf("}")-1);
        System.out.println(newq);
        if ("".equals(newq)){
            List<UserFilmReview> list=filmReviewService.findallreview(null);
            return list;
        }else {
            List<UserFilmReview> list=filmReviewService.findallreview(newq);
            return list;
        }
    }
    //删除影评  即删除影评表里面影评信息，与关联表里的关联信息
    @RequestMapping("/api/deletereview")
    public String name7jx(@RequestBody UserFilmReview userFilmReview){
        System.out.println(userFilmReview);
        int i=filmReviewService.deletereview(userFilmReview);
        if (i>0){
            return "ok";
        }
        else {
            return "error";
        }
    }
    //添加影评 先添加到影评表获取添加的主键，在添加到关联表里面
    @RequestMapping("/api/addreview")
    public String name59jkdh(@RequestBody UserFilmReview userFilmReview){
        //主要参数有uid，fid，电影评论，电影评分
      //  System.out.println( userFilmReview);
        int i = filmReviewService.addnewreview(userFilmReview);
        if (i==1){
            return "ok";
        }else {
            return "error";
        }
    }

    //点击到影片详细信息，同时会加载影评
    @RequestMapping("/api/getreview")
    public List<UserFilmReview> name1fjio(@RequestBody UserFilmReview userFilmReview){
        //主要就是根据fid来查询影评
        List<UserFilmReview> list=filmReviewService.selectreviewbyfid(userFilmReview);
        System.out.println(userFilmReview);
        return list;
    }


}
