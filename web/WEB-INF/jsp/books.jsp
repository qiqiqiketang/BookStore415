<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/14
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head lang="en">
      <meta charset="UTF-8">
      <title>七七七颗糖详情页</title>
      <link rel="shortcut icon" href="#"/>
      <script type="text/javascript" rel="stylesheet" src="${pageContext.request.contextPath }/statics/js/jquery-1.11.1.min.js"></script>
      <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/books.css" />
  </head>

  <!--Begin Header Begin-->
  <div class="soubg">
      <div class="sou">
    	<span class="s_city_b">
        	<strong class="fl">欢迎光临七七七颗糖</strong>
        </span>
          <span class="fr">
        	<span class="fl">你好，请<a href="#"style="color:#B9B6E5">登录</a>&nbsp; <a href="Regist.html" style="color:#B9B6E5">免费注册</a>&nbsp;|&nbsp;<a href="#">我的订单</a>&nbsp;</span>
            <span class="fl">|&nbsp;关注我们：</span>
            <span class="s_sh"><a href="#" class="sh1">新浪</a><a href="#" class="sh2">微信</a></span>
        </span>
      </div>
  </div>

  <div class="top">
      <div class="logo"><a href="#"><img src="${pageContext.request.contextPath}/statics/images/logo.png" class="logoimg"/></a></div>
      <div class="search">
          <form>
              <input type="text" value="" class="s_ipt" />
              <input type="submit" value="搜索" class="s_btn" />
          </form>
      </div>

      <div class="i_car">
          <div class="car_t">购物车 [ <span>1</span> ]</div>
          <div class="car_bg">
              <!--Begin 购物车未登录 Begin-->
              <div class="un_login">还未登录！<a href="#" style="color:#B9B6E5;">马上登录</a> 查看购物车！</div>
              <!--End 购物车未登录 End-->
              <!--Begin 购物车已登录 Begin-->
              <ul class="cars">
                  <li>
                      <div class="img"><a href="#"><img src="${pageContext.request.contextPath}/statics/images/car1.jpg" width="58" height="58" /></a></div>
                      <div class="name"><a href="#">法颂浪漫梦境50ML 香水女士持久清新淡香 送2ML小样3只</a></div>
                      <div class="price"><font color="#B9B6E5">￥399</font> X1</div>
                  </li>
              </ul>
              <div class="price_sum">共计&nbsp; <span color="#B9B6E5">￥</span><span>1058</span></div>
              <div class="price_a"><a href="#">去购物车结算</a></div>
              <!--End 购物车已登录 End-->
          </div>
      </div>
  </div>
  <!--End Header End-->
  <!--Begin Menu Begin-->

  <!----------------------------------------------->

  <div class="left-div">
      <ul>
          <li><a href="index.html">首页</a></li>
          <c:forEach items="${bookTypeList}" var="list">
                <li><a name="#">${list.typename}</a></li>
          </c:forEach>
      </ul>
  </div>


  <!------------------------------------------------>

  <style type="text/css">
      .xiangqing{
          width: 320px;
          height: 350px;
          float: left;
      }
      .bookname{
          margin-top: 40px;
          padding-left: 40px;
          font-size: 20px;
      }
      .jianjie{
          margin-top: 70px;
          font-size: 14px;
      }
      .kucun{
          margin-top: 80px;
          margin-left: 10px;
      }

  </style>
  <div class="books">
      <div class="books_img" style=" background: url('/statics/images/${books.priturename}') no-repeat;background-size: cover;"></div>
      <div class="xiangqing" >
          <div class="bookname"><span>${books.bookname}</span></div>
          <div class="jianjie">
              <span>${books.introduce}</span>
          </div>

          <div class="kucun">
              库存数量:<span>${books.stock}</span>
          </div>
          <div class="des_join">
              <div class="j_nums">
                  <input type="text" value="1" name="" class="n_ipt" />
                  <input type="button" value="" onclick="addUpdate(jq(this));" class="n_btn_1" />
                  <input type="button" value="" onclick="jianUpdate(jq(this));" class="n_btn_2" />
              </div>
              <span class="fl"><a onclick="ShowDiv_1('MyDiv1','fade1')"><img src="${pageContext.request.contextPath}/statics/images/j_car.png" /></a></span>
          </div>
      </div>
      <div class="right-img"></div>
  </div>





  <!------------------------------------------------>
  <!--底部-->
  <div class="btmbg">
      <div class="btm">
          备案/许可证编号：蜀ICP备12019302号-1-www.qiqiqiketang.com   Copyright © 2019-2019 七七七颗糖商城网 All Rights Reserved. 复制必究 , Technical Support: Dgg Group <br />
          <img src="${pageContext.request.contextPath}/statics/images/b_1.gif" width="98" height="33" /><img src="${pageContext.request.contextPath}/statics/images/b_2.gif" width="98" height="33" /><img src="${pageContext.request.contextPath}/statics/images/b_3.gif" width="98" height="33" /><img src="${pageContext.request.contextPath}/statics/images/b_4.gif" width="98" height="33" /><img src="${pageContext.request.contextPath}/statics/images/b_5.gif" width="98" height="33" /><img src="${pageContext.request.contextPath}/statics/images/b_6.gif" width="98" height="33" />
      </div>
  </div>
</html>
