package com.project.forum.repository;

import com.project.forum.model.Section;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository  extends MongoRepository<Section, String> {
    Section findById(String id);
}
