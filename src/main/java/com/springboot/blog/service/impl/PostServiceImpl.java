package com.springboot.blog.service.impl;

import com.springboot.blog.dto.PostDto;
import com.springboot.blog.dto.PostResponse;
<<<<<<< HEAD
import com.springboot.blog.entity.Post;
import com.springboot.blog.exception.ResourceNotFoundException;
=======
import com.springboot.blog.entity.Category;
import com.springboot.blog.entity.Post;
import com.springboot.blog.exception.ResourceNotFoundException;
import com.springboot.blog.repository.CategoryRepository;
>>>>>>> 5f653ff (update with JWT function)
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

    public PostServiceImpl(PostRepository postRepository, ModelMapper mapper) {
        this.postRepository = postRepository;
        this.mapper = mapper;
=======
    private CategoryRepository categoryRepository;


    public PostServiceImpl(PostRepository postRepository,
                           ModelMapper mapper,
                           CategoryRepository categoryRepository) {

        this.postRepository = postRepository;
        this.mapper = mapper;
        this.categoryRepository = categoryRepository;

>>>>>>> 5f653ff (update with JWT function)
    }

    @Override
    public PostDto createPost(PostDto postDto) {

<<<<<<< HEAD
        //convert DTO to entity
        Post post = MapToEntity(postDto);
=======
        Category category = categoryRepository.findById(postDto.getCategoryId())
                .orElseThrow(() -> new ResourceNotFoundException("Category", "id", postDto.getCategoryId()));

        //convert DTO to entity
        Post post = MapToEntity(postDto);
        post.setCategory(category);
>>>>>>> 5f653ff (update with JWT function)
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
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
=======
        Category category = categoryRepository.findById(postDto.getCategoryId())
                        .orElseThrow(() -> new ResourceNotFoundException("Category","id", postDto.getCategoryId()));

        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        post.setCategory(category);
>>>>>>> 5f653ff (update with JWT function)

        Post updatedPost = postRepository.save(post);
        return MapToDTO(updatedPost);
    }

    @Override
    public void DeletePostById(Long id) {
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post","id",id));
        postRepository.delete(post);
    }

<<<<<<< HEAD
=======
    @Override
    public List<PostDto> getPostsByCategory(Long categoryId) {

        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new ResourceNotFoundException("Category","id", categoryId));

        List<Post> posts = postRepository.findByCategoryId(categoryId);

        return posts.stream().map((post) -> MapToDTO(post))
                .collect(Collectors.toList());
    }

>>>>>>> 5f653ff (update with JWT function)
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