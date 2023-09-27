package com.example.checkpoint.repository;

import com.example.checkpoint.entity.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogPostRepository extends JpaRepository<BlogPost,Long> {
    //public List<BlogPost> findByTitle();
}
