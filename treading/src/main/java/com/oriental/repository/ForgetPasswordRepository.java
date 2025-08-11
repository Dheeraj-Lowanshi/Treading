package com.oriental.repository;

import com.oriental.modal.ForgetPasswordToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForgetPasswordRepository extends JpaRepository<ForgetPasswordToken,String> {
    ForgetPasswordToken findByUserId(Long userId);
}
