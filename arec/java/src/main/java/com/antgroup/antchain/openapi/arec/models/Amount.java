// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class Amount extends TeaModel {
    // 币种代码，如CNY代表人民币
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 币种金额，如200.00，人民币以元为单位，保留两位小数
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static Amount build(java.util.Map<String, ?> map) throws Exception {
        Amount self = new Amount();
        return TeaModel.build(map, self);
    }

    public Amount setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Amount setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
