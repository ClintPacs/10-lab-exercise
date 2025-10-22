package com.appdev.furluv.pacanag3.service;

import com.appdev.furluv.pacanag3.entity.PostEntity;
import com.appdev.furluv.pacanag3.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<PostEntity> getAllPosts() {
        return postRepository.findAll();
    }

    public PostEntity getPostById(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    public PostEntity createPost(PostEntity post) {
        return postRepository.save(post);
    }

    public PostEntity updatePost(Long id, PostEntity newPost) {
        PostEntity existing = postRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setContent(newPost.getContent());
            existing.setImage(newPost.getImage());
            return postRepository.save(existing);
        }
        return null;
    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
