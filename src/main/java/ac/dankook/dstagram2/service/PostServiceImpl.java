package ac.dankook.dstagram2.service;

import ac.dankook.dstagram2.data.Post;
import ac.dankook.dstagram2.repository.PostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService{
   private  static final Logger LOGGER = LoggerFactory.getLogger(PostServiceImpl.class);
   @Autowired
   private PostRepository postRepository;

    public Integer postPost() {
        Integer post = postRepository.insertPostOne();
return postRepository.insertPostOne();
    }

    public Post getPost() {
       // Post post = new Post();
      //  post.setTitle("ssong");
       // post.setContent("gpgpgpgpgp Univ");

       Post post = postRepository.selectPostOne();

        LOGGER.debug("안녀어어엉~");

         return postRepository.selectPostOne();
 }

    public Integer putPost() {
        Integer post = postRepository.updatePostOne();
        return post;
    }

    public Integer deletePost() {
        Integer post = postRepository.deletePostOne();
        return post;
    }
}
