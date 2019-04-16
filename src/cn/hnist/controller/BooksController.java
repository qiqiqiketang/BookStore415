package cn.hnist.controller;

import cn.hnist.pojo.BookType;
import cn.hnist.pojo.Books;
import cn.hnist.pojo.vo.CategoryVo;
import cn.hnist.service.BookTypeService;
import cn.hnist.service.BooksService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
@RequestMapping("/book")
public class BooksController {
    @Autowired
    private BooksService booksService;
    @Autowired
    private BookTypeService bookTypeService;


    private Logger logger = Logger.getLogger(BooksController.class);

    @RequestMapping("/index")
    public String index(){
        return "index";
    }




    //通过前台传过来的id查询单独的商品并跳转到books.jsp页面
    @RequestMapping("/byid")
    public String byid(HttpServletRequest request){
        List<BookType> bookTypeList=bookTypeService.allBookType();
        int id=Integer.parseInt(request.getParameter("id"));
        Books books=new Books();
        try {
            books=booksService.byIdBooks(id);
            logger.debug("books : "+books);

        } catch (Exception e) {
            e.printStackTrace();
        }
       request.setAttribute("books",books);
        request.setAttribute("bookTypeList",bookTypeList);
        return "books";

    }
}
