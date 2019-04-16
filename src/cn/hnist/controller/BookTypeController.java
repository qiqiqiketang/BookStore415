package cn.hnist.controller;

import cn.hnist.pojo.vo.CategoryVo;
import cn.hnist.service.BookTypeService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/bookType")
public class BookTypeController {
    @Autowired
    private BookTypeService bookTypeService;

    @RequestMapping("/")
    public String main(){
        return "index";
    }


    //查询出首页的一级分类下的6个商品
    @RequestMapping("/books")
    public String books(HttpServletRequest request){
        List<CategoryVo> categoryVoList=bookTypeService.getAllCategoryList();
        request.setAttribute("categoryVoList",categoryVoList);
        return "index";
    }


}
