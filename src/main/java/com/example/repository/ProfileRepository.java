package com.example.repository;

import com.example.entity.ProfileEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProfileRepository extends CrudRepository<ProfileEntity,String>  {
    Optional<ProfileEntity> findByEmail(String username);

}
