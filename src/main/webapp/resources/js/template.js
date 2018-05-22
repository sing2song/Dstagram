'use strict'; //엄격하게 코드를 체크하는 것
$(document).ready(function () {
    var $postMore = $('#postMore');
    var $getMore = $('#getMore');//$는 jquery 단어라는뜻

    var $putMore = $('#putMore');
    var $deleteMore = $('#deleteMore');

    $postMore.on('click', function () {
        $.post("/rest/post", {}, function (result) {
            console.dir(result);
            var $content = $postMore.prev();
            var $title = $content.prev();

            $title.text(result.title);
            $content.text(result.content);
        });
    });
    $getMore.on('click', function () {
        $.get("rest/post", {}, function (result) {
            console.dir(result);
            var $content = $getMore.prev();
            var $title = $content.prev();

            $title.text(result.title);
            $content.text(result.content);
        });
    });

    $putMore.on('click', function () {
        $.update("rest/post/update", function (result) {
            console.dir(result);
            var $content = $putMore;
//            var $title = $content.prev();

            //          $title.text(result.title);
            $content.text(result.content);
        });
    });
    $deleteMore.on('click', function () {
        $.delete("rest/post/delete", function (result) {
            console.dir(result);
            var $content = $deleteMore.prev();
            var $title = $content.prev();

            $title.text(result.title);
            $content.text(result.content);
        });
    });
});
