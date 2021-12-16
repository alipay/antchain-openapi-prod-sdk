// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class MultiCurrencyMoneyVO extends TeaModel {
    // amount
    @NameInMap("amt")
    @Validation(required = true)
    public String amt;

    // ccy
    @NameInMap("ccy")
    @Validation(required = true)
    public String ccy;

    public static MultiCurrencyMoneyVO build(java.util.Map<String, ?> map) throws Exception {
        MultiCurrencyMoneyVO self = new MultiCurrencyMoneyVO();
        return TeaModel.build(map, self);
    }

    public MultiCurrencyMoneyVO setAmt(String amt) {
        this.amt = amt;
        return this;
    }
    public String getAmt() {
        return this.amt;
    }

    public MultiCurrencyMoneyVO setCcy(String ccy) {
        this.ccy = ccy;
        return this;
    }
    public String getCcy() {
        return this.ccy;
    }

}
