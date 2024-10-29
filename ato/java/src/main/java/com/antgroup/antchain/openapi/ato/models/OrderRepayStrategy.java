// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class OrderRepayStrategy extends TeaModel {
    // 还款期数
    @NameInMap("term_index")
    public Long termIndex;

    // 每期应还租金(分)
    @NameInMap("rental_money")
    public Long rentalMoney;

    // 每期应付时间
    @NameInMap("pay_day")
    public String payDay;

    public static OrderRepayStrategy build(java.util.Map<String, ?> map) throws Exception {
        OrderRepayStrategy self = new OrderRepayStrategy();
        return TeaModel.build(map, self);
    }

    public OrderRepayStrategy setTermIndex(Long termIndex) {
        this.termIndex = termIndex;
        return this;
    }
    public Long getTermIndex() {
        return this.termIndex;
    }

    public OrderRepayStrategy setRentalMoney(Long rentalMoney) {
        this.rentalMoney = rentalMoney;
        return this;
    }
    public Long getRentalMoney() {
        return this.rentalMoney;
    }

    public OrderRepayStrategy setPayDay(String payDay) {
        this.payDay = payDay;
        return this;
    }
    public String getPayDay() {
        return this.payDay;
    }

}
