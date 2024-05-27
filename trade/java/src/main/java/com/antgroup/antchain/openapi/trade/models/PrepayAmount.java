// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class PrepayAmount extends TeaModel {
    // 指定预付费金额
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    // 币种单位，CNY\USD等标准币种单位编码
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    public static PrepayAmount build(java.util.Map<String, ?> map) throws Exception {
        PrepayAmount self = new PrepayAmount();
        return TeaModel.build(map, self);
    }

    public PrepayAmount setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public PrepayAmount setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

}
