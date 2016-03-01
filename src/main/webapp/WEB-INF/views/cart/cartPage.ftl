Страница в работе!
<br><br>
<#if (Session.cart.goods)??>
Товары в корзине:<br>
<#list Session.cart.goods?keys as goodId>
    товар: ${goodId};<br>
</#list>
<#else>
    Ваша корзина пуста!
</#if>