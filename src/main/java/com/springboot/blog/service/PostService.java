package com.springboot.blog.service;

import com.springboot.blog.dto.PostDto;
import com.springboot.blog.dto.PostResponse;
import com.springboot.blog.entity.Post;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(Long id);

    PostDto updatePost(PostDto postDto, Long id);

    void DeletePostById(Long id);
<<<<<<< HEAD
<<<<<<< HEAD
=======

    List<PostDto> getPostsByCategory(Long categoryId);
>>>>>>> 5f653ff (update with JWT function)
=======

    List<PostDto> getPostsByCategory(Long categoryId);
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
}
