<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet">

    <title>Login</title>
</head>
    <body>
    <div class="container">
        <h2>Login</h2>
        <pre>
            ${errorMessage}
        </pre>
            <form method="post">
                User Name: <input type="text" name="username">
                Password: <input type="password" name="password">
                <input type="submit">
            </form>
    </div>
    <script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.4/jquery.min.js"></script>
    </body>
</html>