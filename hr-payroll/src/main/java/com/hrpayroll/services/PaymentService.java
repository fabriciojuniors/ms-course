package com.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long workerId, Integer days) {
		return new Payment("José", 150.0, days);
	}
}
