'use strict'; //엄격하게 코드를 체크하는 것
$(document).ready(function () {
    var $search = $('#search');

    $search.on('click',function () {
    $.get("/rest/get",{},function (result) {
        console.dir(result);
        var $change=$search.prev();
        var $text=$change.prev();

          alert("Data Loaded: " + $text);
        });
    });
});
