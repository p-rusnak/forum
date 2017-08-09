package com.project.forum.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "Sections")
public class Section {
    @Id
    private String id;
    private int parentId;
    private String name;
    private String descr;
    private List<Section> sections;
    private List<Posts> posts;

    protected Section(){
        this.posts = new ArrayList<>();
    }
    public Section(int parentId, String name, String descr) {
        this.parentId = parentId;
        this.name = name;
        this.descr = descr;
        this.sections = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public String getId(){ return id;}

    public String getName() {
        return name;
    }

    public String getDescr() {
        return descr;
    }

    public List<Section> getSections() {
        return sections;
    }

    public List<Posts> getPosts() {
        return posts;
    }

    public void addSubSection(Section sub) {
        sections.add(sub);

    }
}
