// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class OrderRepayStrategy extends TeaModel {
    // 还款期数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("term_index")
    public Long termIndex;

    // 每期应还租金(分)
    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("rental_money")
    public Long rentalMoney;

    // 每期应付时间
    /**
     * <strong>example:</strong>
     * <p>2024-10-21</p>
     */
    @NameInMap("pay_day")
    public String payDay;

    // 付款项目列表
    @NameInMap("payment_item_list")
    public java.util.List<PaymentItem> paymentItemList;

    // 是否无需履约
    /**
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("no_performance")
    public String noPerformance;

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

    public OrderRepayStrategy setPaymentItemList(java.util.List<PaymentItem> paymentItemList) {
        this.paymentItemList = paymentItemList;
        return this;
    }
    public java.util.List<PaymentItem> getPaymentItemList() {
        return this.paymentItemList;
    }

    public OrderRepayStrategy setNoPerformance(String noPerformance) {
        this.noPerformance = noPerformance;
        return this;
    }
    public String getNoPerformance() {
        return this.noPerformance;
    }

}
