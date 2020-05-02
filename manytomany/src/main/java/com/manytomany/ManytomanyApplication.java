package com.manytomany;

import com.manytomany.Model.Post;
import com.manytomany.Model.Tag;
import com.manytomany.Repo.PostRepo;
import com.manytomany.Repo.TagRepo;
import com.sun.deploy.security.BadCertificateDialog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManytomanyApplication implements CommandLineRunner {
@Autowired
private PostRepo postRepo;
@Autowired
private TagRepo tagRepo;

    public static void main(String[] args) {
        SpringApplication.run(ManytomanyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Post post = new Post("Hibernate Many to Many Mapping Example with Spring Boot",
                "Hibernate Many to Many Mapping Example with Spring Boot",
                "Hibernate Many to Many Mapping Example with Spring Boot");

        Tag tag = new Tag("Spring Boot");
        Tag hibernate = new Tag("Hibernate");

        post.getTags().add(tag);
        post.getTags().add(hibernate);

        tag.getPost().add(post);
        hibernate.getPost().add(post);

        this.postRepo.save(post);

    }
}
