// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class SumBean extends TeaModel {
    // 1
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("a")
    public Long a;

    public static SumBean build(java.util.Map<String, ?> map) throws Exception {
        SumBean self = new SumBean();
        return TeaModel.build(map, self);
    }

    public SumBean setA(Long a) {
        this.a = a;
        return this;
    }
    public Long getA() {
        return this.a;
    }

}
