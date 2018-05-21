package ac.dankook.dstagram2.repository;

import ac.dankook.dstagram2.data.Post;
import javafx.geometry.Pos;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PostRepositoryImpl implements PostRepository {
    @Autowired
    private SqlSession sqlSession;

    public Integer insertPostOne() {
        return sqlSession.insert("postMapper.insertPostOne");
    }

    public Post selectPostOne() {
        return sqlSession.selectOne("postMapper.selectPostOne");
    }

    public Integer updatePostOne() {
        return null;
    }

    public Integer deletePostOne() {
        return null;
    }
}
