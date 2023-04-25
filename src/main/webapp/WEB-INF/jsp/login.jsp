<%@ include file="common/header.jspf"%>
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
<%@ include file="common/footer.jspf"%>>