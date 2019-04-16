package cn.hnist.service;

import cn.hnist.pojo.BookType;
import cn.hnist.pojo.vo.CategoryVo;

import java.util.List;

public interface BookTypeService {
    /**
     * 查询书籍的所有一级标题，用于在首页的显示
     * @return
     */
    public List<BookType> allBookType();


    List<CategoryVo> getAllCategoryList();

}
