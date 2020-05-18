package com.namhee.payment.service.Impl;

import com.namhee.payment.service.CalculateVatService;

public class DefaultCalculateVatServiceImpl implements CalculateVatService {

    @Override
    public int calculateVat(int amount) {
        int vat = 0;
        //결제 금액 / 11, 소수점 이하 반올림 ex)1000원일 경우에는 91원
        return vat;
    }
}
