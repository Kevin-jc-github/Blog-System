package com.springboot.blog.service.impl;

import com.springboot.blog.dto.PostDto;
import com.springboot.blog.dto.PostResponse;
<<<<<<< HEAD
<<<<<<< HEAD
import com.springboot.blog.entity.Post;
import com.springboot.blog.exception.ResourceNotFoundException;
=======
=======
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
import com.springboot.blog.entity.Category;
import com.springboot.blog.entity.Post;
import com.springboot.blog.exception.ResourceNotFoundException;
import com.springboot.blog.repository.CategoryRepository;
<<<<<<< HEAD
>>>>>>> 5f653ff (update with JWT function)
=======
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
import com.springboot.blog.repository.PostRepository;
import com.springboot.blog.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    private ModelMapper mapper;

<<<<<<< HEAD
<<<<<<< HEAD

    public PostServiceImpl(PostRepository postRepository, ModelMapper mapper) {
        this.postRepository = postRepository;
        this.mapper = mapper;
=======
=======
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
    private CategoryRepository categoryRepository;


    public PostServiceImpl(PostRepository postRepository,
                           ModelMapper mapper,
                           CategoryRepository categoryRepository) {

        this.postRepository = postRepository;
        this.mapper = mapper;
        this.categoryRepository = categoryRepository;

<<<<<<< HEAD
>>>>>>> 5f653ff (update with JWT function)
=======
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
    }

    @Override
    public PostDto createPost(PostDto postDto) {

<<<<<<< HEAD
<<<<<<< HEAD
        //convert DTO to entity
        Post post = MapToEntity(postDto);
=======
=======
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
        Category category = categoryRepository.findById(postDto.getCategoryId())
                .orElseThrow(() -> new ResourceNotFoundException("Category", "id", postDto.getCategoryId()));

        //convert DTO to entity
        Post post = MapToEntity(postDto);
        post.setCategory(category);
<<<<<<< HEAD
>>>>>>> 5f653ff (update with JWT function)
=======
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
        Post newPost = postRepository.save(post);

        //convert entity to Dto
        PostDto postResponse = MapToDTO(newPost);

        return postResponse;
    }

    @Override
    public PostResponse getAllPosts(int pageNo, int pageSize, String sortBy,String sortDir) {

        //create Pageable instance
        Pageable pageable = PageRequest.of(pageNo,pageSize, Sort.by(sortBy));

        Page<Post> posts = postRepository.findAll(pageable);

        //get content for page object
        List<Post> lisfOfPosts = posts.getContent();

        List<PostDto> content = lisfOfPosts.stream().map(post -> MapToDTO(post)).collect(Collectors.toList());

        PostResponse postResponse = new PostResponse();
        postResponse.setContent(content);
        postResponse.setPageNo(posts.getNumber());
        postResponse.setPageSize(posts.getSize());
        postResponse.setTotalElements(posts.getTotalElements());
        postResponse.setTotalPages(posts.getTotalPages());
        postResponse.setLast(posts.isLast());

        return postResponse;
    }

    @Override
    public PostDto getPostById(Long id) {
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post","id",id));
        return MapToDTO(post);
    }

    @Override
    public PostDto updatePost(PostDto postDto, Long id) {
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post","id",id));

<<<<<<< HEAD
<<<<<<< HEAD
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
=======
=======
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
        Category category = categoryRepository.findById(postDto.getCategoryId())
                        .orElseThrow(() -> new ResourceNotFoundException("Category","id", postDto.getCategoryId()));

        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        post.setCategory(category);
<<<<<<< HEAD
>>>>>>> 5f653ff (update with JWT function)
=======
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)

        Post updatedPost = postRepository.save(post);
        return MapToDTO(updatedPost);
    }

    @Override
    public void DeletePostById(Long id) {
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post","id",id));
        postRepository.delete(post);
    }

<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
    @Override
    public List<PostDto> getPostsByCategory(Long categoryId) {

        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new ResourceNotFoundException("Category","id", categoryId));

        List<Post> posts = postRepository.findByCategoryId(categoryId);

        return posts.stream().map((post) -> MapToDTO(post))
                .collect(Collectors.toList());
    }

<<<<<<< HEAD
>>>>>>> 5f653ff (update with JWT function)
=======
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
    //convert entity to DTO
    private PostDto MapToDTO(Post post){
        PostDto postDto = mapper.map(post,PostDto.class);

        return postDto;
    }

    //convert Dto to Entity
    private Post MapToEntity(PostDto postDto){
        Post post = mapper.map(postDto,Post.class);
        return post;
    }
}