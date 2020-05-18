package com.namhee.payment.service.Impl;

import com.namhee.payment.common.exception.PaymentException;
import com.namhee.payment.entity.PaymentErrorCode;
import com.namhee.payment.lang.HttpStatusCode;
import com.namhee.payment.service.CalculateVatService;
import com.namhee.payment.service.VatService;
import org.springframework.stereotype.Service;

@Service
public class VatServiceImpl implements VatService {
    private final CalculateVatService calculateVatService;

    public VatServiceImpl(CalculateVatService calculateVatService){
        this.calculateVatService = calculateVatService;
    }

    @Override
    public int getVatAmount(int amount, String vatAmount) {
        int vatAmountAtoi = Integer.parseInt(vatAmount);

        isVaildVatAmount(amount, vatAmountAtoi);

        if(vatAmount == null) {
            vatAmountAtoi = getCalculateVat(amount);
        }

        return vatAmountAtoi;
    }

    @Override
    public void isVaildVatAmount(int amount, int vatAmount) {
        if(amount < vatAmount) {
            throw new PaymentException(HttpStatusCode.Bad_Request, PaymentErrorCode.Invaild_Vat_Amount);
        }
    }

    private int getCalculateVat(int amount) {
        return calculateVatService.calculateVat(amount);
    }
}
