package com.namhee.payment.entity;

import com.namhee.payment.lang.InOutType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="PAYMENT_LOG")
public class PaymentLog {
    @Id
    @GeneratedValue
    int pay_log_id;

    int acnt_pay_id;

    @Enumerated(EnumType.STRING)
    InOutType in_out_type;

    int amount;

    int vat_amount;

    @Temporal(TemporalType.TIMESTAMP)
    Date created_at;

    @Temporal(TemporalType.TIMESTAMP)
    Date updated_at;
}

