<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title></title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/admin/pintuer.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/admin/admin.css">
    <script src="<%=request.getContextPath()%>/resources/js/admin/jquery.js"></script>
    <script src="<%=request.getContextPath()%>/resources/js/admin/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
    <div class="panel-head"><strong><span class="icon-key"></span> 修改会员密码</strong></div>
    <div class="body-content">
        <form method="post" class="form-x" action="/admin_update">
            <%--<input type="text" class="input w50" id="oldpass"  value="${ad.password}" name="oldpassword" size="50" placeholder="请输入原始密码" data-validate="required:请输入原始密码" />--%>
            <div class="form-group">
                <div class="label">
                    <label>管理员帐号：</label>
                </div>
                <c:forEach items="${admin_query}" var="ad">
                <div class="field">
                    <label style="line-height:33px;">
                            ${ad.admins}
                    </label>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>原始密码：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" id="oldpass"  value="" name="oldpassword" size="50" placeholder="请输入原始密码" data-validate="required:请输入原始密码" />
                </div>
            </div>

            </c:forEach>
            <div class="form-group">
                <div class="label">
                    <label >新密码：</label>
                </div>
                <div class="field">
                    <input type="password" class="input w50" name="password" size="50" placeholder="请输入新密码" data-validate="required:请输入新密码,length#>=5:新密码不能小于5位" />
                </div>
            </div>

            <%--        <div class="form-group">
                            <div class="label">
                                <label for="sitename">确认新密码：</label>
                            </div>
                            <div class="field">
                                <input type="password" class="input w50" name="password" size="50" placeholder="请再次输入新密码" data-validate="required:请再次输入新密码,repeat#newpass:两次输入的密码不一致" />
                            </div>
                        </div>--%>
            <div class="form-group">
                <div class="label">
                    <label></label>
                </div>
                <div class="field">
                    <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
                </div>
            </div>

        </form>
    </div>
</div>
<%
  String old=request.getParameter("oldpass");
  System.out.println(old);
%>
</body>
</html>