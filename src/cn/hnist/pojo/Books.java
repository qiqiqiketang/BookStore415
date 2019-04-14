package cn.hnist.pojo;

import java.util.Date;

/**
 * 图书类
 */
public class Books {


    private Integer bookid;     //图书id

    private String bookname;    //书名

    private String introduce;   //介绍

    private Double price;       //价格

    private String author;      //作者

    private String publish;     //出版商

    private Date inTime;        //发布时间

    private Integer stock;      //库存数量

    private String priturename; //图片

    private Integer booktype;       //类型（对应BookType中的id）


    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish == null ? null : publish.trim();
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getPriturename() {
        return priturename;
    }

    public void setPriturename(String priturename) {
        this.priturename = priturename == null ? null : priturename.trim();
    }

    public Integer getBooktype() {
        return booktype;
    }

    public void setBooktype(Integer booktype) {
        this.booktype = booktype;
    }
}