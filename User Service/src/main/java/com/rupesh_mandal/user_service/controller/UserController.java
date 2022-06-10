package com.rupesh_mandal.user_service.controller;

import com.rupesh_mandal.user_service.dto.ResponseMessage;
import com.rupesh_mandal.user_service.dto.ResponseTemplateDTO;
import com.rupesh_mandal.user_service.entity.UserEntity;
import com.rupesh_mandal.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/add")
    ResponseEntity<ResponseMessage> addUser(@RequestBody UserEntity userEntity){
        return userService.addUser(userEntity);
    }

    @GetMapping("/get")
    List<UserEntity> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/get/{userId}")
    UserEntity getUserForUserId(@PathVariable("userId") Long userId){
        return userService.getUserForUserId(userId);
    }
    @GetMapping("/getWithDepartment/{userId}")
    ResponseTemplateDTO getUserWithDepartment(@PathVariable("userId") Long userId){
        return userService.getUserWithDepartment(userId);
    }


}
