package com.example.checkpoint.service;

import com.example.checkpoint.entity.BlogPost;
import com.example.checkpoint.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BlogPostService {
    public BlogPostRepository blogPostRepository;

    public LocalDate localDate = LocalDate.now();

    @Autowired
    public BlogPostService(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    public void addBlog(){
        blogPostRepository.save(new BlogPost("Software Engineering Design", "JAVA OOP and Spring boot content","Bolton Derick", localDate));
    }
    public void updateBlog(BlogPost blogPost){
        blogPost = new BlogPost("Software Design Put", "JAVA OOP and Spring boot content updated","Bolton Derick and Kelvin", localDate);
        blogPostRepository.save(blogPost);
    }
    public void deleteBlog(Long blogId){
        blogPostRepository.deleteById(blogId);
    }
    public List<BlogPost> getBlogs(){
        return blogPostRepository.findAll();
    }
    public Optional<BlogPost> getBlogPost(Long blogId){
        return blogPostRepository.findById(blogId);
    }
    public List<BlogPost> getBlogPostByAuthor(String author){
        return blogPostRepository.findByAuthor(author);
    }
    public List<BlogPost> getBlogPostByDate(LocalDate localDate){
        return blogPostRepository.findByDatePublished(localDate);
    }
}
