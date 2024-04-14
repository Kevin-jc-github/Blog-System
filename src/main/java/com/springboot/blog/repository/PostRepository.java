package com.springboot.blog.repository;

import com.springboot.blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< HEAD
public interface PostRepository extends JpaRepository<Post,Long> {
=======
import java.util.List;

public interface PostRepository extends JpaRepository<Post,Long> {

    List<Post> findByCategoryId(Long categoryId);

>>>>>>> 5f653ff (update with JWT function)
}
