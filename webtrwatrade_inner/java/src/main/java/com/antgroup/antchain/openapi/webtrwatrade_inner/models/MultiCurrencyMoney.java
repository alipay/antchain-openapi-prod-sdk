// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade_inner.models;

import com.aliyun.tea.*;

public class MultiCurrencyMoney extends TeaModel {
    // 金额，以分为单位
    @NameInMap("cent")
    @Validation(required = true)
    public String cent;

    // 币种编码
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 金额，以元为单位，保留2位小数
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    public static MultiCurrencyMoney build(java.util.Map<String, ?> map) throws Exception {
        MultiCurrencyMoney self = new MultiCurrencyMoney();
        return TeaModel.build(map, self);
    }

    public MultiCurrencyMoney setCent(String cent) {
        this.cent = cent;
        return this;
    }
    public String getCent() {
        return this.cent;
    }

    public MultiCurrencyMoney setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public MultiCurrencyMoney setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

}
