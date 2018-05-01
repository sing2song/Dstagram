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
   public Post getPost() {
       // Post post = new Post();
      //  post.setTitle("ssong");
       // post.setContent("gpgpgpgpgp Univ");

        Post post = postRepository.getPostOne();

        LOGGER.debug("안녀어어엉~");

         return post;
 }
}
