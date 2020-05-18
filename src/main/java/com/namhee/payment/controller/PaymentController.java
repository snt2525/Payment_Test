package com.namhee.payment.controller;

import com.namhee.payment.dto.request.CancelRequestDto;
import com.namhee.payment.dto.request.RequestPaymentRequestDto;
import com.namhee.payment.struct.ResultJsonContainer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value= "/api/payment")
public class PaymentController {

    @PostMapping(value = "/request")
    public Object requestPayment(
            @RequestBody RequestPaymentRequestDto requestPaymentRequestDto
    ) throws Exception{
        return "";
    }

    @PostMapping(value = "/cancel")
    public Object cancelPayment(
            @RequestBody CancelRequestDto cancelRequestDto
    ) throws Exception{
        return "";
    }

    @GetMapping(value = "/order")
    @ResponseBody
    public ResultJsonContainer getOrderInfo(
            @RequestParam("tid") String tid
    ) throws Exception{
        return new ResultJsonContainer("");
    }

}
