// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class RefundDetail extends TeaModel {
    // 支出方账户ID，如果是支付宝：以2088开头的纯16位数字
    /**
     * <strong>example:</strong>
     * <p>2088101126765726</p>
     */
    @NameInMap("trans_out_account")
    public String transOutAccount;

    // 分账的金额，单位为分
    /**
     * <strong>example:</strong>
     * <p>990</p>
     */
    @NameInMap("amount")
    public Long amount;

    public static RefundDetail build(java.util.Map<String, ?> map) throws Exception {
        RefundDetail self = new RefundDetail();
        return TeaModel.build(map, self);
    }

    public RefundDetail setTransOutAccount(String transOutAccount) {
        this.transOutAccount = transOutAccount;
        return this;
    }
    public String getTransOutAccount() {
        return this.transOutAccount;
    }

    public RefundDetail setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

}
