package com.rupesh_mandal.user_service.repository;

import com.rupesh_mandal.user_service.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long>  {
}
