package ac.dankook.dstagram2.controller;

import ac.dankook.dstagram2.data.Post;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {
    @RequestMapping(value="/rest/get")
    public Post getPost() {
        Post post = new Post();

        return post;

    }
}
