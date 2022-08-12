package com.zerobase.convpay.service;

import com.zerobase.convpay.type.MoneyUseCancelResult;
import com.zerobase.convpay.type.MoneyUseResult;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyAdaptorTest {
    MoneyAdaptor moneyAdaptor = new MoneyAdaptor();

    @Test
    void money_use_fail() {
        //given
        Integer payAmount = 1000_001;

        //when
        MoneyUseResult moneyUseResult = moneyAdaptor.use(payAmount);

        //then
        assertEquals(moneyUseResult, MoneyUseResult.USE_FAIL);
    }

    @Test
    void money_use_success() {
        //given
        Integer payAmount = 1000_000;

        //when
        MoneyUseResult moneyUseResult = moneyAdaptor.use(payAmount);

        //then
        assertEquals(moneyUseResult, MoneyUseResult.USE_SUCCESS);
    }

    @Test
    void money_use_cancel_fail() {
        //given
        Integer payCancelAmount = 99;

        //when
        MoneyUseCancelResult moneyUseCancelResult = moneyAdaptor.useCancel(payCancelAmount);

        //then
        assertEquals(MoneyUseCancelResult.MONEY_USE_CANCEL_FAIL, moneyUseCancelResult);
    }

    @Test
    void money_use_cancel_success() {
        //given
        Integer payCancelAmount = 101;

        //when
        MoneyUseCancelResult moneyUseCancelResult = moneyAdaptor.useCancel(payCancelAmount);

        //then
        assertEquals(MoneyUseCancelResult.MONEY_USE_CANCEL_SUCCESS, moneyUseCancelResult);
    }
}