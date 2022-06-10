package com.rupesh_mandal.user_service.service.impl;

import com.rupesh_mandal.user_service.dto.Department;
import com.rupesh_mandal.user_service.dto.ResponseMessage;
import com.rupesh_mandal.user_service.dto.ResponseTemplateDTO;
import com.rupesh_mandal.user_service.entity.UserEntity;
import com.rupesh_mandal.user_service.repository.UserRepository;
import com.rupesh_mandal.user_service.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    UserRepository userRepository;

    @Override
    public ResponseEntity<ResponseMessage> addUser(UserEntity userEntity) {
        userEntity.setUserID(null);
        userRepository.save(userEntity);
        log.info("Saving user");
        return new ResponseEntity<>(new ResponseMessage("Successfully Created"), HttpStatus.OK);
    }

    @Override
    public List<UserEntity> getAllUser() {
        log.info("gettin all user");
        return userRepository.findAll();
    }

    @Override
    public UserEntity getUserForUserId(Long userId) {
        log.info("getting " +userId+ "user");
        return userRepository.findById(userId).get();
    }

    @Override
    public ResponseTemplateDTO getUserWithDepartment(Long userId) {
        UserEntity userEntity=userRepository.findById(userId).get();
        log.info("getting " +userId+ "user");
        Department department=restTemplate.getForObject("http://API-GATEWAY/department/get/"+userEntity.getDepartmentId(),Department.class);
        return new ResponseTemplateDTO(userEntity,department);
    }
}
