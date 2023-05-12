// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.defincashier.models;

import com.aliyun.tea.*;

public class AmountItem extends TeaModel {
    // 余额，单位元
    @NameInMap("balance_amount")
    @Validation(required = true)
    public String balanceAmount;

    // 币种，CNY-人民币
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    public static AmountItem build(java.util.Map<String, ?> map) throws Exception {
        AmountItem self = new AmountItem();
        return TeaModel.build(map, self);
    }

    public AmountItem setBalanceAmount(String balanceAmount) {
        this.balanceAmount = balanceAmount;
        return this;
    }
    public String getBalanceAmount() {
        return this.balanceAmount;
    }

    public AmountItem setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

}
