<#macro m_filter catalogFilter>
<#-- @ftlvariable name="catalogFilter" type="com.springapp.mvc.common.catalog.CatalogFilterInfo" -->
<div class="col-md-4 sidebar_men">
    <#if catalogFilter.categories?has_content>
    <h3>Categories</h3>
    <ul class="product-categories color">
        <#list catalogFilter.categories as category>
        <li class="cat-item cat-item-${category.id}"><a href="#">${category.name}</a> <span class="count">(${category.count})</span></li>
        </#list>
    </ul>
    </#if>
    <#if catalogFilter.colors?has_content>
        <h3>Colors</h3>
        <ul class="product-categories color">
            <#list catalogFilter.colors as color>
                <li class="cat-item cat-item-${color.id}"><a href="#">${color.name}</a> <span class="count">(${color.count})</span></li>
            </#list>
        </ul>
    </#if>
    <#if catalogFilter.sizes?has_content>
        <h3>Sizes</h3>
        <ul class="product-categories color">
            <#list catalogFilter.sizes as size>
                <li class="cat-item cat-item-${size.id}"><a href="#">${size.name}</a> <span class="count">(${size.count})</span></li>
            </#list>
        </ul>
    </#if>
    <#if catalogFilter.prices?has_content>
    <h3>Price</h3>
    <ul class="product-categories">
        <#list catalogFilter.prices as price>
            <li class="cat-item"><a href="#">${price.minPrice}$-${price.maxPrice}$</a> <span class="count">(${price.count})</span></li>
        </#list>
    </ul>
    </#if>
</div>
</#macro>