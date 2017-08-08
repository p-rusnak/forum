package com.project.forum.repository;

import com.project.forum.model.Posts;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostsRepository extends MongoRepository<Posts, String> {
}
