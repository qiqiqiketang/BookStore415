package cn.hnist.service;

import cn.hnist.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksService {

    /**
     * 通过图书id查询到该商品
     */
    public Books byIdBooks(int bookid) throws Exception;


    /**
     * 首页显示的一级标题，并且每个显示前6个商品
     * SELECT bookid,bookname,booktype FROM books a WHERE (SELECT COUNT(*) FROM books t WHERE
     t.booktype = a.booktype and t.bookid>a.bookid) < 3 order by booktype
     *//*
    public List<Books> byBookTypeList();*/
    public List<Books> byBookTypeList(int booktype) throws Exception;

    /**
     * 通过分类查询出其以下的所有图书并且分页显示
     *
     */
    public List<Books> queryBooksList(Integer type, int currentPageNo, int pageSize) throws Exception;

    /**
     * 通过书名模糊查询并且进行分页显示
     */
    public List<Books> queryBooksNameList(String bookname, int currentPageNo, int pageSize) throws Exception;


}
