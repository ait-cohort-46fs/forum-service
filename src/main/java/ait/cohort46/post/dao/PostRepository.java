package ait.cohort46.post.dao;

import ait.cohort46.post.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
