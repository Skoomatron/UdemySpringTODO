<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet">

    <title>Add Todo</title>
</head>
    <body>
        <div class="container">
            <h2>Enter Todo Details</h2>
            <form:form method="post" modelAttribute="todoModel">
                Description:
                <form:input type="text" path="description" required="required"/>
                <form:input type="hidden" path="id"/>
                <form:input type="hidden" path="isComplete"/>
                <input type="submit" class="btn btn-success"/>
            </form:form>
        </div>
        <script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.4/jquery.min.js"></script>
    </body>
</html>