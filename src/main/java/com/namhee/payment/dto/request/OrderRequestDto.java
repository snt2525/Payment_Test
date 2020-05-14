package com.namhee.payment.dto.request;

import lombok.*;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderRequestDto {
    @NonNull
    @Length(min = 20, max = 20)
    String tid;
}
