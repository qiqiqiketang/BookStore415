package cn.hnist.service;

import cn.hnist.dao.BookTypeMapper;
import cn.hnist.dao.BooksMapper;
import cn.hnist.pojo.BookType;
import cn.hnist.pojo.Books;
import cn.hnist.pojo.vo.CategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookTypeServiceImpl implements BookTypeService{
    @Autowired
    private BookTypeMapper bookTypeMapper;
    @Autowired
    private BooksMapper booksMapper;


    @Override
    public List<BookType> allBookType() {
        return bookTypeMapper.allBookType();
    }


    @Override
    public List<CategoryVo> getAllCategoryList() {
        List<BookType> bookTypeList = bookTypeMapper.allBookType();
        List<CategoryVo> categoryVoList = new ArrayList<>();
        for (BookType bookType:bookTypeList){
            CategoryVo categoryVo = new CategoryVo();
            List<Books> booksList =booksMapper.byBookTypeList(bookType.getId());
            categoryVo.setBookType(bookType);
            categoryVo.setBooksList(booksList);
            categoryVoList.add(categoryVo);
        }
        return categoryVoList;
    }
}
