<#-- @ftlvariable name="topGoods" type="java.util.List<com.springapp.mvc.common.GoodInfo>" -->
<#include "../template/template.ftl">
<@mainTemplate title="Авторизация" />
<#macro m_body>

<div class="account-in">
    <div class="container">
        <h3>Account</h3>
        <div class="col-md-7 account-top">
            <form name="authForm" id="authForm" action="/j_spring_security_check" method="post">
                <div>
                    <span>Email*</span>
                    <input type="text" name="j_username" />
                </div>
                <div>
                    <span class="pass">Password*</span>
                    <input type="password" name="j_password" />
                </div>
                <input type="submit" value="Login" />
                <a href="/reg" style="margin-left: 15px;">Create an account</a>
            </form>
        </div>
        <div class="col-md-5 left-account "></div>
        <div class="clearfix"> </div>
    </div>
</div>
</#macro>