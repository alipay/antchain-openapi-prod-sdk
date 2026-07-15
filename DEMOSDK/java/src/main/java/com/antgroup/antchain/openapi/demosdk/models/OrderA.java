// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class OrderA extends TeaModel {
    // aa
    /**
     * <strong>example:</strong>
     * <p>a</p>
     */
    @NameInMap("aaa")
    public String aaa;

    public static OrderA build(java.util.Map<String, ?> map) throws Exception {
        OrderA self = new OrderA();
        return TeaModel.build(map, self);
    }

    public OrderA setAaa(String aaa) {
        this.aaa = aaa;
        return this;
    }
    public String getAaa() {
        return this.aaa;
    }

}
