package cn.hnist.controller;

import cn.hnist.pojo.Books;
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

    private Logger logger = Logger.getLogger(BooksController.class);
    @RequestMapping("/byid")
    public String byid(HttpServletRequest request ){
        //int bookid=Integer.parseInt(request.getParameter("bookid"));
        int id=1;
        Books books=new Books();
        try {
            books=booksService.byIdBooks(id);
            logger.debug("books : "+books);

        } catch (Exception e) {
            e.printStackTrace();
        }
       request.setAttribute("books",books);
        return "index";

    }
}
