<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<body>
    <h1>Parallelepiped:</h1>
    <form action="?command=para" method="post">
        <p>Side length: <input type="text" name="length"></p>
        <p>Side width: <input type="text" name="width"></p>
        <p>Side height: <input type="text" name="height"></p>
        <p><input type="submit"></p>
        Volume = <c:out value="${paraAnswer}"/>
    </form>
    <hr>

    <h1>Cube:</h1>
    <form action="?command=cube" method="post">
        <p>Side: <input type="text" name="side"></p>
        <p><input type="submit"></p>
        Volume = <c:out value="${cubeAnswer}"/>
    </form>
    <hr>

    <h1>Sphere:</h1>
    <form action="?command=sphere" method="post">
        <p>Radius: <input type="text" name="radius"></p>
        <p><input type="submit"></p>
        Volume = <c:out value="${sphereAnswer}"/>
    </form>
    <hr>
</body>

</html>
