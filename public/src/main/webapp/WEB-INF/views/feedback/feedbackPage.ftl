<#include "../template/template.ftl">
<@mainTemplate title="Обратная связь" headerBannerClass="men_banner" />
<#macro m_body>
<div class="men">
    <div class="container">
        <div class="grid_1">
            <h1>Contact Info</h1>
            <p>Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat,
                vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim
                qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.
                Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim
                placerat facer possim assum</p>
        </div>
        <div class="grid_4">
            <div class="grid_2 preffix_1">
                <ul class="iphone">
                    <i class="phone"> </i>
                    <li class="phone_desc">Phone : +1 800 245 2365 </li>
                    <div class="clearfix"> </div>
                </ul>
                <ul class="iphone">
                    <i class="flag"> </i>
                    <li class="phone_desc">Website : <a href="http://www.google.com">www.demolink.com</a></li>
                    <div class="clearfix"> </div>
                </ul>
            </div>
            <div class="grid_3">
                <ul class="iphone">
                    <i class="msg"> </i>
                    <li class="phone_desc">Email : <a href="mailto:mail@demolink.org">mail@watches.com</a> </li>
                    <div class="clearfix"> </div>
                </ul>
                <ul class="iphone">
                    <i class="home"> </i>
                    <li class="phone_desc">Address : vel illum dolore eu feugiat nulla </li>
                    <div class="clearfix"> </div>
                </ul>
            </div>
            <div class="clearfix"> </div>
        </div>
        <div class="contact_form">
            <h2>Feedback</h2>
            <form>
                <div class="col-md-6 to">
                    <input type="text" class="text" placeholder="Name" />
                    <input type="text" class="text" placeholder="Email" />
                    <input type="text" class="text" placeholder="Subject" />
                </div>
                <div class="col-md-6 text">
                    <textarea placeholder="Message"></textarea>
                </div>
                <div class="clearfix"></div>
                <div class="but__center"><input type="submit" value="Send message &gt;&gt;"></div>
            </form>
        </div>
    </div>
</div>
</#macro>