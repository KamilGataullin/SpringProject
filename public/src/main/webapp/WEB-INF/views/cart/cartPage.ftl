<#-- @ftlvariable name="Session.cart" type="com.springapp.mvc.common.CartInfo" -->
Страница в работе!
<br><br>
<#if (Session.cart.goods)??>
Товары в корзине:<br>
<#list Session.cart.goods?keys as goodId>
    товар: ${goodId}; кол-во: ${Session.cart.getCount(goodId)}<br>
</#list>
<#else>
    Ваша корзина пуста!
</#if>