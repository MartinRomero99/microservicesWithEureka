package com.tdceureka.users_service.service;

import com.tdceureka.users_service.dto.UserDTO;

public interface IUserService {
    public UserDTO getUserAndPosts(Long user_id);
}
