<#include "../template/template.ftl">
<@mainTemplate title="Обратная связь" />
<#macro m_body>
<div class="men">
    <div class="container">
        <#include "contactInfo.ftl">
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