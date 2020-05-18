package com.namhee.payment.dto.request;

import lombok.*;

import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CancelRequestDto {

    @NonNull
    @Size(min = 20, max = 20)
    String tid;

    @NonNull
    int cancel_amount;

    int cancel_vat_amount;
}
