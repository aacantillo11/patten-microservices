package com.alejo.ms_payment.service;

import com.alejo.ms_payment.model.Payment;
import com.alejo.ms_payment.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PaymentService {
    private final PaymentRepository paymentRepository;

    public List<Payment> getAllPayments(){
        return paymentRepository.findAll();
    }


    public Payment processPayment(Payment payment) {
        payment.setStatus("SUCCESS");
        return paymentRepository.save(payment);
    }
}
