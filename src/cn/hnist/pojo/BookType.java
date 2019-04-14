package cn.hnist.pojo;

/**
 * 图书类型
 */
public class BookType {
    private Integer id;     //类型id

    private String typename;    //类型名

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }
}