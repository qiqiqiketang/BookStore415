package cn.hnist.dao;


import cn.hnist.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BooksMapper {
    /**
     * 通过图书id查询到该商品
     * 应为图书id是唯一的所以查询出来的只有一个商品
     * 所以只返回一个Books对象即可
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

    /**
     * 首页显示的一级标题，并且每个显示前6个商品
     * SELECT bookid,bookname,booktype FROM books a WHERE (SELECT COUNT(*) FROM books t WHERE
     t.booktype = a.booktype and t.bookid>a.bookid) < 3 order by booktype
     */
    public List<Books> byBookTypeList();

}