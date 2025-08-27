// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PaymentItem extends TeaModel {
    // 付款金额，单位分
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("amount")
    public Long amount;

    // 付款项目类型
    /**
     * <strong>example:</strong>
     * <p>SCREEN_DAMAGE_INSURANCE</p>
     */
    @NameInMap("payment_type")
    public String paymentType;

    public static PaymentItem build(java.util.Map<String, ?> map) throws Exception {
        PaymentItem self = new PaymentItem();
        return TeaModel.build(map, self);
    }

    public PaymentItem setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public PaymentItem setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

}
