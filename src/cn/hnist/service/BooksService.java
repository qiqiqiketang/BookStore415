package cn.hnist.service;

import cn.hnist.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksService {

    /**
     * 通过图书id查询到该商品
     */
    public Books byIdBooks(@Param("bookid") int bookid) throws Exception;

    /**
     * 通过分类查询出其以下的所有图书并且分页显示
     *
     */
    public List<Books> queryBooksList(@Param("type") Integer type,
                                      @Param("currentPageNo") int currentPageNo,
                                      @Param("pageSize") int pageSize) throws Exception;

    /**
     * 通过书名模糊查询并且进行分页显示
     */
    public List<Books> queryBooksNameList(@Param("bookname") String bookname,
                                          @Param("currentPageNo") int currentPageNo,
                                          @Param("pageSize") int pageSize) throws Exception;


}
