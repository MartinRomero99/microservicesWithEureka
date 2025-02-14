package com.tdceureka.posts_service.controller;

import com.tdceureka.posts_service.model.Post;
import com.tdceureka.posts_service.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private IPostService postServ;

    @Value("${server.port}")
    private int serverPort;

    @GetMapping("/{user_id}")
    public List<Post> getPostByUserId(@PathVariable Long user_id){
        System.out.println("----------- Working in port: " + serverPort);
        return postServ.getPostByUser(user_id);
    }
}
