package com.rupesh_mandal.user_service.service;

import com.rupesh_mandal.user_service.dto.ResponseMessage;
import com.rupesh_mandal.user_service.dto.ResponseTemplateDTO;
import com.rupesh_mandal.user_service.entity.UserEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {


    ResponseEntity<ResponseMessage> addUser(UserEntity userEntity);
    List<UserEntity> getAllUser();
    UserEntity getUserForUserId(Long userId);

    ResponseTemplateDTO getUserWithDepartment(Long userId);


}
