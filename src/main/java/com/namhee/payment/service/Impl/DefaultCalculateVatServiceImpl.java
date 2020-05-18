package com.namhee.payment.service.Impl;

import com.namhee.payment.service.CalculateVatService;
import org.springframework.stereotype.Service;

@Service
public class DefaultCalculateVatServiceImpl implements CalculateVatService {

    private final static int VAT_AMOUNT_DIVIDED = 11;

    @Override
    public int calculateVat(int amount) {

        return  amount / VAT_AMOUNT_DIVIDED;

    }
}
