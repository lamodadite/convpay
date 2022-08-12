package com.zerobase.convpay.dto;

import com.zerobase.convpay.type.PayResult;

public class PayResponse {
    // 결제 결과
    PayResult payResult;

    @Override
    public String toString() {
        return "PayResponse{" +
                "payResult=" + payResult +
                ", paidAount=" + paidAount +
                '}';
    }

    // 결제 성공 금액
    Integer paidAount;

    public PayResponse(PayResult payResult, Integer paidAount) {
        this.payResult = payResult;
        this.paidAount = paidAount;
    }

    public PayResult getPayResult() {
        return payResult;
    }

    public void setPayResult(PayResult payResult) {
        this.payResult = payResult;
    }

    public Integer getPaidAmount() {
        return paidAount;
    }

    public void setPaidAount(Integer paidAount) {
        this.paidAount = paidAount;
    }
}
