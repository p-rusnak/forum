package com.project.forum;

import com.project.forum.model.Posts;
import com.project.forum.model.Section;
import com.project.forum.repository.PostsRepository;
import com.project.forum.repository.SectionRepository;
import com.project.forum.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner{
    private SectionRepository sectionRepository;
    private UserRepository userRepository;
    private PostsRepository postsRepository;

    public DbSeeder(SectionRepository sectionRepository, UserRepository userRepository, PostsRepository postsRepository){
        this.sectionRepository = sectionRepository;
        this.postsRepository = postsRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.sectionRepository.deleteAll();
        this.userRepository.deleteAll();
        this.postsRepository.deleteAll();

        List<Section> sections = new ArrayList<>();
        List<Posts> posts = new ArrayList<>();

        Section main = new Section(0, "main", "Main section");
        sections.add( main );
        this.sectionRepository.save(sections);

        Section subMain = new Section( 0, "Main subsection", "Sub for main section");
        sections.add( subMain );
        this.sectionRepository.save(sections);
        main.addSubSection(subMain);
        this.sectionRepository.save(sections);
    }
}
