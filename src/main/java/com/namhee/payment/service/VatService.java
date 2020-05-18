package com.namhee.payment.service;

public interface VatService {

    public int getVatAmount(int amount, String vatAmount);

    public void isVaildVatAmount(int amount, int vatAmount);
}
