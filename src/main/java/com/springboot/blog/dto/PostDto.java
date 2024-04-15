package com.springboot.blog.dto;

<<<<<<< HEAD
=======
import io.swagger.v3.oas.annotations.media.Schema;
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Set;

@Data
<<<<<<< HEAD
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
=======
@Schema(
        description = "PostDto Model Information"
)
public class PostDto {
    private Long id;

    @Schema(
            description = "Blog Post Title"
    )
    @NotEmpty
    @Size(min = 2, message = "Post title should have at least 2 characters")
    private String title;

    @Schema(
            description = "Blog Post Description"
    )
    @NotEmpty
    @Size(min = 10, message = "Post description should have at least 10 characters")
    private String description;

    @Schema(
            description = "Blog Post Content"
    )
    @NotEmpty
    private String content;

    private Set<CommentDto> comments;

    @Schema(
            description = "Blog Post Category Id"
    )
    private Long categoryId;

>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
}
