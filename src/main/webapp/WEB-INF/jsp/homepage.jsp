<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet">

    <title>Homepage</title>
</head>
    <body>
        <div class="container">
            <h2>Welcome ${username} to the homepage!</h2>
            <a href="listTodos">View Your Todos</a>
        </div>
        <script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.4/jquery.min.js"></script>
    </body>
</html>