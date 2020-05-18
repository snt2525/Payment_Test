package com.namhee.payment.entity;

import javax.persistence.*;

@Entity
@Table(name="CARD_COMPANY")
public class CardCompany {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    int card_info_id;

    String card_info;

}
