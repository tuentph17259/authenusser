package com.example.authenusser.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.authenusser.entity.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity, Long>{

}
