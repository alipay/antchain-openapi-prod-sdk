// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class MultiCurrencyMoney extends TeaModel {
    // 金额，以分为单位
    @NameInMap("cent")
    @Validation(required = true)
    public Long cent;

    // 支付宝体系内一般存储币种值
    /**
     * <strong>example:</strong>
     * <p>156</p>
     */
    @NameInMap("currency_value")
    @Validation(required = true)
    public String currencyValue;

    public static MultiCurrencyMoney build(java.util.Map<String, ?> map) throws Exception {
        MultiCurrencyMoney self = new MultiCurrencyMoney();
        return TeaModel.build(map, self);
    }

    public MultiCurrencyMoney setCent(Long cent) {
        this.cent = cent;
        return this;
    }
    public Long getCent() {
        return this.cent;
    }

    public MultiCurrencyMoney setCurrencyValue(String currencyValue) {
        this.currencyValue = currencyValue;
        return this;
    }
    public String getCurrencyValue() {
        return this.currencyValue;
    }

}
