package ac.dankook.dstagram2.controller;

import ac.dankook.dstagram2.data.Post;
import ac.dankook.dstagram2.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemplateRestController {
    //@Autowired//자동으로 인터페이스(1개일때만) 할당
    //private PostService postService;
    @Autowired
    private PostService postService;

    @RequestMapping(value = "/rest/post",method = RequestMethod.POST)
    public void createPost() {
      postService.postPost();
        //return postService.getPost();//예시일 뿐 현업에서는 이렇게 사용x
    }
    @RequestMapping(value = "/rest/post",method = RequestMethod.GET)
    public Post resultPost() {
       Post post = postService.getPost();
        return post;
        //return postService.getPost();//예시일 뿐 현업에서는 이렇게 사용x
    }
    @RequestMapping(value = "/rest/post/update",method = RequestMethod.POST)
    public void updatePost() {
        postService.putPost();


        //return postService.getPost();//예시일 뿐 현업에서는 이렇게 사용x
    }  @RequestMapping(value = "/rest/post/delete",method = RequestMethod.POST)
    public void deletePost() {
       postService.deletePost();
        //return postService.getPost();//예시일 뿐 현업에서는 이렇게 사용x
    }
}
