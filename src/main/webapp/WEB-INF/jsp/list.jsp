<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
        <h2>Things Todo</h2>
        <table class="table">
            <thead>
                <tr>
                    <th>Description</th>
                    <th>Due Date</th>
                    <th>Completed</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${todos}" var="todo">
                    <tr>
                        <td>${todo.description}</td>
                        <td>${todo.dueDate}</td>
                        <td>${todo.isComplete}</td>
                        <td><a href="updateTodo?id=${todo.id}" class="btn btn-warning">Update</a></td>
                        <td><a href="deleteTodo?id=${todo.id}" class="btn btn-danger">Delete</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    <a href="addTodo" class="btn btn-success">Add Todo</a>
</div>
<%@ include file="common/footer.jspf"%>>