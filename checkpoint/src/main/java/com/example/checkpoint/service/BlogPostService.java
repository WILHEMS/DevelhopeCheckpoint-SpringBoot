package com.example.checkpoint.service;

import com.example.checkpoint.entity.BlogPost;
import com.example.checkpoint.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BlogPostService {
    public BlogPostRepository blogPostRepository;

    public LocalDate localDate;

    @Autowired
    public BlogPostService(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    public void addBlog(){
        blogPostRepository.save(new BlogPost("Software Design", "JAVA OOP and Spring boot content","Bolton Derick", localDate));
    }
    public void updateBlog(BlogPost blogPost){
        blogPostRepository.save(blogPost);
    }
    public void deleteBlog(Long blogId){
        blogPostRepository.deleteById(blogId);
    }
    public List<BlogPost> getBlogs(){
        return blogPostRepository.findAll();
    }
    public void getBlogPost(Long blogId){
        blogPostRepository.findById(blogId);
    }
}
