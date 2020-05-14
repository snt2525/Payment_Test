package com.namhee.payment.controller;

import com.namhee.payment.dto.RequestPaymentRequestDto;
import com.namhee.payment.utils.ResultJsonContainer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/api/payment")
public class paymentController {

    @PostMapping(value = "/request")
    public Object requestPayment(@RequestBody RequestPaymentRequestDto requestPaymentRequestDto) throws Exception{
        return new ResultJsonContainer(requestPaymentRequestDto);
    }

}
