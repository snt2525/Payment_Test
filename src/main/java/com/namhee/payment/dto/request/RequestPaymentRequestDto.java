package com.namhee.payment.dto.request;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestPaymentRequestDto {

    @NotNull
    @Length(min = 10, max = 16)
    String card_number;

    @NotNull
    @Length(min = 4, max = 4)
    String validity;

    @NotNull
    @Length(min = 3, max = 3)
    String cvc;

    @NotNull
    @Range(min = 0, max = 12)
    int install_month;

    @NotNull
    @Range(min = 100, max = 1000000000)
    int amount;

    int vat_amount;
}
