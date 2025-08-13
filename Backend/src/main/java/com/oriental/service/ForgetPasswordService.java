package com.oriental.service;

import com.oriental.domain.VerificationType;
import com.oriental.modal.ForgetPasswordToken;
import com.oriental.modal.User;

public interface ForgetPasswordService {

    ForgetPasswordToken createToken(
            User user,
            String id,
            String otp,
            VerificationType verificationType,
            String sendTo);

    ForgetPasswordToken findById(String id);

    ForgetPasswordToken findByUser(Long userId);

    void deleteToken(ForgetPasswordToken token);
}
