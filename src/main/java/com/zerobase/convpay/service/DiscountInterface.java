package com.zerobase.convpay.service;

import com.zerobase.convpay.dto.PayRequest;
import com.zerobase.convpay.type.PayResult;

public interface DiscountInterface {
    Integer getDiscountedAmount(PayRequest payRequest);
}
