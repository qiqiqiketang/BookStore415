package cn.hnist.dao;

import cn.hnist.pojo.BookType;

import java.util.List;

public interface BookTypeMapper {

    /**
     * 查询书籍的所有一级标题，用于在首页的显示
     * @return
     */
    public List<BookType> allBookType();

}