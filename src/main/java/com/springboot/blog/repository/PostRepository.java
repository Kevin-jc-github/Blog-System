package com.springboot.blog.repository;

import com.springboot.blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< HEAD
<<<<<<< HEAD
public interface PostRepository extends JpaRepository<Post,Long> {
=======
=======
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
import java.util.List;

public interface PostRepository extends JpaRepository<Post,Long> {

    List<Post> findByCategoryId(Long categoryId);

<<<<<<< HEAD
>>>>>>> 5f653ff (update with JWT function)
=======
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
}
