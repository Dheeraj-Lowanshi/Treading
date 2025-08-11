package com.oriental.service;

import com.oriental.domain.VerificationType;
import com.oriental.modal.User;
import com.oriental.modal.VerificationCode;

public interface VerificationCodeService {

    VerificationCode sendVerificationCode(User user, VerificationType verificationType);

    VerificationCode getVerificationCodeById(Long id) throws Exception;

    VerificationCode  getVerificationCodeByUser(Long userId);



    void deleteVerificationCodeById(VerificationCode verificationCode);
}
