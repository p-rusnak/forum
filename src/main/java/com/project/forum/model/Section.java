package com.project.forum.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Sections")
public class Section {
    @Id
    private String id;
    private boolean main;
    private String name;
    private String descr;
    private List<Section> subSections;
    private List<Posts> posts;

    protected Section(){}
    public Section(boolean main, String name, String descr) {
        this.main = main;
        this.name = name;
        this.descr = descr;
    }
}
