package cn.hnist.service;

import cn.hnist.dao.BooksMapper;
import cn.hnist.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BooksService{
    @Autowired
    private BooksMapper booksMapper;

    @Override
    public Books byIdBooks(int bookid) throws Exception {
        return booksMapper.byIdBooks(bookid);
    }

    @Override
    public List<Books> queryBooksList(Integer type, int currentPageNo, int pageSize) throws Exception {
        return null;
    }

    @Override
    public List<Books> queryBooksNameList(String bookname, int currentPageNo, int pageSize) throws Exception {
        return null;
    }
}
