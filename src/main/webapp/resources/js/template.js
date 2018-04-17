'use strict'; //엄격하게 코드를 체크하는 것
$(document).ready(function () {
  var $readMore = $('#readMore');

  $readMore.on('click',function () {
  $.post("/rest/post",{},function (result) {
        console.dir(result);
        var $content = $readMore.prev();
        var $title = $content.prev();

        $title.text(result.title);
        $content.text(result.content);
  });
  });
});
