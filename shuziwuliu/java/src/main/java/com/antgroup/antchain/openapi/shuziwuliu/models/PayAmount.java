// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class PayAmount extends TeaModel {
    // 支付金额（2位小数）
    /**
     * <strong>example:</strong>
     * <p>10000.00</p>
     */
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    // 支付方式
    /**
     * <strong>example:</strong>
     * <p>银行转账</p>
     */
    @NameInMap("pay_type")
    @Validation(required = true)
    public String payType;

    public static PayAmount build(java.util.Map<String, ?> map) throws Exception {
        PayAmount self = new PayAmount();
        return TeaModel.build(map, self);
    }

    public PayAmount setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public PayAmount setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

}
