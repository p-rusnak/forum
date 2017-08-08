package com.project.forum.repository;

import com.project.forum.model.Section;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SectionRepository  extends MongoRepository<Section, String> {
}
