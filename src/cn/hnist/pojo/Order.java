package cn.hnist.pojo;

import java.util.Date;

/**
 * 订单类
 */
public class Order {
    private Integer id;         //订单id

    private Integer userid;     //用户id（对应的是User中的id）

    private String useraddress; //地址

    private Date createtime;    //订单创建的时间

    private Double cost;        //订单的总消费

    private String ordernumber; //订单编号（使用UUID生成唯一的）

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress == null ? null : useraddress.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber == null ? null : ordernumber.trim();
    }
}