package com.springapp.mvc.common;

import java.util.Map;

/**
 * Содержимое корзины
 *
 * Gataullin Kamil
 * 02.03.2016 0:23
 */
public class CartInfo {

    /**
     * key - id товара, value - кол-во товара
     */
    private Map<Long, Integer> goods;

    public Map<Long, Integer> getGoods() {
        return goods;
    }

    public void setGoods(Map<Long, Integer> goods) {
        this.goods = goods;
    }

    /**
     * Получаем кол-во товара в корзине
     * Для FreeMarker, так как он не умеет работать с числовыми ключами
     *
     * @param goodId id товара
     * @return кол-во товара в корзине
     */
    public Integer getCount(Long goodId) {
        if (goods == null || goodId == null)
            return null;
        return goods.get(goodId);
    }

    /**
     * Есть ли в корзине товар с этим id
     * Для FreeMarker, так как он не умеет работать с числовыми ключами
     *
     * @param goodId id товара
     */
    public boolean containsGoodId(Long goodId){
        if (goods == null || goodId == null)
            return false;
        return goods.containsKey(goodId);
    }
}
