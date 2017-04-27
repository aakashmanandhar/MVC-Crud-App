<%-- 
    Document   : Login
    Created on : Apr 24, 2017, 7:40:35 PM
    Author     : aakashm
--%>

<%@include file="../../WEB-INF/Views/Shared/Header.jsp" %>

<div>
    <c:if test="${param.errormessage!=null}">
        <div class="alert alert-warning alert-dismissible " role="alert">
            <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <strong>Warning!</strong> Username or Password Invalid.
        </div>
    </c:if>

    <form class="form-horizontal" action="login" method="post" align="center">
        <div class="form-group">
            <label class="col-sm-2 control-label">
                <span class="glyphicon glyphicon-user" aria-hidden="true"></span>
            </label>

            <div class="col-sm-8">
                <input type="text" class="form-control" name="username" placeholder="Username">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">
                <span class="glyphicon glyphicon-lock" aria-hidden="true"></span>
            </label>

            <div class="col-sm-8">
                <input type="password" class="form-control" name="password" placeholder="Password">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-6" align="left">
                <div class="checkbox">
                    <label>
                        <input type="checkbox"> Remember Me
                    </label>
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-1">
                <button type="submit" class="btn btn-primary">
                    <span class="glyphicon glyphicon-log-in" aria-hidden="true"></span>&nbsp;
                    Sign In
                </button>
            </div>
        </div>
    </form>
</div>

<%@include file="../../WEB-INF/Views/Shared/Footer.jsp" %>
