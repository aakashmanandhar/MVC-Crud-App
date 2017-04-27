<%-- 
    Document   : Home
    Created on : Apr 24, 2017, 7:41:05 PM
    Author     : aakashm
--%>

<%@include file="../../WEB-INF/Views/Shared/Header.jsp" %>
<h1>Admin Dashboard</h1>
<div class="row">
    <c:if test="${param.coursesuccess!=null}">
        <div class="alert alert-success alert-dismissible" role="alert">
            <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <strong>Excellent!</strong> New Course Added. Click on View Course button to see the added course.
        </div>
    </c:if>
            <div class="col-md-3">
                <p class="lead">
                    <a href="${SITE_URL}/addcourse" style="text-decoration: none;">
                        <button type="button" class="btn btn-primary btn-lg btn-block" >
                            <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>&nbsp;Add Courses
                        </button>
                    </a>
                </p>
            </div>
   <!--<a href="${SITE_URL}/addcourse">Add</a>-->

    <div class="col-md-3">
        <p class="lead">
            <button type="button" class="btn btn-primary btn-lg btn-block">
                <span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>&nbsp;View Courses
            </button>
        </p>
    </div>
    <div class="col-md-3">
        <p class="lead">
            <button type="button" class="btn btn-primary btn-lg btn-block">
                <span class="glyphicon glyphicon-th-list" aria-hidden="true"></span>&nbsp;Student Enrollment Info
            </button>
        </p>
    </div>
    <div class="col-md-3">
        <p class="lead">
            <button type="button" class="btn btn-primary btn-lg btn-block">
                Messages <span class="badge">4</span>

            </button>
        </p>
    </div>
    <div class="col-md-3">
        <p class="lead">
            <button type="button" class="btn btn-primary btn-lg btn-block">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>&nbsp;Add Admin
            </button>
        </p>
    </div>
    <div class="col-md-3">
        <p class="lead">
            <button type="button" class="btn btn-primary btn-lg btn-block">
                <span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>&nbsp;View Admins
            </button>
        </p>
    </div>
    <div class="col-md-3">
        <p class="lead">
            <button type="button" class="btn btn-info btn-lg btn-block">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>&nbsp;Profile Settings
            </button>
        </p>
    </div>
    <div class="col-md-3">
        <p class="lead">
            <button type="button" class="btn btn-danger btn-lg btn-block">
                <span class="glyphicon glyphicon-log-out" aria-hidden="true"></span>&nbsp;Logout
            </button>
        </p>
    </div>
</div>



<%@include file="../../WEB-INF/Views/Shared/Footer.jsp" %>