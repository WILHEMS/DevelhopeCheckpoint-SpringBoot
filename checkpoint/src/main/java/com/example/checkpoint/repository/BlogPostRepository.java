package com.example.checkpoint.repository;

import com.example.checkpoint.entity.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface BlogPostRepository extends JpaRepository<BlogPost,Long> {

    public List<BlogPost> findByAuthor(String author);
    public List<BlogPost> findByDatePublished(Date localDate);

    //public List<BlogPost> findByTitle();
//    List<EntityTest> findByName(String name);
//    List<EntityTest> findByPriceGreaterThan(double price);
}
