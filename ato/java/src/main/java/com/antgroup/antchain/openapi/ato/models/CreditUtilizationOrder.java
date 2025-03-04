// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreditUtilizationOrder extends TeaModel {
    // 123
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 50, minLength = 6)
    public String orderId;

    // 订单用信额度，单位为分
    @NameInMap("order_credit_line")
    @Validation(required = true, minimum = 1)
    public Long orderCreditLine;

    // 订单商户应还金额，单位为分
    @NameInMap("order_merchant_repayment_money")
    @Validation(required = true, minimum = 1)
    public Long orderMerchantRepaymentMoney;

    // 分账起始日期
    @NameInMap("divide_start_term_index")
    @Validation(required = true, minimum = 1)
    public Long divideStartTermIndex;

    public static CreditUtilizationOrder build(java.util.Map<String, ?> map) throws Exception {
        CreditUtilizationOrder self = new CreditUtilizationOrder();
        return TeaModel.build(map, self);
    }

    public CreditUtilizationOrder setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreditUtilizationOrder setOrderCreditLine(Long orderCreditLine) {
        this.orderCreditLine = orderCreditLine;
        return this;
    }
    public Long getOrderCreditLine() {
        return this.orderCreditLine;
    }

    public CreditUtilizationOrder setOrderMerchantRepaymentMoney(Long orderMerchantRepaymentMoney) {
        this.orderMerchantRepaymentMoney = orderMerchantRepaymentMoney;
        return this;
    }
    public Long getOrderMerchantRepaymentMoney() {
        return this.orderMerchantRepaymentMoney;
    }

    public CreditUtilizationOrder setDivideStartTermIndex(Long divideStartTermIndex) {
        this.divideStartTermIndex = divideStartTermIndex;
        return this;
    }
    public Long getDivideStartTermIndex() {
        return this.divideStartTermIndex;
    }

}
