// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class Money extends TeaModel {
    // 金额，单位分
    @NameInMap("value")
    @Validation(required = true)
    public Long value;

    // 币种，暂只支持人民币CNY
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    public static Money build(java.util.Map<String, ?> map) throws Exception {
        Money self = new Money();
        return TeaModel.build(map, self);
    }

    public Money setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

    public Money setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

}
