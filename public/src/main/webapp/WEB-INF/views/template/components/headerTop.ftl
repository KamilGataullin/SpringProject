<#assign sec=JspTaglibs["http://www.springframework.org/security/tags"]>
<div class="header_top">
    <div class="header_top_left">
        <div class="box_11"><a href="/cart">
            <h4>
                <p>
                    Cart: <span class="simpleCart_total"></span>
                    (<span id="simpleCart_quantity" class="simpleCart_quantity"></span> items)
                </p>
                <img src="/resources/images/bag.png" alt=""/>
                <div class="clearfix"></div>
            </h4>
        </a></div>
        <p class="empty"><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>
        <div class="clearfix"> </div>
    </div>
    <div class="header_top_right">
        <div class="lang_list">
            <select tabindex="4" class="dropdown">
                <option value="" class="label">$ Us</option>
                <option value="1">Dollar</option>
                <option value="2">Euro</option>
            </select>
        </div>
        <ul class="header_user_info">
            <#-- Если пользователь еще не авторизован, предлагаем ему авторизоваться, либо зарегистрироваться на сайте -->
            <@sec.authorize ifAnyGranted="ROLE_ANONYMOUS">
                <a class="login" href="/login">Login</a> |
                <a class="login" href="/reg">Registration</a>
            </@sec.authorize>
            <#-- Если уже авторизован, то ссылки в личный кабинет и на выход -->
            <@sec.authorize access="isAuthenticated()">
                <a class="login" href="/cabinet">
                    <i class="user"> </i>
                    <li class="user_desc">
                        <#-- principal - это фактически экземпляр объекта MyUserDetail -->
                        <@sec.authentication property="principal.username" />
                        <#--<@sec.authentication property="principal.userInfo.fio" />-->
                    </li>
                </a>
                <a class="login" href="/logout">
                    <li class="user_desc" style="padding-left: 10px;">Logout</li>
                </a>
            </@sec.authorize>
            <div class="clearfix"></div>
        </ul>
        <!-- start search-->
        <div class="search-box">
            <div id="sb-search" class="sb-search">
                <form>
                    <input class="sb-search-input" placeholder="Enter your search term..." type="search" name="search" id="search">
                    <input class="sb-search-submit" type="submit" value="">
                    <span class="sb-icon-search"> </span>
                </form>
            </div>
        </div>
        <!----search-scripts---->
        <script src="/resources/js/classie1.js"></script>
        <script src="/resources/js/uisearch.js"></script>
        <script>
            new UISearch( document.getElementById( 'sb-search' ) );
        </script>
        <!----//search-scripts---->
        <div class="clearfix"> </div>
    </div>
    <div class="clearfix"> </div>
</div>