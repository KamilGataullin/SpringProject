<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Главная</title>
    <link href="/resources/css/style.css" rel="stylesheet" type="text/css">
    <script src="/resources/js/script.js" defer ></script>
</head>
<body>
    <h2>${message}</h2>

    <a href="/catalog">Главная страница каталога</a><br><br>

    Catalog page 1 : <a href="/catalog/1" class="red_link">link</a><br>
    Catalog page 2 : <a href="/catalog/2?page=3&limit=4" class="red_link">link</a><br><br>

    <button onclick="func()">Клик</button>
</body>
</html>