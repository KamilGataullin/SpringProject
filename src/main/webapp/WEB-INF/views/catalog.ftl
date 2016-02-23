<#-- @ftlvariable name="goods" type="java.util.List<com.springapp.mvc.common.GoodInfo>" -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Catalog</title>
</head>
<body>
    Page = ${page}
    Limit = ${limit!"null"}

    <#list goods as good>
        <#if !limit?? || good_index < limit>
        <pre>
        ${good_index})
            ID: ${good.id}
            Название товара: ${good.name}
            ID категории: ${good.categoryId}
            цена: ${good.price?number}
        </pre>
        </#if>
    </#list>
</body>
</html>