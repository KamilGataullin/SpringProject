<#macro goodItem good itemClass="">
<#-- @ftlvariable name="good" type="com.springapp.mvc.common.GoodInfo" -->
<li class="simpleCart_shelfItem ${itemClass}">
    <a class="cbp-vm-image" href="/good/${good.id}">
        <div class="view view-first">
            <div class="inner_content clearfix">
                <div class="product_image">
                    <div class="mask1">
                        <img src="/resources${good.imageUrl!"/images/m4.jpg"}" alt="image" class="img-responsive zoom-img">
                    </div>
                    <div class="mask">
                        <div class="info">Quick View</div>
                    </div>
                    <div class="product_container">
                        <h4>${good.name!}</h4>
                        <p>${(good.category.name)!}</p>
                        <div class="price mount item_price">$${good.price?number?string["0.00"]}</div>
                        <a class="button item_add cbp-vm-icon cbp-vm-add" href="#">Add to cart</a>
                    </div>
                </div>
            </div>
        </div>
    </a>
</li>
</#macro>