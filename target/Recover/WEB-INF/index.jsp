<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@ include file="../page/tag.jsp" %>
<!DOCTYPE html>

<html>

<head>
	<meta charset="utf-8">
	<title>欧亚决策中心</title>

	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta name="apple-mobile-com.eu.dss.web-app-status-bar-style" content="black">
	<meta name="apple-mobile-com.eu.dss.web-app-capable" content="yes">
	<meta name="format-detection" content="telephone=no">

	<link rel="stylesheet" href="${baseurl}/public/common/layui/css/layui.css" media="all"/>
	<link rel="stylesheet" href="${baseurl}/css/global.css" media="all">
	<link rel="stylesheet" href="${baseurl}/plugins/font-awesome/css/font-awesome.min.css">
	<script type="text/javascript" src="${baseurl}/plugins/layui/layui.js"></script>
	<script type="text/javascript" src="${baseurl}/datas/nav.js"></script>
	<script src="${baseurl}/js/index.js"></script>

</head>
<script type="text/javascript">
    let imgName;
    $(function () {
        //判断session是否存在
        $.post("${pageContext.request.contextPath}/login/session",
            function (data) {
                if (!data.haveSession) {
                    window.location.href = "${baseurl}";
                }
            }
        )
        //显示头像及图片
        $.post("${pageContext.request.contextPath}/userInfo",
            function (data) {
                let user = data.user;
                $("#Name").html(user.nickname);
                $("#userNameLocK").html(user.nickname);
                $("#idName").html(user.username);
                $("#images").text("").attr("src", HEAD_IMAGE_PREFIX + user.img);
                $("#imageslockPwd").text("").attr("src", HEAD_IMAGE_PREFIX + user.img);
            }
        )

    });
    //退出登录
    function out() {
        $.post("${pageContext.request.contextPath}/out",
            function (data) {
                layer.msg(data.msg, {
                    time: 1000
                }, function () {
                    window.location.href = "${baseurl}";
                });

            }
        )
    }
    //用户信息
    function userInfo() {
        $.post("${pageContext.request.contextPath}/userInfo",
            function (data) {
                let user = data.user;
                $("#imagesInfo").text("").attr("src", HEAD_IMAGE_PREFIX + user.img);
                $("#nickname").val(user.nickname);
                $("#username").val(user.username);
                $("#sex").val(user.sex);
                $("#age").val(user.age);
                $("#phone").val(user.phone);
                $("#date").val(user.date);
                layer.open({
                    type: 1,
                    title: "用户信息",
                    area: ["100%", "100%"],
                    closeBtn: 1,
                    content: $("#userInfo")
                })

            }
        )
    }
    //用户信息
    function updateInfo() {
        $.post("${pageContext.request.contextPath}/userInfo",
            function (data) {
                let user = data.user;
                $("#imagesToUpdate").text("").attr("src", HEAD_IMAGE_PREFIX + user.img);
                imgName = user.img;
                $("#updateNickname").val(user.nickname);
                $("#updateUsername").val(user.username);
                $("#updateSex").val(user.sex);
                $("#updateAge").val(user.age);
                $("#updatePhone").val(user.phone);
                $("#updateDate").val(user.date);
                layer.open({
                    type: 1,
                    title: "用户信息",
                    area: ["100%", "100%"],
                    closeBtn: 1,
                    content: $("#updateInfo")
                })

            }
        )
    }
    //用户信息
    function updateInfoAjax() {
        let updateNickname = $("#updateNickname").val();
        let updateUsername = $("#updateUsername").val();
        let updateSex = $("#updateSex").val();
        let updateAge = $("#updateAge").val();
        let updatePhone = $("#updatePhone").val();
        $.post("${pageContext.request.contextPath}/updateInfoAjax", {
                img: imgName,
                nickname:updateNickname,
                sex:updateSex,
                age:updateAge,
                phone:updatePhone,
                username:updateUsername,
            },
            function (data) {
                layer.msg(data.msg);
            }
        )
    }
    //图片上传
    layui.use('upload', function () {
        layui.upload({
            url: '${baseurl}/updateImage' //上传接口
            , success: function (res) { //上传成功后的回调
                if (res.result) {
                    $("#imagesToUpdate").text("").attr("src", HEAD_IMAGE_PREFIX + res.data);
                    imgName = res.data;
                }
            }
        });
    });
</script>
<body>
<div class="layui-layout layui-layout-admin" style="border-bottom: solid 1px #1aa094;">
	<div class="layui-header header header-demo">
		<div class="layui-main">
			<div class="admin-login-box">
				<a class="logo" style="left: 0;">
					<span style="font-size: 18px;font-weight: bold;color: #FFFFFF">隆兴公司账目管理系统</span>
				</a>
				<div class="admin-side-toggle">
					<i class="fa fa-bars" aria-hidden="true"></i>
				</div>
			</div>
			<ul class="layui-nav admin-header-item">
				<li class="layui-nav-item">
					<a href="javascript:;" class="admin-header-user">
						<img id="images" src="${baseurl}/public/images/user.jpg"/>
						<span id = "Name">管理员</span>
					</a>
					<dl
							class="layui-nav-child">
						<dd>
							<a style="cursor:pointer" onclick="userInfo()"><i class="fa fa-user-circle" aria-hidden="true"></i> 个人信息</a>
						</dd>
						<dd>
							<a style="cursor:pointer" onclick="updateInfo()"><i class="fa fa-gear" aria-hidden="true"></i> 设置</a>
						</dd>
						
						<dd>
							<a style="cursor:pointer" onclick="out()"><i class="fa fa-sign-out" aria-hidden="true"></i> 注销</a>
						</dd>
					</dl>
				</li>
			</ul>
		</div>
	</div>
	<div class="layui-side layui-bg-black" id="admin-side">
		<div class="layui-side-scroll" id="admin-navbar-side" lay-filter="side" ></div>
	</div>
	<div class="layui-body" style="bottom: 0;border-left: solid 2px #F2F2F2;" id="admin-body">
		<div class="layui-tab admin-nav-card layui-tab-brief"style="margin-top: 1px" lay-filter="admin-tab">
			<ul class="layui-tab-title">
				<li class="layui-this">
					<i class="fa fa-bank" aria-hidden="true"></i>
					<cite>系统公告</cite>
				</li>
			</ul>
			<div class="layui-tab-content" style="min-height: 150px; padding: 5px 0 0 0;">
				<div class="layui-tab-item layui-show">
					<iframe src="${baseurl}/page/main.html"></iframe>
				</div>
			</div>
		</div>
	</div>
	<div class="layui-footer footer footer-demo" >
		<div class="layui-main">
			<p><br></p>
			<p>
				<a href="#" target="_blank">隆兴公司废钢回收账目管理系统 © 2017</a>
			</p>
		</div>
	</div>
	<div class="site-tree-mobile layui-hide">
		<i class="layui-icon">&#xe602;</i>
	</div>
	<div class="site-mobile-shade"></div>
</div>
</body>

</html>