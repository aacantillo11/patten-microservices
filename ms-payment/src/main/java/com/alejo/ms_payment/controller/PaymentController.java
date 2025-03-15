package com.alejo.ms_payment.controller;

import com.alejo.ms_payment.model.Payment;
import com.alejo.ms_payment.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/payments")
@RequiredArgsConstructor
public class PaymentController {
    private final PaymentService paymentService;

    @GetMapping
    public List<Payment> getAllPayments(){
        return paymentService.getAllPayments();
    }

    @PostMapping
    public Payment processPayment(@RequestBody Payment payment) {
        return paymentService.processPayment(payment);
    }
}
