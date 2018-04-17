$(document).ready(function () {
    var $change= $('#change');

    $change.on('click',function () {

        $.post("/rest/post2",{},function (result) {
            console.dir(result);
            var $content = $change.prev();
            var $title = $content.prev();

            $title.text(result.title);
            $content.text(result.content);
        });
    });
});