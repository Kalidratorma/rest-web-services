package com.kalidratorma.rest.webservices.restfulwebservices.jpa;

import com.kalidratorma.rest.webservices.restfulwebservices.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
