package com.namhee.payment.entity;

public enum PaymentErrorCode {

    Invaild_Vat_Amount("Invaild_Vat_Amount"),
    Unknown_Error("Unknown_Error")
    ;

    public String code;

    PaymentErrorCode(String code) {
        this.code = code;
    }
}
