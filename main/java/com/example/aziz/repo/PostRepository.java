package com.example.aziz.repo;

import com.example.aziz.models.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository  extends CrudRepository<Post, Long> {
//    Page<Post> findAll(Pageable pageable);
//    Page<Post> findByTag(String tag, Pageable pageable);
}
