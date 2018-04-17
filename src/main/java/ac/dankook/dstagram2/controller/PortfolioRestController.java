package ac.dankook.dstagram2.controller;

import ac.dankook.dstagram2.data.Post;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortfolioRestController {
    @RequestMapping(value="/rest/post2")
    public Post getPost() {
        Post post = new Post();

        post.setTitle("ssong's portfolio");
        post.setContent("dstagram manual");

        return post;

    }
}
