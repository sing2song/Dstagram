'use strict'; //엄격하게 코드를 체크하는 것
$(document).ready(function () {
    var $getSearch = $('#getSearch');
    var $postSearch = $('#postSearch');

    $postSearch.on('click',function () {
        $.post("/rest/post3",{},function (result) {
            //console.dir(result);
            var $content = $postSearch.post();
            var $title = $postSearch();

            $title.text(result.title);
            $content.text(result.content);
        });
    });
    $getSearch.on('click',function () {
        $.get("/rest/post3",{},function (result) {
            console.dir(result);
            var $content=$getSearch.post();
            var $title=$getSearch();

            alert("Data Loaded: " + $content);

            $title.text(result.title);
            $content.text(result.content);
        });
    });
});
