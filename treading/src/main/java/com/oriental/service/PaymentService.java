package com.oriental.service;

import com.oriental.domain.PaymentMethod;
import com.oriental.domain.PaymentOrderStatus;
import com.oriental.modal.PaymentOrder;
import com.oriental.modal.User;
import com.oriental.response.PaymentResponse;
import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;

public interface PaymentService {
    PaymentOrder createOrder(User user, Long amount, PaymentMethod paymentMethod);

    PaymentOrder getPaymentOrderById(Long id) throws Exception;

    Boolean proccedPaymentOrder(PaymentOrder paymentOrder,String paymentId) throws RazorpayException;

    PaymentResponse createRazorpayPaymentLing(User user, Long amount,Long orderId) throws RazorpayException;
    PaymentResponse createStripePaymentLing(User user, Long amount,Long orderId) throws StripeException;

}
