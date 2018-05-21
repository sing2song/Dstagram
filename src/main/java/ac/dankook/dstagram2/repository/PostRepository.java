package ac.dankook.dstagram2.repository;

import ac.dankook.dstagram2.data.Post;

public interface PostRepository {
    Integer insertPostOne();
    Post selectPostOne();
    Integer updatePostOne();
    Integer deletePostOne();
}
