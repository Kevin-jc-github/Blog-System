package com.springboot.blog.controller;

import com.springboot.blog.dto.PostDto;
import com.springboot.blog.dto.PostResponse;
import com.springboot.blog.entity.Post;
import com.springboot.blog.service.PostService;
<<<<<<< HEAD
=======
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.springboot.blog.utils.AppConstants.*;

@RestController
@RequestMapping("/api/posts")
<<<<<<< HEAD
=======
@Tag(
        name = "CRUD REST APIs for Post Resources"
)
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

<<<<<<< HEAD
=======
    @Operation(
            summary = "Create Post REST API",
            description = "Create Post REST API is used to save post into database"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http Status 201 CREATED"
    )
    @SecurityRequirement(
            name = "Bear Authentication"
    )
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
    //create blog post
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public ResponseEntity<PostDto> createPost(@Valid @RequestBody PostDto postDto){
        return new ResponseEntity<>(postService.createPost(postDto), HttpStatus.CREATED);
    }

<<<<<<< HEAD
=======

    @Operation(
            summary = "Get All Post By Id REST API",
            description = "Get All posts REST API is used to get all the posts in database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http Status 200 SUCCESS"
    )
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
    //get all posts rest api
    @GetMapping
    public PostResponse getAllPosts(
            @RequestParam(value = "pageNo", defaultValue = DEFAULT_PAGE_NUMBER, required = false) int pageNo,
            @RequestParam(value = "pageSize", defaultValue = DEFAULT_PAGE_SIZE, required = false) int pageSize,
            @RequestParam(value = "sortBy", defaultValue = DEFAULT_SORT_BY, required = false) String sortBy,
            @RequestParam(value = "sortDir", defaultValue =  DEFAULT_SORT_DIREACTION, required = false) String sortDir
    ){
        return postService.getAllPosts(pageNo, pageSize,sortBy,sortDir);
    }

<<<<<<< HEAD
=======
    @Operation(
            summary = "GET Post By Id REST API",
            description = "Get post By Id REST API is used to get single post from database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http Status 200 SUCCESS"
    )
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
    //get post by id
    @GetMapping("/{id}")
    public ResponseEntity<PostDto> getPostById(@PathVariable("id") Long id){
        return ResponseEntity.ok(postService.getPostById(id));
    }

<<<<<<< HEAD
=======

    @Operation(
            summary = "Update Post By Id REST API",
            description = "Update post By Id REST API is used to update particular post in database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http Status 200 SUCCESS"
    )
    @SecurityRequirement(
            name = "Bear Authentication"
    )
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
    //update post by id
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/{id}")
    public ResponseEntity<PostDto> updatePost(@Valid @RequestBody PostDto postDto, @PathVariable("id") Long id){
        PostDto postResponse = postService.updatePost(postDto,id);
        return new ResponseEntity<>(postResponse, HttpStatus.OK);
    }

<<<<<<< HEAD
=======

    @Operation(
            summary = "Delete Post By Id REST API",
            description = "Delete post By Id REST API is used to update particular post in database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http Status 200 SUCCESS"
    )
    @SecurityRequirement(
            name = "Bear Authentication"
    )
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
    //Delete post by id
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost(@PathVariable("id") Long id){
        postService.DeletePostById(id);

        return new ResponseEntity<>("Post entity deleted success", HttpStatus.OK);
    }

<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
    //Build Get Posts by category REST API
    //http://localhost:8080/api/posts/category/3
    @GetMapping("/category/{id}")
    public ResponseEntity<List<PostDto>> getPostsByCategory(@PathVariable("id") Long categoryId){
        List<PostDto> postDtos = postService.getPostsByCategory(categoryId);
        return ResponseEntity.ok(postDtos);
    }

<<<<<<< HEAD
>>>>>>> 5f653ff (update with JWT function)
=======
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)

}