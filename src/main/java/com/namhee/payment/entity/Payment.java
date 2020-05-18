package com.namhee.payment.entity;


import com.namhee.payment.lang.PaymentStatusType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="PAYMENT")
public class Payment {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    int acnt_pay_id;

    @OneToOne
    @JoinColumn(name="acnt_pay_id", insertable = false, updatable = false)
    PaymentDetail paymentDetail;

    @OneToMany
    @JoinColumn(name="acnt_pay_id", insertable = false, updatable = false)
    List<PaymentLog> paymentLog = new ArrayList<PaymentLog>();

    String tid;

    @Enumerated(EnumType.STRING)
    PaymentStatusType payment_status;

    int balance_amount;

    int balance_vat_amount;

    @Temporal(TemporalType.TIMESTAMP)
    Date created_at;

    @Temporal(TemporalType.TIMESTAMP)
    Date updated_at;
}
