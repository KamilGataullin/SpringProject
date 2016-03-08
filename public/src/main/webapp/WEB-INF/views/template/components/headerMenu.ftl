<#-- @ftlvariable name="listMenu" type="java.util.List<com.springapp.mvc.common.MenuInfo>" -->
<div class="menu">
    <ul class="megamenu skyblue">
        <#list listMenu as menu>
        <li><a class="color2" href="${menu.link}">${menu.name}</a>
            <#if menu.listCategory?has_content || menu.trends?has_content>
            <div class="megapanel">
                <div class="row">
                    <#if menu.listCategory?has_content>
                        <#list menu.listCategory as category><#if category_index < 2>
                    <div class="col1">
                        <div class="h_nav">
                            <h4>Men</h4>
                            <ul>
                                <#list category.children as child>
                                    <li><a href="/catalog/${child.id}">${child.name}</a></li>
                                </#list>
                            </ul>
                        </div>
                    </div>
                        </#if></#list>
                    </#if>
                    <#if menu.trends?has_content>
                    <div class="col2">
                        <div class="h_nav">
                            <h4>Trends</h4>
                            <ul>
                                <#list menu.trends as trend>
                                <li>
                                    <div class="p_left">
                                        <img src="/resources${trend.imageUrl}" class="img-responsive" alt=""/>
                                    </div>
                                    <div class="p_right">
                                        <h4><a href="/good/${trend.id}">${trend.name}</a></h4>
                                        <span class="item-cat"><small><a href="/catalog/${trend.category.id}">${trend.category.name}</a></small></span>
                                        <span class="price">${trend.price?number} $</span>
                                    </div>
                                    <div class="clearfix"> </div>
                                </li>
                                </#list>
                            </ul>
                        </div>
                    </div>
                    </#if>
                </div>
            </div>
            </#if>
        </li>
        </#list>
        <div class="clearfix"> </div>
    </ul>
</div>
<div class="clearfix"> </div>