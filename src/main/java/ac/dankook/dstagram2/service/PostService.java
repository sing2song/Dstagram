package ac.dankook.dstagram2.service;

import ac.dankook.dstagram2.data.Post;
import org.springframework.stereotype.Service;

//@Service //root- context가 긁어간다
public interface PostService {
    Integer postPost();
    Post getPost();
    Integer putPost();
    Integer deletePost();
}
