/**
 * Created by Kamil
 * on 01.03.2016.
 */
$(document).ready(function () {

    $(document).on('click', '#showMore', function () {
        var $this = $(this);
        var page = $this.data('page'),
            limit = $this.data('limit');
        $.ajax({
            type: "POST",
            url: "/catalog/showMore",
            data: {
                id: $this.data('id'),
                page: page,
                limit: limit
            }
        }).done(function (data) {  // сюда приходит ответ при успехе
            //console.log(data);
            if (data != '') {
                $("#goodList").append(data);
                updateCounter();
            } else {
                $this.hide();
            }
        }).fail(function () {      // сюда приходит ответ если на сервере прооизошла ошибка
            $this.hide();
        });

        function updateCounter() {
            $this.data('page', page + 1);
            var $goodsCount = $('#goodsCount');
            var goodsCount = parseInt($goodsCount.text());
            if (goodsCount > limit) {
                $goodsCount.text(goodsCount - limit);
                $('#limit').text(Math.min(limit, goodsCount - limit))
            } else {
                $this.hide();
            }
        }
    });

    // неверно!
    $('.js_addToCart').click(function () {
        alert(1)
    });
    // неверно!
    $('.js_addToCart').on('click', function () {
        alert(2);
    });
    // верно!!!
    $(document).on('click', '.js_addToCart', function () {
        alert(3);
        $.ajax({
            type: 'POST',
            url: '/cart/add',
            data: {id: id},
            success: function (data, status) {
                $("#content").html(data);
            },
            error: function () {
                $("#content").html(
                    'Приносим извинения.<br/>' +
                    'На сервере произошла ошибка');
            }
        });
    });
});