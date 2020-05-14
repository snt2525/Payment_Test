package com.namhee.payment.dto.request;

import lombok.*;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CancelRequestDto {

    @NonNull
    @Length(min = 20, max = 20)
    String tid;

    @NonNull
    int cancel_amount;

    int cancel_vat_amount;
}
