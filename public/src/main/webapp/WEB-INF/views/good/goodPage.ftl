<#-- @ftlvariable name="good" type="com.springapp.mvc.common.GoodInfo" -->
This page in work
<br><br>
<#if good??>
Good id = ${good.id}<br>
Good name = ${good.name}<br>
Good description = ${good.description}<br>
Good category = ${good.category.id} ${good.category.name} ${(good.category.children![])?size}<br>
Good imageUrl = ${good.imageUrl}<br>
Good price = ${good.price}<br>
<#else>
Извините, но у нас нет товара с id = ${id} :(
</#if>