// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demotmt.models;

import com.aliyun.tea.*;

public class PayOrderOpenApiResult extends TeaModel {
    // 11
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("test")
    @Validation(required = true)
    public String test;

    public static PayOrderOpenApiResult build(java.util.Map<String, ?> map) throws Exception {
        PayOrderOpenApiResult self = new PayOrderOpenApiResult();
        return TeaModel.build(map, self);
    }

    public PayOrderOpenApiResult setTest(String test) {
        this.test = test;
        return this;
    }
    public String getTest() {
        return this.test;
    }

}
