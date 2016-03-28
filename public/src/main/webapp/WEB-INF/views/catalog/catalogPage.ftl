<#-- @ftlvariable name="goods" type="java.util.List<com.springapp.mvc.common.GoodInfo>" -->
<#include "../template/template.ftl">
<@mainTemplate title="Каталог товаров" styles=["css/component.css", "css/own/catalog.css"] scripts=["js/own/catalog.js"] />
<#macro m_body>
<div class="men">
    <div class="container">
        <#include "components/catalogFilter.ftl" />
        <@m_filter catalogFilter=catalogFilter />
        <div class="col-md-8 mens_right">
            <#include "components/catalogBreamcrub.ftl" />
            <#include "components/catalogToolbar.ftl" />
            <div id="cbp-vm" class="cbp-vm-switcher cbp-vm-view-grid">
                <#include "components/catalogShowType.ftl" />
                <ul id="goodList">
                    <#include "components/goodItem.ftl">
                    <#list goods as good>
                        <@goodItem good=good itemClass=((good_index+1)%3==0)?string("last", "") />
                    </#list>
                </ul>
                <#if limit < goodsCount >
                <div id="showMore" class="show-more-button" data-id="${id}" data-page="${page+1}" data-limit="${limit}">
                    Показать еще (<span id="limit">${limit}</span>) из <span id="goodsCount">${goodsCount-limit}</span>
                </div>
                </#if>
            </div>
            <script src="/resources/js/cbpViewModeSwitch.js" type="text/javascript"></script>
            <script src="/resources/js/classie.js" type="text/javascript"></script>
        </div>
    </div>
</div>
</#macro>