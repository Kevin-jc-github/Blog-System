package com.springboot.blog.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Set;

@Data
public class PostDto {
    private Long id;

    @NotEmpty
    @Size(min = 2, message = "Post title should have at least 2 characters")
    private String title;
    @NotEmpty
    @Size(min = 10, message = "Post description should have at least 10 characters")
    private String description;
    @NotEmpty
    private String content;
    private Set<CommentDto> comments;
<<<<<<< HEAD
=======

    private Long categoryId;

>>>>>>> 5f653ff (update with JWT function)
}
