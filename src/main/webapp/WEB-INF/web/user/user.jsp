<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@ include file="../../../page/tag.jsp" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Table</title>
    <link rel="stylesheet" href="${baseurl}/public/common/layui/css/layui.css" media="all"/>
    <link rel="stylesheet" href="${baseurl}/public/common/css/global.css" media="all">
    <link rel="stylesheet" href="${baseurl}/plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="${baseurl}/public/css/table.css"/>
    <script type="text/javascript" src="${baseurl}/js/myjs/jquery.min.js"></script>
    <link rel="stylesheet" href="${baseurl}/public/css/eu_manage.css" media="all">
    <script type="text/javascript" src="${baseurl}/public/js/button_js.js" charset="utf-8"></script>
</head>
<style>
    .layui-table td, .layui-table th {
        text-align: center;
    }
</style>
<body>
<div class="admin-main">
    <blockquote class="layui-elem-quote">
        <div class="layui-inline">
            <div class="layui-input-inline">
                <input type="text" name="title" id="adminRealname" lay-verify="title" autocomplete="off"
                       placeholder="用户姓名" class="layui-input">
            </div>
            <a class="layui-btn" onclick="cl.list()"><i class="layui-icon">&#xe615;</i>搜索</a>

        </div>
        <a class="refer layui-btn " onclick="cl.addUser()">
            <i class="layui-icon">&#xe61f;</i>添加
        </a>
    </blockquote>

    <fieldset class="layui-elem-field">
        <legend>管理员</legend>
        <div style="margin: 20px;">
            <table class="site-table layui-table table-hover ">
                <thead>
                <tr>
                    <th>编号</th>
                    <th>姓名</th>
                    <th>用户ID</th>
                    <th>性别</th>
                    <th>年龄</th>
                    <th>手机号</th>
                    <th>创建时间</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody class="tr_1">

                </tbody>
            </table>
        </div>
        <div style="margin: 25px;" id="demo1"></div>
        <ul id="biuuu_city_list"></ul>
    </fieldset>
</div>
<script id="list-tpl" type="text/html">
    {{# layui.each(d.user, function(index, item){ }}
    <tr>
        <td>{{ index+1}}</td>
        <td>{{ item.admin_realname}}</td>
        <th>{{item.admin_name}}</th>
        <th>{{item.admin_sex}}</th>
        <th>{{item.admin_age}}</th>
        <th>{{item.admin_phone}}</th>
        <th>{{item.admin_date}}</th>
        <td>
            <a class="layui-btn layui-btn-small layui-btn-normal  layui-icon "
               onclick="cl.preview('{{item.admin_name}}')">
                &#xe60a; 预览
            </a>
            <button class='layui-btn layui-btn-small layui-icon'>&#xe642;编辑</button>
            <button data-id='1' data-opt='del' class='layui-btn layui-btn-danger layui-btn-small layui-icon'
                    onclick="cl.delete('{{item.admin_name}}')">
                &#xe640;删除
            </button>
        </td>
    </tr>
    {{# }); }}
</script>

</body>
<div id="addUser" style="display: none">
    <form class="layui-form layui-form-pane" id="update-form" style="padding-left: 25%;padding-top: 10%;">

        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">用户姓名：</label>
                <div class="layui-input-inline">
                    <input type="text" name="adminRealname" autocomplete="off" class="layui-input" placeholder="用户姓名">
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">用户ID：</label>
                <div class="layui-input-inline">
                    <input type="text" name="adminName" autocomplete="off" class="layui-input" placeholder="登录账号">
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">密码：</label>
                <div class="layui-input-inline">
                    <input type="password" name="adminPassword" autocomplete="off" class="layui-input"
                           placeholder="登录密码">
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">性别：</label>
            <div class="layui-input-block">
                <input type="radio" name="adminSex" value="男" title="男" checked>
                <input type="radio" name="adminSex" value="女" title="女">
            </div>
        </div>
        <div class="layui-input-block">
            <button class="layui-btn" onclick="cl.addUserAjax()">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>

    </form>
</div>

<div id="preview" style="display: none">
    <div style="margin: 0 10%;">
        <fieldset class="layui-elem-field site-demo-button" style="padding:40px;">
            <legend>一级管理员详情信息</legend>
            <table class="site-table table-hover ">
                <thead>
                <tr>
                    <th>信息</th>
                    <th>详情</th>
                </tr>
                </thead>
                <tbody id="userInfo">

                </tbody>
            </table>
        </fieldset>
    </div>
</div>
<script type="text/javascript" src="${baseurl}/public/common/layui/layui.js"></script>
<script type="text/javascript">
    let totalSize = 10;
    let currentIndex = 1;
    let pageSize = 10;
    let cl;
    layui.use(['jquery', 'layer', 'element', 'laypage', 'form', 'laytpl', 'tree'], function () {
        window.jQuery = window.$ = layui.jquery;
        window.layer = layui.layer;
        var element = layui.element(),
            form = layui.form(),
            laytpl = layui.laytpl;

        cl = {
            page: function () {
                layui.laypage({
                    cont: 'demo1',
                    pages: totalSize, //总页数
                    curr: currentIndex,
                    groups: 5,//连续显示分页数
                    skin: '#1E9FFF',
                    jump: function (obj, first) {
                        currentIndex = obj.curr;
                        if (!first) {
                            cl.list();
                        }
                    }
                });
            },
            list: function () {
                let adminRealname = $("#adminRealname").val();
                $.post("${pageContext.request.contextPath}/user/findUser", {
                        currentIndex: currentIndex,
                        pageSize: pageSize,
                        adminRealname:adminRealname
                    },
                    function (data) {
                        console.log(data)
                        if (data.result) {
                            currentIndex = data.page.currentIndex;
                            totalSize = data.page.totalSize;
                            cl.page();
                            laytpl($("#list-tpl").text()).render(data, function (html) {
                                $(".tr_1").html(html);
                            });
                            form.render();
                        }
                    },
                    "json"
                );
            },
            preview: function (id) {
                layer.open({
                    type: 1,
                    title: '管理员信息'
                    , content: $("#preview"),
                    area: ['100%', '100%']
                });

            },
            addUser: function () {
                layer.open({
                    type: 1,
                    title: '添加用户'
                    , content: $("#addUser"),
                    area: ['40%', '70%']
                });
            },
            addUserAjax: function () {
                let admin = $("#update-form").serialize();
                $.post("${pageContext.request.contextPath}/user/addUser", admin, function (data) {
                    layer.msg(data.msg, {time: 500});
                    if (data.result) {
                        setTimeout("location.reload()", 1000);
                    }
                });
            },
            delete:function (id) {
                layer.confirm('确定删除？', {icon: 3, title: '提示'}, function (index) {
                    layer.close(index);
                    $.post("${pageContext.request.contextPath}/user/deleteUser", {id: id},
                        function (data) {
                            layer.msg(data.msg, {time: 500});
                            if (data.result) {
                                setTimeout("location.reload()", 500);
                            }
                        });
                });
            },

        }
        $(function () {
            cl.list();
        });
    });
</script>

</html>