package com.appdev.furluv.pacanag3.controller;

import com.appdev.furluv.pacanag3.entity.PostEntity;
import com.appdev.furluv.pacanag3.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public List<PostEntity> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/{id}")
    public PostEntity getPostById(@PathVariable Long id) {
        return postService.getPostById(id);
    }

    @PostMapping
    public PostEntity createPost(@RequestBody PostEntity post) {
        return postService.createPost(post);
    }

    @PutMapping("/{id}")
    public PostEntity updatePost(@PathVariable Long id, @RequestBody PostEntity post) {
        return postService.updatePost(id, post);
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable Long id) {
        postService.deletePost(id);
    }
}
