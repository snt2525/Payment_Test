package com.namhee.payment.common.exception;

import com.namhee.payment.entity.PaymentErrorCode;
import com.namhee.payment.lang.HttpStatusCode;
import com.namhee.payment.struct.ResultJsonContainer;

public final class PaymentException extends RuntimeException {

    private static final long serialVersionUID = 8880182541732395027L;

    private HttpStatusCode httpStatusCode;
    private String		   detailMessage;

    public PaymentException(
            HttpStatusCode httpStatusCode,
            PaymentErrorCode errorCode
    ) {
        super(errorCode.code);
        this.httpStatusCode	= httpStatusCode;
    }

    public PaymentException(
            HttpStatusCode httpStatusCode,
            PaymentErrorCode errorCode,
            String detailMessage
    ) {
        super(errorCode.code);
        this.httpStatusCode	= httpStatusCode;
        this.detailMessage = detailMessage;
    }

    public ResultJsonContainer getResultJsonContainer() {
        return new ResultJsonContainer(
                httpStatusCode,
                super.getMessage(),
                detailMessage
        );
    }

}
