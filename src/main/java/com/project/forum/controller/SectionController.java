package com.project.forum.controller;

import com.project.forum.model.Section;
import com.project.forum.repository.SectionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/section")
public class SectionController {
    private SectionRepository sectionRepository;

    public SectionController(SectionRepository sectionRepository){ this.sectionRepository = sectionRepository; }

    @GetMapping("/all")
    public List<Section> getAllSections(){
        List<Section> sections = this.sectionRepository.findAll();
        return sections;
    }
}
