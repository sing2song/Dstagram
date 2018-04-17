package ac.dankook.dstagram2.controller;

import ac.dankook.dstagram2.data.Post;
import ac.dankook.dstagram2.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemplateRestController {
    //@Autowired//자동으로 인터페이스(1개일때만) 할당
    //private PostService postService;

    @RequestMapping(value = "/rest/post")
    public Post getPost() {
        Post post = new Post();

        post.setTitle("ssong");
        post.setContent("dankook univ.");

        return post;
        //return postService.getPost();//예시일 뿐 현업에서는 이렇게 사용x
    }

}
