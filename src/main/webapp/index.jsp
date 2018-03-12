<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--<%@ page isELIgnored="false" %>--%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>首页厨师菜品列表</title>
    <link rel="stylesheet" href="framework/bootstrap/css/bootstrap.min.css" />
    <%--<link rel="stylesheet" href="css/index.css" />--%>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-xs-12">
            <ul class="nav nav-tabs">
                <li><a href="#">站点功能</a></li>
                <li><a href="#">站点功能</a></li>
                <li><a href="#">站点功能</a></li>
                <li><a href="#">站点功能</a></li>
                <li><a href="#">站点功能</a></li>
            </ul>
        </div>
    </div>
    <div class="row">
        <div class="col-xs-3">
            <div class="paner-group" id="acc">
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <h4 class="panel-title"><a href="#ctx1" data-toggle="collapse" data-parent="#acc">鲁菜</a></h4>
                    </div>
                    <div class="panel-collapse collapse" id="ctx1">
                        <div class="panel-body">菜系</div>
                    </div>
                </div>
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <h4 class="panel-title"><a href="#ctx2" data-toggle="collapse" data-parent="#acc">鲁菜</a></h4>
                    </div>
                    <div class="panel-collapse collapse" id="ctx2">
                        <div class="panel-body">菜系</div>
                    </div>
                </div>
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <h4 class="panel-title"><a href="#ctx3" data-toggle="collapse" data-parent="#acc">鲁菜</a></h4>
                    </div>
                    <div class="panel-collapse collapse" id="ctx3">
                        <div class="panel-body">菜系</div>
                    </div>
                </div>
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <h4 class="panel-title"><a href="#ctx4" data-toggle="collapse" data-parent="#acc">鲁菜</a></h4>
                    </div>
                    <div class="panel-collapse collapse" id="ctx4">
                        <div class="panel-body">菜系</div>
                    </div>
                </div>
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <h4 class="panel-title"><a href="#ctx5" data-toggle="collapse" data-parent="#acc">鲁菜</a></h4>
                    </div>
                    <div class="panel-collapse collapse" id="ctx5">
                        <div class="panel-body">菜系</div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-xs-9">
            <div class="col-xs-12">
                <div class="navbar navbar-default z-high" role="navigation">
                    <div class="container-fluid">
                        <div class="navbar-heading"><a href="#" class="navbar-brand myfnt">厨师搜索</a></div>
                        <div >
                            <form action="search" role="search" method="post" class="navbar-form navbar-left frm-high">
                                <div class="form-group"><input type="text" placeholder="Search" class="form-control" /></div>
                                <button type="submit" class="btn btn-default">搜索信息</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-xs-12">
                <table class="table table-striped table-bordered table-condensed table-hover text-center">
                    <tr>
                        <th class="text-center">厨师编号</th>
                        <th class="text-center">厨师姓名</th>
                        <th class="text-center">任职时间</th>
                        <th class="text-center">得意菜品</th>
                        <th class="text-center">信息维护</th>
                        <th class="text-center">厨师离职</th>
                    </tr>
                    <c:forEach var="ck" items="${pb.data }">
                        <tr>
                            <td>${ck.cookid }</td>
                            <td>${ck.cookname }</td>
                            <td>${ck.jobdate }</td>
                            <td>${ck.foodname }</td>
                            <td><a href="findFood${ck.cookid }.do" class="btn btn-xs btn-info">信息维护</a></td>
                            <td><a href="delCook.do?cookid=${ck.cookid }" class="btn btn-xs btn-danger">厨师离职</a></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
            <div class="col-xs-offset-4 col-xs-4">
                <ul class="pagination">
                    <li><a href="init.do?cp=1">首页</a></li>
                    <li><a href="init.do?cp=${pb.prev }">上页</a></li>
                    <li><a href="init.do?cp=${pb.next }">下页</a></li>
                    <li><a href="init.do?cp=${pb.countPage }">尾页</a></li>
                </ul>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript" src="framework/jquery/jquery-3.2.1.min.js" ></script>
<script type="text/javascript" src="framework/bootstrap/js/bootstrap.min.js" ></script>
<%--<script src="js/save.js" type="text/javascript" charset="utf-8"></script>--%>
</body>
</html>