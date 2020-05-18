package com.namhee.payment.common.exception;


import com.namhee.payment.entity.PaymentErrorCode;
import com.namhee.payment.lang.HttpStatusCode;
import com.namhee.payment.struct.ResultJsonContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class CustomExceptionHandler {

    Logger logger = LoggerFactory.getLogger(CustomExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultJsonContainer exception (
            Exception exception,
            HttpServletRequest request,
            HttpServletResponse response
    ) {
        if( exception instanceof PaymentException ) {
            PaymentException paymentException = (PaymentException)exception;
            logger.error( paymentException.getMessage());
            paymentException.getResultJsonContainer();
        }

        return new ResultJsonContainer(
                HttpStatusCode.Internal_Server_Error,
                PaymentErrorCode.Unknown_Error.code,
                exception.toString()
        );
    }

}
