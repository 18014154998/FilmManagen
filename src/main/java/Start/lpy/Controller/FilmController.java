package Start.lpy.Controller;

import Start.lpy.Service.FilmService;
import Start.lpy.pojo.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @Author:刘平远
 * @Date：2019/10/18 10:27
 * @verson 1.0
 **/
@Controller
@ResponseBody
@CrossOrigin
public class FilmController {

    @Autowired
    FilmService filmService;

    //最简单的免费电影陈列电影信息
    @RequestMapping("/api/listfilms")
    public List<Film> name123(){
        List<Film> filmList= filmService.getFilmInfo();
        System.out.println("进入首页了");
        return filmList;
    }
    //收费陈列电影信息
    @RequestMapping("/api/listfilmsCharge")
    public List<Film> name123xjhna(){
        List<Film> filmList= filmService.getFilmInfocharge();
        System.out.println("进入首页了");
        return filmList;
    }

    ////最热电影排行
    @RequestMapping("/api/hotfilms")
    public List<Film> name1231(){
        List<Film> filmList= filmService.gethotFilmInfo();

        System.out.println("进入首页了，最热电影排行");
        return filmList;
    }
    //电影搜索下拉框显示后台数据
    @RequestMapping("/api/getfilmname")
    public List<Film> name232313(@RequestBody Film film){
        List<Film> films=filmService.getFilmInfobynameoractors(film);
        return films;
    }
    //点击一次，电影的点击量增加一次
    @RequestMapping("/api/addClickedCountsByid")
    public String name2123(@RequestBody Film film){
        int i=filmService.addClickedCountsByid(film);
        if (i==1){
            return "ok";
        }
        else {
            return "error";
        }
    }
    //管理员查询电影列表，包括类型名称
    @RequestMapping("/api/findfilminfo")
    public List<Film> name212(@RequestBody Film film){
        System.out.println("queryFilm name is "+ film.getFilmName());
        List<Film> filmList=filmService.queryfilmsbyfilmname(film);
        System.out.println(filmList);
        return filmList;
    }

    //添加电影类型包括电影信息 和 电影类型信息
    @RequestMapping("/api/addnewfilm")
    public String name3232(@RequestBody Film film){
        System.out.println(film);
        int i=filmService.addnewfilm(film);
        if (i==1){
            return "ok";
        }
        else {
            return "error";
        }
    }


    //修改电影信息，包括电影图片 以及电影的类型
    //电影图片需要文件上传，而电影类型需要修改另一张表。
    @RequestMapping("/api/editFilminfo")
    public String name2122(@RequestBody Film film, HttpServletRequest request){
        System.out.println("film"+film);
        int i =filmService.updatefilminfo(film);
        if (i>0){
            return "ok";
        }else {
            return "error";
        }

    }

    @PostMapping("/api/photoupload")
    @ResponseBody
    public String uploadImage(@RequestParam("file") MultipartFile upload, HttpServletResponse response) throws Exception{
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control","no-cache");
        String imageName = upload.getOriginalFilename();
        System.out.println("文件名称为："+imageName);
        String imageRoot = "D:\\Intellig Idea Workspace\\springbootFilm\\src\\main\\resources\\static\\image\\";
        //String imageStr = imageName.substring(imageName.lastIndexOf("=")+1,imageName.length());
        //6.文件地址组装
        upload.transferTo(new File(imageRoot,imageName));

        String  address="http://localhost:8080/image/"+imageName;
        return address;
    }


    @PostMapping("/api/photoupload11")
    @ResponseBody
    public String name(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //1 获取文本信息
       /* String  uname=request.getParameter("uname");
        System.out.println("用户名为"+uname);*/
        //2 获取文件 传入表单的name信息
        Part imagePart=request.getPart("imgfile");
        //3 根据请求头信息 处理文件名
        String imagename=imagePart.getHeader("content-disposition");

        System.out.println(imagename);//form-data; name="imgfile"; filename="自来也.png"
        System.out.println("boolean + "+imagename.contains("."));
        //4 设置上传路径
        String imageroot="D:\\Intellig Idea Workspace\\springbootFilm\\src\\main\\resources\\static\\image";
        //5 文件可能重名，所以文件名重构
        //获取后缀名
        String newimgname=imagename.substring(imagename.lastIndexOf("=")+2,imagename.length()-1);
        System.out.println("文件后缀"+newimgname);
        //将文件名称出入数据库
        //String imagefilename=UUID.randomUUID().toString()+newimgname;
        String imagefilename=newimgname;

        System.out.println("重构后的name："+imagefilename);
        //6 文件地址的组装
        String imagefilePath=imageroot+"\\"+imagefilename;
        System.out.println(imagefilePath);
        String  address="http://localhost:8080/image/"+imagefilename;
        System.out.println(address);
        //7 上传
        try {
            imagePart.write(imagefilePath);
            System.out.println("上传成功！");
        }catch (Exception e){
            System.out.println("上传失败");
        }
        return address;
    }


}
