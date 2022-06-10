package com.rupesh_mandal.user_service.dto;

import com.rupesh_mandal.user_service.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateDTO {
    private UserEntity userEntity;
    private Department department;
}
