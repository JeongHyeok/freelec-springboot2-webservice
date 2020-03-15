package com.jojoldu.book.springboot.domain.posts;

import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by JH on 2020-03-15
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    private PostsRepository postsRepository;

    @After
    public void cleanup(){
        postsRepository.deleteAll();
    }

    @Test
    public void getPostsData(){
        String title = "게시글 테스트";
        String content = "테스트 본문";

        postsRepository.save(Posts.builder().title(title).content(content).author("tes@test.com").build());

        List<Posts> postsList = postsRepository.findAll();

        System.out.println(postsList.toString());
        Posts post = postsList.get(0);
        Assertions.assertThat(post.getTitle()).isEqualTo(title);
        Assertions.assertThat(post.getContent()).isEqualTo("테스트 본문");
        //Posts posts = new Posts()
    }
}