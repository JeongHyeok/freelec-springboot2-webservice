package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by JH on 2020-03-15
 */
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
