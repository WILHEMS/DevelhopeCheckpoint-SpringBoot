package com.example.checkpoint.controller;

import com.example.checkpoint.entity.BlogPost;
import com.example.checkpoint.service.BlogPostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class BlogPostController {
    public LocalDate localDate;
    public BlogPostService blogPostService;

    public BlogPostController(BlogPostService blogPostService) {
        this.blogPostService = blogPostService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> postBlog(){
        blogPostService.addBlog();
        return ResponseEntity.ok().build();
    }

    @GetMapping("/")
    public ResponseEntity<?> getBlogsList(){
        blogPostService.getBlogs();
       return ResponseEntity.ok().body(blogPostService.getBlogs());
    }
    @PutMapping("/update")
    public ResponseEntity<?> updateBlog(BlogPost blogPost){
        blogPost = new BlogPost("Software Design Put", "JAVA OOP and Spring boot content updated","Bolton Derick and Kelvin", localDate);
        blogPostService.updateBlog(blogPost);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/delete/{blogId}")
    public ResponseEntity<Long> deleteBlog(@PathVariable Long blogId){
        blogPostService.deleteBlog(blogId);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/blogs/{blogId}")
    public ResponseEntity<?> getBlogPost(@PathVariable Long blogId){
        blogPostService.getBlogPost(blogId);
        return ResponseEntity.ok().body(blogPostService.getBlogPost(blogId));
    }
}
