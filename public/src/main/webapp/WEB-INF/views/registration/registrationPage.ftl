<#include "../template/template.ftl">
<@mainTemplate title="Регистрация" headerBannerClass="men_banner" />
<#macro m_body>
<div class="account-in">
    <div class="container">
        <form>
            <div class="register-top-grid">
                <h2>PERSONAL INFORMATION</h2>
                <div>
                    <span>First Name<label>*</label></span>
                    <input type="text">
                </div>
                <div>
                    <span>Last Name<label>*</label></span>
                    <input type="text">
                </div>
                <div>
                    <span>Email Address<label>*</label></span>
                    <input type="text">
                </div>
                <div class="clearfix"> </div>
                <a class="news-letter" href="#">
                    <label class="checkbox">
                        <input type="checkbox" name="checkbox" checked="">
                        <i> </i>Sign Up for Newsletter
                    </label>
                </a>
            </div>
            <div class="register-bottom-grid">
                <h2>LOGIN INFORMATION</h2>
                <div>
                    <span>Password<label>*</label></span>
                    <input type="password">
                </div>
                <div>
                    <span>Confirm Password<label>*</label></span>
                    <input type="password">
                </div>
                <div class="clearfix"> </div>
            </div>
        </form>
        <div class="clearfix"> </div>
        <div class="register-but">
            <form>
                <input type="submit" value="submit">
                <div class="clearfix"> </div>
            </form>
        </div>
    </div>
</div>
</#macro>