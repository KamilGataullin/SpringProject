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

<br><br>
===============================================================================================
<br><br>
<#if findGood1?has_content>
<#list findGood1 as fg>
Good id = ${fg.id}<br>
Good name = ${fg.name}<br>
Good description = ${fg.description}<br>
Good category = ${fg.category.id} ${fg.category.name} ${(fg.category.children![])?size}<br>
Good imageUrl = ${fg.imageUrl}<br>
Good price = ${fg.price}<br>
<br>
</#list>
<#else>
Извините, товара по поиску нет
</#if>

<br><br>
===============================================================================================
<br><br>
<#if findGood2?has_content>
    <#list findGood2 as fg>
    Good id = ${fg.id}<br>
    Good name = ${fg.name}<br>
    Good description = ${fg.description}<br>
    Good category = ${fg.category.id} ${fg.category.name} ${(fg.category.children![])?size}<br>
    Good imageUrl = ${fg.imageUrl}<br>
    Good price = ${fg.price}<br>
    <br>
    </#list>
<#else>
Извините, товара по поиску нет
</#if>

<br><br>
===============================================================================================
<br><br>
${catalog?has_content?string} - ${(catalog.id)!"нет ничего"}