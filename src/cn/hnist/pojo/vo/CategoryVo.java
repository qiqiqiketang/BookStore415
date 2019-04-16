package cn.hnist.pojo.vo;

import cn.hnist.pojo.BookType;
import cn.hnist.pojo.Books;

import java.util.List;

public class CategoryVo {

    private  BookType bookType;     //图书的分类

    private List<Books> booksList;  //用于存放图书

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public List<Books> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Books> booksList) {
        this.booksList = booksList;
    }
}
