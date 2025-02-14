package com.tdceureka.users_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long user_id;
    private String name;
    private String surname;
    private String cellphone;
    private List<PostDTO> PostList;
}
