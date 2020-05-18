package com.namhee.payment.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="PAYMENT_DETAIL")
public class PaymentDetail {
    @Id
    @GeneratedValue
    int acnt_detail_id;

    int acnt_pay_id;

    String card_number;

    String card_vaildity;

    String card_cvc;

    String installment_month;

    @Temporal(TemporalType.TIMESTAMP)
    Date created_at;

    @Temporal(TemporalType.TIMESTAMP)
    Date updated_at;
}
